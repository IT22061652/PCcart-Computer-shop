package ads;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

import DBconnetion.DBconnection;


@WebServlet("/updateinvenory")
public class updateads extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ID = request.getParameter("id");
		String title = request.getParameter("title");
		String category = request.getParameter("category");
		String des = request.getParameter("description");
		
		double price = Double.parseDouble(request.getParameter("price"));
		

		
		
		
		try	{
			DBconnection db = DBconnection.getInstance();
	    	Connection	con = db.getCon();
		
			
			
			
			boolean isTrue;
			isTrue = Inventorydbutill.updateads(ID, title, category, des,price);
			
			
			if (isTrue == true) {
				
				
					RequestDispatcher dis = request.getRequestDispatcher("admin.inventory.jsp");
					request.setAttribute("status", "done");
				     dis.forward(request, response);
				} else {
					RequestDispatcher dis2 = request.getRequestDispatcher("");
					request.setAttribute("status", "failed");
					dis2.forward(request, response);
				}
				
				
				
				
			
	}catch (Exception e) {
		
		
		e.printStackTrace();
		
		
	}
	}

}
