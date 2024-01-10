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


@WebServlet("/deletacc")
public class Deleteacc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		


		String id = request.getParameter("ID");
		
		try {
		DBconnection db = DBconnection.getInstance();
    	Connection	con = db.getCon();
    	PreparedStatement pst1=con.prepareStatement("DELETE FROM user WHERE userid='"+id+"'");
    	int rs=pst1.executeUpdate();

	
		if (rs>0) {

			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			request.setAttribute("status", "done2");
		     dis.forward(request, response);

			
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("useracc.jsp");
			request.setAttribute("status", "done2");
		     dis.forward(request, response);

		}
		
		
		
		
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
