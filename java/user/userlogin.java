package user;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBconnetion.DBconnection;

@WebServlet("/Userlogins1")
public class userlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname= request.getParameter("name");
		String pass = request.getParameter("password");
		jakarta.servlet.http.HttpSession session = request.getSession();
		
		

	try{ 
		
		
		
		
		
	//	Class.forName("com.mysql.cj.jdbc.Driver");
	//	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","12345678");
		DBconnection db = DBconnection.getInstance();
    	Connection	con = db.getCon();
		PreparedStatement pst=con.prepareStatement("SELECT * FROM user WHERE email='"+uname+"' AND password = '"+pass+"'");
		
		
		
		ResultSet row=pst.executeQuery();
		
		if (row.next()) {
			// navigate to another jsp page
			int id= row.getInt(1);
			String name = row.getString(2);
			
			String email = row.getString(3);
			String address =row.getString(4);
			String pass1 = row.getString(5);
			String contactNo = row.getString(6);
			
			
			
			request.getSession().setAttribute("cusID", id);
			request.getSession().setAttribute("name1", name);
		
			request.getSession().setAttribute("mail", email);
			request.getSession().setAttribute("pno", contactNo);
			request.getSession().setAttribute("add", address);
			request.getSession().setAttribute("pss", pass1);
			RequestDispatcher dis = request.getRequestDispatcher("loginhomejsp.jsp");
			request.setAttribute("status", "done");
		     dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("login.jsp");
			request.setAttribute("status", "failed");
			dis2.forward(request, response);
		}
		
	}catch (Exception e) {
		
		
		e.printStackTrace();
		
		
	}finally{
	}
		
	
		
		
		
		
		
	}

}
