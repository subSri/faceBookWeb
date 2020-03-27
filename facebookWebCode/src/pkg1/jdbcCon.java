package pkg1;
import java.sql.*;


public class jdbcCon{  
	Statement stmt;
	Connection con;
	public void getConn() throws Exception {
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newDb","root","2912");  
	//here sonoo is database name, root is username and password  
	stmt=con.createStatement();  
	//ResultSet rs=stmt.executeQuery("select * from students");   
	//con.close();  
	}catch(Exception e){ System.out.println(e);} 
	//System.out.println("connected");
	
	//return(con);
	
	}


    

   
    

}
