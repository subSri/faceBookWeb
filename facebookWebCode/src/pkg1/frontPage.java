package pkg1;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*; 
import javax.imageio.ImageIO;

public class frontPage {
	static String path;
	static JFrame frame;
	static  JTextField txtEmail;
	static JButton btnNewButton;
	static JButton btnNewButton_1;
	static JPanel panel_1,panel;
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JPasswordField passwordField;
	static JPasswordField passwordField_1;
	static JLabel lblNewLabel;
	static JLabel lblName;
	static JLabel lblEmailid_1;
	static JLabel lblPhoneno;
	static JLabel lblPassword;
	static JLabel lblNewLabel_1 ,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4;
	static JLabel lblGender;
	static ButtonGroup bg;
	static JButton btnNewButton_2;
	static JRadioButton rdbtnMale ,rdbtnFemale,rdbtnOthers;
	static JButton btnNewButton_3;
	
	static JLabel lblEmailid ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontPage window = new frontPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public frontPage() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	private void initialize() throws Exception {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setBounds(0, 0,1600 , 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
																																																																														
																																						panel_1 = new JPanel();
																																						panel_1.setBounds(0, 0, 1550, 850);
																																						frame.getContentPane().add(panel_1);
																																						panel_1.setBackground(new Color(211, 211, 211));
																																						panel_1.setVisible(false);
																																						panel_1.setLayout(null);
																																						
																																					    textField = new JTextField();
																																					    textField.setForeground(Color.WHITE);
																																					    textField.setOpaque(false);
																																					    textField.setBounds(200, 188, 350, 50);
																																					    textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																					    panel_1.add(textField);
																																					    textField.setColumns(10);
																																					    
																																					    textField_1 = new JTextField();
																																					    textField_1.setForeground(Color.WHITE);
																																					    textField_1.setOpaque(false);
																																					    textField_1.setBounds(200, 291, 350, 50);
																																					    textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																					    panel_1.add(textField_1);
																																					    textField_1.setColumns(10);
																																					    
																																					    textField_2 = new JTextField();
																																					    textField_2.setForeground(Color.WHITE);
																																					    textField_2.setOpaque(false);
																																					    textField_2.setBounds(200, 388, 350, 50);
																																					    textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																					    panel_1.add(textField_2);
																																					    textField_2.setColumns(10);
																																					    
																																					    
																																					    btnNewButton_2 = new JButton("Sign Up");
																																					    btnNewButton_2.setForeground(Color.WHITE);
																																					    btnNewButton_2.setOpaque(true);
																																					    btnNewButton_2.setBounds(301, 734, 150, 50);
																																					    btnNewButton_2.setBackground(Color.GREEN);
																																					    //		btnNewButton_2.setBackground(new Color(240, 240, 240));
																																					    		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 28));
																																					    		btnNewButton_2.addActionListener(new Main12());//{
																																					    		
																																					    		btnNewButton_3 = new JButton("Upload Profile Picture");
																																					    		btnNewButton_3.addActionListener(new ActionListener() {
																																					    			public void actionPerformed(ActionEvent ex) {
																																					    				JFileChooser file = new JFileChooser();
																																					    				file.setCurrentDirectory(new File(System.getProperty("user.home")));
																																					    				//filter the files
																																					    				FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
																																					    				file.addChoosableFileFilter(filter);
																																					    				int result = file.showSaveDialog(null);
																																					    				 //if the user click on save in Jfilechooser
																																					    				if(result == JFileChooser.APPROVE_OPTION){
																																					    				    File selectedFile = file.getSelectedFile();
																																					    				    path = selectedFile.getAbsolutePath();
																																					    				  //  
																																					    				          }
																																					    				           //if the user click on save in Jfilechooser


																																					    				          else if(result == JFileChooser.CANCEL_OPTION){
																																					    				              System.out.println("No File Select");
																																					    				          }
																																					    				        
																																					    			
																																					    			}});
																																					    			
																																					    			
																																					    				  
																																					    	
																																								btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
																																					    		btnNewButton_3.setBackground(new Color(0, 255, 0));
																																					    		btnNewButton_3.setForeground(Color.WHITE);
																																					    		btnNewButton_3.setBounds(261, 654, 242, 50);
																																					    		panel_1.add(btnNewButton_3);
																																					    		
																																					    		passwordField_1 = new JPasswordField();
																																					    		passwordField_1.setForeground(Color.WHITE);
																																					    		passwordField_1.setOpaque(false);
																																					    		passwordField_1.setBounds(200, 482, 350, 50);
																																					    		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																					    		panel_1.add(passwordField_1);
																																					    		panel_1.add(btnNewButton_2);
																																					    		
																																					    		lblName = new JLabel("User ID ");
																																					    		lblName.setBounds(200, 163, 79, 25);
																																					    		lblName.setForeground(Color.white);
																																					    		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
																																					    		panel_1.add(lblName);
																																					    		
																																					    		lblEmailid_1 = new JLabel("Name ");
																																					    		lblEmailid_1.setBounds(200, 268, 79, 25);
																																					    		lblEmailid_1.setForeground(Color.white);
																																					    		lblEmailid_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
																																					    		panel_1.add(lblEmailid_1);
																																					    		
																																					    		lblPhoneno = new JLabel("Phone No.");
																																					    		lblPhoneno.setBounds(200, 361, 88, 25);
																																					    		lblPhoneno.setForeground(Color.white);
																																					    		lblPhoneno.setFont(new Font("Tahoma", Font.PLAIN, 18));
																																					    		panel_1.add(lblPhoneno);
																																					    		
																																					    		lblPassword = new JLabel("Password");
																																					    		lblPassword.setBounds(200, 459, 79, 25);
																																					    		lblPassword.setForeground(Color.white);
																																					    		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
																																					    		panel_1.add(lblPassword);
																																					    		
																																					    		rdbtnMale = new JRadioButton("Male");
																																					    		rdbtnMale.setOpaque(false);
																																					    		rdbtnMale.setForeground(Color.white);
																																					    		rdbtnMale.setBounds(199, 578, 80, 50);
																																					    		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 22));
																																					    		panel_1.add(rdbtnMale);
																																					    		
																																					    		rdbtnFemale = new JRadioButton("Female");
																																					    		rdbtnFemale.setOpaque(false);
																																					    		rdbtnFemale.setForeground(Color.white);
																																					    		rdbtnFemale.setBounds(313, 578, 104, 50);
																																					    		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 22));
																																					    		panel_1.add(rdbtnFemale);
																																					    		
																																					    		rdbtnOthers = new JRadioButton("Others");
																																					    		rdbtnOthers.setOpaque(false);
																																					    		rdbtnOthers.setFont(new Font("Tahoma", Font.PLAIN, 22));
																																					    		rdbtnOthers.setForeground(Color.white);
																																					    		rdbtnOthers.setBounds(450, 578, 100, 50);
																																					    		panel_1.add(rdbtnOthers);
																																					    		
																																					    		bg = new ButtonGroup();
																																					    		bg.add(rdbtnOthers);
																																					    		bg.add(rdbtnMale);
																																					    		bg.add(rdbtnFemale);
																																					    		
																																					    		lblGender = new JLabel("Gender");
																																					    		lblGender.setBounds(200, 559, 79, 25);
																																					    		lblGender.setForeground(Color.white);
																																					    		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
																																					    		panel_1.add(lblGender);
																																					    		
																																					    		lblNewLabel_2 = new JLabel("Create an account");
																																					    		lblNewLabel_2.setBounds(200, 29, 379, 83);
																																					    		lblNewLabel_2.setBackground(Color.BLUE);
																																					    		lblNewLabel_2.setForeground(Color.white);
																																					    		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 48));
																																					    		panel_1.add(lblNewLabel_2);
																																					    		
																																					    		lblNewLabel_3 = new JLabel("It's free and always will be.");
																																					    		lblNewLabel_3.setBounds(202, 84, 301, 73);
																																					    		lblNewLabel_3.setForeground(Color.white);
																																					    		lblNewLabel_3.setFont(new Font("Modern No. 20", Font.BOLD, 23));
																																					    		panel_1.add(lblNewLabel_3);
																																					    		
																																					    		lblNewLabel_4 = new JLabel("");
																																					    		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\SUBHAM\\Desktop\\fbb.jpg"));
																																					    		lblNewLabel_4.setBounds(-50, -80, 1600,930);
																																					    		panel_1.add(lblNewLabel_4);
																																						
																																																																												//		frame.setResizable(false);
																																																																															
																																																																														panel = new JPanel();
																																																																														panel.setBounds(0, 0, 1550, 850);
																																																																														frame.getContentPane().add(panel);
																																																																														panel.setForeground(new Color(0, 0, 0));
																																																																														panel.setBackground(new Color(220, 220, 220));
																																																																														panel.setLayout(null);
																																																																														
																																																																														txtEmail = new JTextField();
																																																																														txtEmail.setBounds(900, 150, 350, 50);
																																																																														txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																																																														//						txtEmail.setText("email");
																																																																																				panel.add(txtEmail);
																																																																																				txtEmail.setColumns(10);
																																																																																				
																																																																																				passwordField = new JPasswordField();
																																																																																				passwordField.setBounds(900, 280, 350, 50);
																																																																																				passwordField.setFont(new Font("Tahoma", Font.PLAIN, 25));
																																																																																				passwordField.setToolTipText("Enter your Password to login.");
																																																																																				panel.add(passwordField);
																																																																																				
																																																																																				btnNewButton = new JButton("Login");
																																																																																				btnNewButton.setForeground(Color.WHITE);
																																																																																				btnNewButton.setBackground(Color.GREEN);
																																																																																				btnNewButton.setBounds(1000, 390, 150, 50);
																																																																																				//						btnNewButton.setBackground(new Color(220, 220, 220));
																																																																																										btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
																																																																																										btnNewButton.addActionListener(new Main12());//new ActionListener()/{/////////////////////////////////////
																																																																																										panel.add(btnNewButton);
																																																																																										
																																																																																								
																																																																																										
																																																																																										lblEmailid = new JLabel("Email ID");
																																																																																										lblEmailid.setForeground(Color.WHITE);
																																																																																										lblEmailid.setBounds(900, 120, 106, 30);
																																																																																										lblEmailid.setFont(new Font("Tahoma", Font.BOLD, 20));
																																																																																										panel.add(lblEmailid);
																																																																																										
																																																																																										lblNewLabel = new JLabel("Password");
																																																																																										lblNewLabel.setForeground(Color.WHITE);
																																																																																										lblNewLabel.setBounds(900, 250, 106, 30);
																																																																																										lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
																																																																																										panel.add(lblNewLabel);
																																																																																										
																																																																																										btnNewButton_1 = new JButton("Create a New Account");
																																																																																										btnNewButton_1.setForeground(Color.WHITE);
																																																																																										btnNewButton_1.setBounds(900, 500, 350, 50);
																																																																																										btnNewButton_1.setBackground(Color.GREEN);
																																																																																										btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
																																																																																										btnNewButton_1.addActionListener(new ActionListener() {
																																																																																											public void actionPerformed(ActionEvent e) {
																																																																																												panel.setVisible(false);
																																																																																												panel_1.setVisible(true);		
																																																																																											}
																																																																																										});
																																																																																										panel.add(btnNewButton_1);
																																																																																										
																																																																																										lblNewLabel_1 = new JLabel("");
																																																																																										lblNewLabel_1.setLabelFor(lblNewLabel_1);
																																																																																										lblNewLabel_1.setBounds(0, 0, 1520,800);
																																																																																										lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SUBHAM\\Desktop\\fbpic.jpg"));
																																																																																										panel.add(lblNewLabel_1);

																																																																																											/*public void actionPerformed(ActionEvent e) {
																																																																																												//to check password and user name 
																																																																																												if(txtEmail.getText() != null &&  passwordField.getText() != null){
																																																																																													//call dialog box for valid entry && check in tables about existence 
																																																																																													JOptionPane.showMessageDialog(null, "Successfully Logeged In", "Message", JOptionPane.PLAIN_MESSAGE);
																																																																																													frame.dispose();
																																																																																												}
																																																																																												else {
																																																																																													//dialog box for error
																																																																																													JOptionPane.showMessageDialog(null, "Please fill in all the details", "Warning Message", JOptionPane.WARNING_MESSAGE );
																																																																																												}
																																																																																											}
																																																																																										});*/
																																									/*public void actionPerformed(ActionEvent e) {
																																										if( textField.getText()!= null &&  textField_1.getText()!= null && textField_2.getText()!=null && passwordField_1.getText()!=null && passwordField_1.getText().length()>5){
																																											//call dialog box for valid entry
																																											JOptionPane.showMessageDialog(null, "Successfully Created your account", "Message", JOptionPane.PLAIN_MESSAGE );
																																											JOptionPane.showMessageDialog(null, "Welcome in Our Facebook", "Message", JOptionPane.PLAIN_MESSAGE );
																																										}
																																										else {
																																											//dialog box for error
																																											JOptionPane.showMessageDialog(null, "Please fill in all the details", "Warning Message", JOptionPane.WARNING_MESSAGE );
																																										}
																																									}
																																								});*/
																																								
																																								//bg = new ButtonGroup();
																																								
//																																								//one button at a time 
																																							
	
	}
}
