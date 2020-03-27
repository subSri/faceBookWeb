package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class post {
	jdbcCon j=new jdbcCon();
	static int lblnumber=3;
	profile prof;
	String post_id;
	public static int postnumber=1;
	public static MainPage obj1;
	//int count=0;
	
	post() throws Exception{
		j.getConn();
		prof=new profile();
	//	obj1=new MainPage();
	}
	/*public void setpostId(int count){
		
		this.post_id=prof.user_id+count;
	}
	
	public String getpostId(){
		return this.post_id;
	}*/
	
	
	public void addPost(String postData) throws Exception {
		
		ResultSet cnt=j.stmt.executeQuery("select count(postid) from userPost where uid='"+Main12.usr+"'");
		//System.out.println(getpostId());
		String ss = null;
		while(cnt.next()) {
		ss=Main12.usr+cnt.getString(1);
		}
		String ssss=null;
		if(Main12.path1!=null) {
		 ssss=(Main12.path1).replaceAll("\\\\","\\\\\\\\");
		}
		else {ssss="";}
		j.stmt.executeUpdate("insert into postIt values('"+ss+"',0,0,'"+postData+"','"+ssss+"')");
		j.stmt.executeUpdate("insert into userPost values('"+Main12.usr+"','"+ss+"')");
		
		MainPage.textArea.setText("");
		postnumber+=1;
		showTimeline(Main12.usr,Main12.pass);
		
		
	}
	
	public void viewNoti() throws Exception {
		
		ResultSet rr2 = j.stmt.executeQuery("select distinct recieverid,senderid,notiType from notification where recieverid='"+Main12.usr+"'");
		
		int u=1;
		while(u<=lblnumber-3){
    		    		rr2.next();
    		u=u+1;
    	}
		
    	int o=0;
    	
    	try {
    	while(rr2.next() && u<=lblnumber){
//    		System.out.println("Again "+rr2.getString(1)+" "+rr2.getString(2));
    		String srd = rr2.getString(2);
    		//System.out.println("Friend Request recieved from"+srd);
    		if(rr2.getInt(3)==1) {
    			MainPage.notiLabel[o].setText("Friend Request recieved from "+srd);
			}
			else if(rr2.getInt(3)==2){
				MainPage.notiLabel[o].setText("Like recieved from "+srd);
			}
			else if(rr2.getInt(3)==3){
				MainPage.notiLabel[o].setText("Comment recieved from "+srd);
			}
    		o+=1;
    		u+=1;
   
    	}
    	MainPage.panel_11.setVisible(true);
    	
    	}catch(Exception ew) {ew.printStackTrace();}
    	
	}
    	
	
	
	public void likePost(String postid) throws Exception {
		//we get post-id from front-end
		//System.out.println("likePost func");
		//ResultSet rc=j.stmt.executeQuery()
		
		
try {
			
		
		ResultSet rr1=j.stmt.executeQuery("select uid,plike from userPost Inner Join postIt on userPost.postid=postIt.pid where postid='"+postid+"'");
		if(rr1.next() ) {
			j.stmt.executeUpdate("insert into Notification values('"+rr1.getString(1)+"','"+Main12.usr+"',2)");//rr1.getString(1)
			j.stmt.executeUpdate("update postIt set plike=plike+1 where pid='"+postid+"'"); //take plike as  int'"+postid+"'"
		//	MainPage.pArr[0].lblNewLabel_5.setText(rr1.getString(2));
			showTimeline(Main12.usr,Main12.pass);
		}
}
catch(SQLException e) {
	 JOptionPane.showMessageDialog(null, "One user can like once", "Warning Message", JOptionPane.WARNING_MESSAGE );
}
	
		    	
	}
	
	public void displaycomment(String postid) throws IOException {
		
		try {
		String fileNa="C:\\Users\\SUBHAM\\Desktop\\"+postid+ ".txt";
		 FileInputStream inputStream = new FileInputStream(fileNa);
		 byte[] b1=inputStream.readAllBytes();
		 panel.textArea.setText("   Comments "+"\r\n");
		 String tem=new String(b1);
		panel.textArea.append(tem);
		
		    inputStream.close();
		   
		    MainPage.pArr[0].piclabel.setVisible(false);
		    
		    panel.visibArea = true;
		    panel.textArea.setVisible(true);
		    panel.scrollPane.setVisible(true);
		}
		catch(FileNotFoundException ep) {
			 JOptionPane.showMessageDialog(null, "No Comments for this post yet", "Warning Message", JOptionPane.WARNING_MESSAGE );
		}
	/*	File file = new File(fileNa);
		FileReader fr = null;
		try {
			fr = new FileReader(fileNa);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			while((line = br.readLine()) != null){
						//process the line
	//			MainPage.panelcmnt.setText(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
//		MainPage.panelcmnt.setVisible(true);
*/
	}
	
	public void commentPost(String postid,String cmntdata) throws Exception {
		System.out.println("hi");
		
		j.stmt.executeUpdate("update postIt set pcomment=pcomment+1 where pid='"+postid+"'");
		ResultSet rr=j.stmt.executeQuery("select uid from userPost where postid='"+postid+"'");
		rr.next();
		j.stmt.executeUpdate("insert into Notification values('"+rr.getString(1)+"','"+Main12.usr+"',3)");
		
		String fileN="C:\\Users\\SUBHAM\\Desktop\\" +postid+ ".txt";
		 FileOutputStream outputStream = new FileOutputStream(fileN,true);
		 String temp = Main12.usr+"\r\n";
		 	byte[] strToByt = temp.getBytes();
		    byte[] strToBytes = (cmntdata+"\r\n").getBytes();
		    outputStream.write(strToByt);
		    outputStream.write(strToBytes);
		
		    outputStream.close();
		//showTimeline(Main12.usr,Main12.pass);
		    
	}
	
	public void checkLogin(String userid,String passd) throws Exception {
		//MainPage.lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\SUBHAM\\Documents\\fb.jpg"));
		System.out.println("entered timeline");
		
		//error if user id and password are null 
		if(userid.equalsIgnoreCase("") ||  passd.equalsIgnoreCase("")){
			frontPage.frame.setVisible(true);
			JOptionPane.showMessageDialog(null, "Please fill in all the details",  "Warning Message", JOptionPane.WARNING_MESSAGE );
			//frontPage.frame.dispose();
		}
		int flag=0;
		ResultSet rrr=j.stmt.executeQuery("select uid from userPass ");//'"+userid+"'");
		while(rrr.next()) {
			if(userid.equals(rrr.getString(1)) ) {
				String stt= null;
				rrr.close();
				ResultSet r1=j.stmt.executeQuery("select password from userPass where uid='"+Main12.usr+"'");
				while(r1.next()) {
					stt = r1.getString(1);
				}
				if(passd.equals(stt)){
					flag=1;
					frontPage.frame.setVisible(true);
					JOptionPane.showMessageDialog(null, "Successfully Logged In", "Message", JOptionPane.PLAIN_MESSAGE);
					break;
				}
				else {
					frontPage.frame.setVisible(true);
					JOptionPane.showMessageDialog(null, "Password did not match.", "Warning Message", JOptionPane.WARNING_MESSAGE );
				}
			}
			
		}
		if(flag==1) {
			showTimeline(userid,passd);
//			MainPage.contentPane.setVisible(true);
		}
		else {
			frontPage.frame.setVisible(true);
			JOptionPane.showMessageDialog(null, "User id does not exist.", "Warning Message", JOptionPane.WARNING_MESSAGE );
		}
		
	}
	//	ResultSet r1=j.stmt.executeQuery("select password from userPass where uid='"+Main12.usr+"'");//'"+userid+"'");
		/*while(r1.next()) {
			System.out.println(r1.getString(1));
		}*/
		
		/*while(r2.next()) {
			System.out.println(r2.getString(1));
		}*/
	   
		//i {
			//open timeline panel
	public void showTimeline(String userid,String passd) throws Exception {
		  ResultSet r2=j.stmt.executeQuery("select username from userPass where uid='"+userid+"'");//'"+userid+"'");
		//System.out.println("entered below sql");
			
			String s1 = null;
			while(r2.next()) {
				//System.out.println();
				s1= r2.getString(1);
			}
			
			MainPage.lblNewLabel_4.setText(s1);
			 ResultSet r3=j.stmt.executeQuery("select uid,postid,plike,postData,postPic from userPost INNER JOIN postIt ON userPost.postid=postIt.pid where uid in(select fid from userFriend where uid='"+userid+"')");//'"+userid+"')");
			 int q1=1;
				
			   while(r3.next() && q1<=postnumber) {
				 //  System.out.println("changes       "+r3.getString(2)+"  postnumber   "+postnumber);
				   //MainPage.pArr[0].lblNewLabel_6.setText("clicked"+i);
			    	MainPage.pArr[0].lblNewLabel_6.setText(r3.getString(1));
			    	MainPage.pArr[0].lblNewLabel_2.setText(r3.getString(2));
					 MainPage.pArr[0].lblNewLabel_5.setText(r3.getString(3));
					 MainPage.pArr[0].lblNewLabel_3.setText(r3.getString(4));
					 MainPage.pArr[0].piclabel.setIcon(new ImageIcon(r3.getString(5)));//string table
					
					 q1=q1+1;
				}
//			   frontPage.frame.setVisible(false);
			   frontPage.frame.dispose();
			MainPage.contentPane.setVisible(true);
			//System.out.println("entered setVisible sql");
	
	//	}
		/*else {
			System.out.println("Enter right credentials");
		}*/
	/*}
		else
		{
			System.out.println("Login wrong");
		}*/
	}
}