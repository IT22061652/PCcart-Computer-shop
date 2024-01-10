package ads;

import java.sql.Connection;
import java.sql.PreparedStatement;

import DBconnetion.DBconnection;

public class Inventorydbutill {

	
	
	public static boolean publishads( String title, String description,
			String category,   Double price, String main_image) {
		boolean ItemInserted = true;

		try {

	   DBconnection db = DBconnection.getInstance();
	   Connection	con = db.getCon();
	   PreparedStatement pst = con.prepareStatement("INSERT INTO ads(title,category,description,image,price) values (?, ?, ?, ?, ?)");
	    	
	    	
			pst.setString(1, title);
			pst.setString(2, category);
			pst.setString(3, description);
			
			pst.setString(4, main_image);
			pst.setDouble(5, price);
		
			

			int rowCount = pst.executeUpdate();

			if (rowCount > 0) {
				ItemInserted = true;

			} else {
				ItemInserted = false;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return ItemInserted;
	}
	
	
	
	
	
public static boolean updateads(String id,String title,String cat,String des,double price) {
		
		boolean isSuccess = false;
		try{ 
			
			
			
			
			
			DBconnection db = DBconnection.getInstance();
	    	Connection	con = db.getCon();
			PreparedStatement pst=con.prepareStatement("UPDATE ads SET title='"+title+"',category='"+cat+"',description='"+des+"', price='"+price+"' WHERE ID='"+id+"'");
			
			
			
			
			int row=pst.executeUpdate();
   		 if(row>0) {
   			 isSuccess = true;
   		 }else {
   			 isSuccess = false;
   		 }
   		 
   		
   	}catch(Exception e) {
   		e.printStackTrace();
   	}
   	
   	return isSuccess;
	}	
	


public static boolean deleteads(String id) {
	
	boolean isSuccess = false;
	 
	try {
		DBconnection db = DBconnection.getInstance();
    	Connection	con = db.getCon();
    	PreparedStatement pst1=con.prepareStatement("DELETE FROM ads WHERE ID='"+id+"'");
    	int rs=pst1.executeUpdate();
    	
		if(rs>0) {
			isSuccess=true;
		}else {
			isSuccess = false;
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
	
}

}
