package pkg1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.sql.SQLException;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.io.File;


import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main12 implements ActionListener {
	
		public static String usr;
		public static String pass;
		public static post po;
		static friends fr;
		static String path1;
		String cmntdata;
		
			@SuppressWarnings("deprecation")
			
			public void actionPerformed(ActionEvent x) {
				//System.out.println("Entered in main12 signup");
				
				try {
				
					
					//sign up button
					if(x.getSource()== frontPage.btnNewButton_2) {
						profile p=new profile(frontPage.textField.getText());
						

						try {
							p.enterProfile(frontPage.textField.getText(),  frontPage.textField_1.getText(), frontPage.textField_2.getText() , frontPage.passwordField_1.getText());
						} catch (SQLException e1) {}
						
				 	frontPage.panel_1.setVisible(false);
						frontPage.panel.setVisible(true);
					}
					//login button
					if(x.getSource()==frontPage.btnNewButton) {
						System.out.println("kjk");
						profile p=new profile(frontPage.txtEmail.getText());
						System.out.println("kjkjjh");
						//MainPage.panelprof.setVisible(false);
						usr = frontPage.txtEmail.getText();
						pass = frontPage.passwordField.getText();
						//post po = new post();
						
						try {
							post.obj1 = new MainPage();
							//MainPage.contentPane.setVisible(false);
							po.checkLogin(usr, pass);
						
						
						}catch(Exception e) {e.printStackTrace();}
					}
					//send Request
					if(x.getSource()==MainPage.btnNewButton_3) {
						sendRequest sr=new sendRequest();
						sr.searchPeople(MainPage.txtSearch.getText());
						//sr.sendFRequest();
					}
					//Add Post here
					if(x.getSource()==MainPage.btnNewButton) {
					//	post po = new post();
						
						po.addPost(MainPage.textArea.getText());
					}
					//Add Pic Post here
					if(x.getSource()==MainPage.upbutton) {
					//	post po = new post();
						
						JFileChooser file = new JFileChooser();
	    				file.setCurrentDirectory(new File(System.getProperty("user.home")));
	    				//filter the files
	    				FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
	    				file.addChoosableFileFilter(filter);
	    				int result1 = file.showSaveDialog(null);
	    				 //if the user click on save in Jfilechooser
	    				if(result1 == JFileChooser.APPROVE_OPTION){
	    				    File selectedFile = file.getSelectedFile();
	    				    path1 = selectedFile.getAbsolutePath();
	    				  //  
	    				          }
	    				           //if the user click on save in Jfilechooser


	    				          else if(result1 == JFileChooser.CANCEL_OPTION){
	    				              System.out.println("No File Select");
	    				          }
	    			//	po = new post();
	    			//	po.addPost(MainPage.textArea.getText());
	    				        
					}
					//likes panel
					if(x.getSource()==panel.btnNewButton_1) {
					//	post po=new post();
						System.out.println(MainPage.pArr[0].lblNewLabel_2.getText());
						po.likePost(MainPage.pArr[0].lblNewLabel_2.getText());
					}
					//comment display
					if(x.getSource()==panel.btnNewButton_2) {
					//	post po=new post();
						if(panel.visibArea == false) {
						po.displaycomment(MainPage.pArr[0].lblNewLabel_2.getText());
						}
						else {
							panel.visibArea = false;
							panel.textArea.setVisible(false);
							panel.scrollPane.setVisible(false);
							MainPage.pArr[0].piclabel.setVisible(true);
						}
					}
					//comment send
					if(x.getSource()==MainPage.pArr[0].btnNewButton) {
						//System.out.println("hihi");
						cmntdata=MainPage.pArr[0].txtToWriteCimment.getText();
						MainPage.pArr[0].txtToWriteCimment.setText("");
						po.commentPost(MainPage.pArr[0].lblNewLabel_2.getText(), cmntdata);
					}
	
					
					
					
				}catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
				//profile menu and timeline and friends menu
				static public void profilemouseClicked(MouseEvent m1) {
					
				//	if(m.==MainPage.mnProfile) {
					
						//MainPage.panelcmnt.setVisible(false);
						MainPage.panel_11.setVisible(false);
						MainPage.panelfriends.setVisible(false);
						profile p = null;
						try {
							p = new profile(Main12.usr);
							p.viewProfile();
						} catch (Exception e) {}
			}
				
	static	public void timemouseClicked(MouseEvent m) {
					//if(m.getSource()==MainPage.mnNewMenu) {
						MainPage.panelfriends.setVisible(false);
						MainPage.panelprof.setVisible(false);
						panel.textArea.setVisible(false);
						MainPage.panel_11.setVisible(false);
					}
		
	static	public void frndmouseClicked(MouseEvent m) {
					//if(m.getSource()==MainPage.mnFriends) {
					
						try {
							fr = new friends();
							
							//MainPage.panelcmnt.setVisible(false);
							MainPage.panel_11.setVisible(false);
							MainPage.panelprof.setVisible(false);
						
							fr.seeFriends();
						} catch (Exception e) {}
			}
					
	static	public void notimouseClicked(MouseEvent m) {
		//if(m.getSource()==MainPage.mnFriends) {
		
			try {
				MainPage.panelfriends.setVisible(false);
				MainPage.panelprof.setVisible(false);
				//MainPage.panelcmnt.setVisible(false);
		//	MainPage.panel_11.setVisible(false);
				po = new post();
				po.viewNoti();
			} catch (Exception eq) {}
}
		
		/*		//
				public void mouseReleased(MouseEvent m) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void mouseEntered(MouseEvent m) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void mouseExited(MouseEvent m) {
					// TODO Auto-generated method stub
					
				}
				public void mousePressed(MouseEvent m) {
					// TODO Auto-generated method stub
					
				}
			*/	//if signUp button clicked it is in database
				
				
			Main12() throws Exception{
				//System.out.println("Entered in const of main");
//				fp = new frontPage();
				po =new post();
			}
			

			public static void main(String[] args) throws Exception {

				
				//PROFIL
				}
			
			
			
			
			//Login
}
			
			
			/*
				//else if(e.getSource()==)
				
				//FRIENDS ACTION LISTENER
				//if friends button clicked
				friends f=new friends();
				f.seeFriends();
				f.acceptRequest(senderid);//sender id from panel
				
				
				//SEarch BUtton action listener
				sendRequest sr=new sendRequest();
				sr.searchPeople(searchBox.getText());
				sr.sendFRqst(serachBox.getText());
				
				//POST button
				post ps=new post();
				ps.showTimeline();
				//addPostButton
				ps.addPost();
			}
			}

		}*/
