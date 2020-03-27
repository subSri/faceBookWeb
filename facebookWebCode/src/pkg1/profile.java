package pkg1;


import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class profile {
    jdbcCon j= new jdbcCon();


	profile() throws Exception
	{
		
	}
	String user_id;
	profile(String id) throws Exception{
		j.getConn();
		this.user_id=id;
	}
	public void viewProfile() throws Exception {
		ResultSet r5=j.stmt.executeQuery("select uid,username,phoneno from userPass where uid='"+Main12.usr+"'");
		while(r5.next()) {
			//System.out.println(r5.getString(1)+" "+r5.getString(2));
		MainPage.lblUsername.setText(r5.getString(2));
		MainPage.lblPhoneNo.setText(r5.getString(3));
		MainPage.lblUserid.setText(r5.getString(1));
		
		}
		ResultSet rpath=j.stmt.executeQuery("select profpic from userPass where uid='"+Main12.usr+"'");
		while(rpath.next()) {

	    /*   ImageIcon MyImage = new ImageIcon(rpath.getString(1));
	        Image img = MyImage.getImage();
	        Image newImg = img.getScaledInstance(MainPage.lblNewLabel_13.getWidth(), MainPage.lblNewLabel_13.getHeight(), Image.SCALE_SMOOTH);
	        ImageIcon image = new ImageIcon(newImg);*/
	        //return image;*/
		//System.out.println(rpath.getString(1));
		MainPage.lblNewLabel_13.setIcon(new ImageIcon(rpath.getString(1)));
//		MainPage.lblNewLabel_13.setIcon(rpath);
		}
		MainPage.panelprof.setVisible(true);
	}
	
	public void enterProfile(String a,String b,String contact,String dob) throws SQLException {
		
		if( a.equalsIgnoreCase("")  ||  b.equalsIgnoreCase("") ||  contact.equalsIgnoreCase("") || dob.equalsIgnoreCase("")){
			//call dialog box for valid entry
			JOptionPane.showMessageDialog(frontPage.panel_1, "Please fill in all the details", "title", JOptionPane.WARNING_MESSAGE );
		}
		else {
			JOptionPane.showMessageDialog(frontPage.panel_1, "Successfully Created your account", "Message", JOptionPane.PLAIN_MESSAGE );
			JOptionPane.showMessageDialog(frontPage.panel_1, "Welcome in Our Facebook", "Message", JOptionPane.PLAIN_MESSAGE );

		}
		
	//	System.out.println(a+b+contact+dob);
	//	System.out.println(frontPage.path);
		String path12=null;
		if(frontPage.path!=null) {
			path12=(frontPage.path).replaceAll("\\\\","\\\\\\\\");
		}
		else {
			path12="";
		}
		//System.out.println(path12);
	String str = "insert into userPass values('"+a+"','"+b+"','"+contact+"','"+dob+"','"+path12+"')";
	j.stmt.executeUpdate("insert into userFriend values('"+a+"','"+a+"')");
	
	post.postnumber=1;
	j.stmt.executeUpdate(str);
	}
 
    
}

	
	//}

	/*
	public void changeName() {0
		//panel showing enter new Name
		//enter pasword
		//if password matched
		//update table set Name="textfield.getText() where User_id=user_id
	}
	
	
}*/
