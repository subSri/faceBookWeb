package pkg1;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

//if searchBox clicked
public class sendRequest {//aggregation from profile 
	jdbcCon j=new jdbcCon();
	profile prof;
	ResultSet r;
	
	sendRequest() throws Exception{
		j.getConn();
		prof=new profile();
	}
	
	 public void searchPeople(String srchid) throws Exception{
		
		 try {
	    r = j.stmt.executeQuery("select uid from userPass where username='"+srchid+"'");
	    MainPage.txtSearch.setText("Search");
	    
	    r.next();
	    if(r.getString(1) == null) {
	    	
	   	 JOptionPane.showMessageDialog(null, "No such user on Facebook", "Warning Message", JOptionPane.WARNING_MESSAGE );
	    }
	    else {
	    	 r = null;
	    	 r = j.stmt.executeQuery("select uid from userPass where username='"+srchid+"'");
	    	sendFRequest();
	    }
	   	    //panel.getLabel to be sent
	    //friends
	    }
	 catch(SQLException e) {
		 JOptionPane.showMessageDialog(null, "No such user on Facebook", "Warning Message", JOptionPane.WARNING_MESSAGE );
	 }
		/* try {
		 ResultSet rc=j.stmt.executeQuery("select fid from userFriend where uid='"+Main12.usr+"' and fid='"+fstr+"'");
		 }
		 catch(SQLException e) {
			 JOptionPane.showMessageDialog(null, "User is already friend of this account", "Warning Message", JOptionPane.WARNING_MESSAGE );
		 }*/
		 
	 }
	//Click on send request in searchBox
     public void sendFRequest() throws Exception {//userid aggregation
    	 
    	 String fd = null;
    	 try {
    		 
    	r.next();
    	fd=r.getString(1);
    	 ResultSet ru;
    	 
    	ru = j.stmt.executeQuery("select fid from userfriend where uid='"+Main12.usr+"' and fid='"+fd+"'");
    	ru.next();
    	ru.getString(1);
    	 JOptionPane.showMessageDialog(null, "This user is already your friend.", "Warning Message", JOptionPane.WARNING_MESSAGE );
   // 	j.stmt.executeUpdate("insert into notification values('"+fd+"','"+Main12.usr+"',1)");//reciever recieved
    	    	//object show Timeline
    	 }
    	 catch(Exception e) {

    		 j.stmt.executeUpdate("insert into notification values('"+fd+"','"+Main12.usr+"',1)");//reciever recieved
    		
    	 }
 
    	
    	//
    }
}
	
