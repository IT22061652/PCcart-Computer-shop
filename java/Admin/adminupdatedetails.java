package Admin;

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


@WebServlet("/adminupdatedetails")
public class adminupdatedetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String uname = request.getParameter("name1");
	
		String uemail = request.getParameter("email");
	
	try	{
		DBconnection db = DBconnection.getInstance();
    	Connection	con = db.getCon();
	
		PreparedStatement pst=con.prepareStatement("SELECT * from admin WHERE adminid='"+id+"'");
		
		
		boolean isTrue;
		isTrue = AdminDButill.updateadmin(id,uname,uemail);
		
		
		if (isTrue == true) {
			
			ResultSet row=pst.executeQuery();
			if (row.next()) {
				// navigate to another jsp page
				//int id= row.getInt(1);
				String fname = row.getString(2);
				
				String email = row.getString(3);
				
				
				request.getSession().setAttribute("cusID", id);
				request.getSession().setAttribute("name1", fname);
				
				request.getSession().setAttribute("mail", email);
				
				RequestDispatcher dis = request.getRequestDispatcher("adminaccount.jsp");
				request.setAttribute("status", "done");
			     dis.forward(request, response);
			} else {
				RequestDispatcher dis2 = request.getRequestDispatcher("useracc.jsp");
				request.setAttribute("status", "failed");
				dis2.forward(request, response);
			}
			
			
			
			
			RequestDispatcher dis = request.getRequestDispatcher("useracc.jsp");
			request.setAttribute("status", "done");
		dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("index.jsp");
			dis2.forward(request, response);
		}

}catch (Exception e) {
	
	
	e.printStackTrace();
	
	
}
	}

}
