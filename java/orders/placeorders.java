package orders;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/placeorder1")
public class placeorders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String title = request.getParameter("tit");
		double tot = Double.parseDouble(request.getParameter("tot"));
	
		String cusid=request.getParameter("cusid");
		
		
		
		
		boolean isTrue;
		// calling insertMethod in customerDButil n assign this
		isTrue = orderdbutill.placeorder(id,tot,title,cusid);

		if (isTrue == true) {
			// navigate to another jsp page
			RequestDispatcher dis = request.getRequestDispatcher("shop.jsp");
			request.setAttribute("status", "done");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("");
			dis2.forward(request, response);
		}
	}

}
