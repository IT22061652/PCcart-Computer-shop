package user;

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

@WebServlet("/updatedetails1")
public class updatedetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String uid=request.getParameter("id");
		String uname = request.getParameter("name");
		
		String uemail = request.getParameter("email");
		String ucontact = request.getParameter("contact");
		String uaddress = request.getParameter("address");
		
		
		try{ 
			
			
			
			
			
			DBconnection db = DBconnection.getInstance();
	    	Connection	con = db.getCon();
			PreparedStatement pst=con.prepareStatement("UPDATE user SET name='"+uname+"',email='"+uemail+"',contactnum='"+ucontact+"',address='"+uaddress+"'"+"WHERE userid='"+uid+"'");
			
			PreparedStatement pst2=con.prepareStatement("SELECT * from user WHERE userid='"+uid+"'");
			
			
			int row=pst.executeUpdate(); 
			
			
			if (row>0) {
				
				//PreparedStatement pst2=con.prepareStatement("SELECT * from user WHERE ID='"+uid+"'");
				ResultSet row2=pst2.executeQuery();
				if (row2.next()) {
					// navigate to another jsp page
					//int id= row.getInt(1);
				int id= row2.getInt(1);
				String name = row2.getString(2);
				
				String email = row2.getString(3);
				String address =row2.getString(4);
				String pass1 = row2.getString(5);
				String contactNo = row2.getString(6);
				
				
				
				request.getSession().setAttribute("cusID", id);
				request.getSession().setAttribute("name1", name);
			
				request.getSession().setAttribute("mail", email);
				request.getSession().setAttribute("pno", contactNo);
				request.getSession().setAttribute("add", address);
				request.getSession().setAttribute("pss", pass1);
				
				// navigate to another jsp page
				jakarta.servlet.RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
				request.setAttribute("status", "done");
			dis.forward(request, response); }
			} else {
				jakarta.servlet.RequestDispatcher dis2 = request.getRequestDispatcher("index.jsp");
				dis2.forward(request, response);
			}
			
		}catch (Exception e) {
			
			
			e.printStackTrace();
			
			
		}finally {
		}
		
		
		
		
	}

}
