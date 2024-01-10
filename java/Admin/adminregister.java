package Admin;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


@WebServlet("/adminregister")
public class adminregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
		
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
	
	
		//Connection con= null;
		
		
		
		
		
		
		
		
		try 
		{
			boolean isTrue;
			// calling insertMethod in customerDButil n assign this
			isTrue = AdminDButill.adminreg(name, email,pass);
			
			if(isTrue== true)
			{
				RequestDispatcher dis2 = request.getRequestDispatcher("adminlogin.jsp");
				request.setAttribute("status", "adddone");
				dis2.forward(request, response);
			}
			
			else
			{
				System.out.println("Failed to upload image.");
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
