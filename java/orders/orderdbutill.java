package orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import DBconnetion.DBconnection;


public class orderdbutill {
	

	
	public static boolean placeorder(String id, double tot,String title,String cusid){
    	boolean isSuccess = false;
    	
   
    	
    	try {
    		//Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","12345678");
    		DBconnection db = DBconnection.getInstance();
    	Connection	con = db.getCon();
    	//	stmt = ((Connection) con).createStatement();
    		
    		PreparedStatement pst=con.prepareStatement("insert into orders(Itemnam,total,orderdate,itemID,cusid) values (?,?,now(),?,?)");
    		
    		pst.setString(1, title);
    		pst.setDouble(2, tot);
    		pst.setString(3, id);
    		
    		pst.setString(4, cusid);
    		
    		
    	//	ArrayList<Inventoryorders> order = new ArrayList<> ();
    	//	Inventoryorders I = new Inventoryorders();
    	
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
	
	
	public static boolean cancelorder(String id) {
		
		boolean isSuccess = false;
		 
		try {
			DBconnection db = DBconnection.getInstance();
	    	Connection	con = db.getCon();
	    	PreparedStatement pst1=con.prepareStatement("DELETE FROM orders WHERE oid='"+id+"'");
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
public static boolean updatetracking(String id,String tracking) {
		
		boolean isSuccess = false;
		try{ 
			
			
			
			
			
			DBconnection db = DBconnection.getInstance();
	    	Connection	con = db.getCon();
			PreparedStatement pst=con.prepareStatement("UPDATE orders SET status='"+tracking+"'"+"WHERE oid='"+id+"'");
			
			
			
			
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

}
