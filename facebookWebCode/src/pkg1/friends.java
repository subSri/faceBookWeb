package pkg1;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class friends {
	jdbcCon j=new jdbcCon();
	public static int friendnumber=5;
	public static int reqfriendnumber=5;
	
	profile prof;
	friends() throws Exception{
		j.getConn();
		prof=new profile();
	}
		
	public void acceptRequest(JLabel l1,JLabel l2) throws Exception {
		String senderid=l1.getText();
		try {
			j.stmt.executeUpdate("insert into userFriend values('"+Main12.usr+"','"+senderid+"')");
			j.stmt.executeUpdate("insert into userFriend values('"+senderid+"','"+Main12.usr+"')");
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "User is already your friend.",  "Warning Message", JOptionPane.WARNING_MESSAGE );
		}
		j.stmt.executeUpdate("delete from notification where senderid='"+senderid+"' and recieverid='"+Main12.usr+"' and NotiType=1");
		l1.setText("");
		l2.setText("");
		post p=new post();
    	p.showTimeline(Main12.usr,Main12.pass);
    	p.viewNoti();
    	MainPage.panel_11.setVisible(false);
    	
    	seeFriends();
	}
	public void seeFriends() throws Exception {
		
		ResultSet r6=j.stmt.executeQuery("select distinct fid,username,profpic from userFriend INNER JOIN userPass ON userFriend.fid=userPass.uid where userPass.uid in(select fid from userFriend where uid='"+Main12.usr+"' and fid!='"+Main12.usr+"')");//'"+prof.user_id+"')");
		
	//	Connection con = ResultSet r6=j.stmt.executeQuery("select * from userPost");
    	//System.out.println(" klsdjfs      "+friendnumber);
     
    	int l=1;
    	while(l<=friendnumber-5){
    		//System.out.println(r6.getString(1)+" "+friendnumber);
    		r6.next();
    		l=l+1;
    	}
    	
    	int i=0;
    	
    	try {
    	while(r6.next() && l<=friendnumber ){
    		//System.out.println("Again "+r6.getString(1)+" "+r6.getString(2));
    		
    		MainPage.labelfId[i].setText(r6.getString(1));
    		MainPage.labelfName[i].setText(r6.getString(2));
    		MainPage.pics[i].setIcon(new ImageIcon(r6.getString(3)));
    		i+=1;
    		l+=1;
   
    	}    	
    	}catch(Exception ew) {System.out.println(ew);}
    	
    	//display result2 set in panels along with accept reject for each row
		//userId from prof by aggregation)
		//select frnd_id from searchRel where uid=user_id
		//select fid from notification,searchRel where uid=user_id and searchRel.fid = Notification.fid and NoteType="Friend Request"
	
    	int k=1;
    	
    	ResultSet r7=j.stmt.executeQuery("select senderid,username from notification INNER JOIN userPass ON notification.senderid=userPass.uid where recieverid='"+Main12.usr+"' and senderid!='"+Main12.usr+"' and NotiType=1");
		
    /*	if(r7.next()==false) {
    		for(int as=1;as<=5;as++) {
    			MainPage.labelfrId[i].setText("");
        		MainPage.labelfrName[i].setText("");
        		
    		}
    	}*/
    	while(k<=reqfriendnumber-5) {
    		r7.next();
    		
    		k=k+1;
    	}
    	
    	
    	i=0;
    	
    	while(r7.next() && k<=reqfriendnumber) {
    		
    		MainPage.labelfrId[i].setText(r7.getString(1));
    		MainPage.labelfrName[i].setText(r7.getString(2));
    		
    		i+=1;
    		k+=1;

    		
    	}
    	//display result2 set in   
    	MainPage.panelfriends.setVisible(true);
 
	}

	
	
	
	
	
	
}
	

