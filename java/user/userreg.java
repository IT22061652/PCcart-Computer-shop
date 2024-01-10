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

import DBconnetion.DBconnection;

@WebServlet("/userreg")
public class userreg extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String name = request.getParameter("name");
		
		String email = request.getParameter("email");
		String contactNo = request.getParameter("contact");
		String address = request.getParameter("address");
		String password = request.getParameter("password");

		

		

		try{ 
			
			DBconnection db = DBconnection.getInstance();
	    	Connection	con = db.getCon();
	    	
	    		
	    		PreparedStatement pst=con.prepareStatement("insert into user(name,email,address,password,contactnum) values (?,?,?,?,?)");
	    		
	    		pst.setString(1, name);
	    		pst.setString(2, email);
	    		pst.setString(3, address);
	    		pst.setString(4, password);
	    		pst.setString(5, contactNo);
	    		
	    		
			
			
		
	    		int row=pst.executeUpdate();
	    		 if(row>0) {
				RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
				
				dis.forward(request, response);
			
			} else {
				RequestDispatcher dis2 = request.getRequestDispatcher("login.jsp");
			
				dis2.forward(request, response);
			}
			
		}catch (Exception e) {
			
			
			e.printStackTrace();
			
			
		}finally{
		}


	}

}
