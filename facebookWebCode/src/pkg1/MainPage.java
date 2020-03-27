package pkg1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.border.LineBorder;

import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class MainPage extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JPanel contentPane;
	static JTextField txtToWriteCimment;
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_3;
	static JTextField textField_4;
	static JTextField txtSearch;
	static JTextArea textArea;
	public CardLayout card ;
	static JPanel panels;
	static JLabel lblNewLabel_13;
	static JButton previousPost,nextPost;
//static JButton btnNewButton_1= new JButton();
	static JButton btnNewButton,btnNewButton_2,btnNewButton_3,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_2,button_1,button;
	static JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,label,label_1,label_2,label_3,label_4,label_5,label_6,label_7,label_8,label_9;
	static JLabel label_10,label_11,label_12,label_13,label_14,label_15,label_16,label_17,label_18,label_19;
	static JMenuBar menuBar;
	static JMenu mnProfile,mnFriends,mnNewMenu;
	public static panel[] pArr = new panel[1];

	static JPanel panelprof;
	static JPanel panelfriends;
	static JLabel lblPhoneNo;
	static JLabel lblUsername,lblUserid;
	static JLabel lblNewLabel_7;
	static JLabel lblNewLabel_8;
	static JPanel panel;
	static JButton button_10;
	
	//static JLabel[] labelfrId;  //20 22
	//static JLabel[]	LabelfrName;   //21 23 
	
	//static JLabel[] labelfId;  //20 22
	//1static JLabel[] LabelfName;  //21 23 

	static JPanel panel_1;
	static JButton button_11;
	

	static JLabel label_20 = new JLabel();
	static JLabel label_21 = new JLabel();
	static JLabel label_22 = new JLabel();
	static JLabel label_23 = new JLabel();
	static JLabel label_24 = new JLabel();
	static JLabel label_25 = new JLabel();
	static JLabel label_26 = new JLabel();
	static JLabel label_27 = new JLabel();	
	static JLabel label_28 = new JLabel();
	static JLabel label_29 = new JLabel();
	static JLabel label_30 = new JLabel();
	static JLabel lblXasasa = new JLabel();
	static JLabel label_32 = new JLabel();
	static JLabel lblQws = new JLabel();
	static JLabel label_34 = new JLabel();
	static JLabel label_35 = new JLabel();	
	static JLabel label_36 = new JLabel();
	static JLabel label_37 = new JLabel();
	static JLabel label_38 = new JLabel();
	static JLabel label_39 = new JLabel();
	static JLabel label_40 = new JLabel();
	static JLabel label_41 = new JLabel();
	static JLabel label_33 = new JLabel();
	static JLabel label_31 = new JLabel();
	static JLabel lblNewLabel_14 = new JLabel();
	
	static JLabel label_46=new JLabel();;
	static JLabel label_47=new JLabel();;
	 static JLabel label_48=new JLabel();;
	 static JLabel lblNotification=new JLabel();;
	static JButton button_15=new JButton();;
	static JPanel panel_2;
	static JButton button_12;

	 static JLabel labelfrId[] = {label_20, label_22 ,label_24 ,label_26 ,label_28};
	static  JLabel labelfrName[] = {label_21 , label_23 ,label_25 ,label_27 ,label_29};
	static JLabel notiLabel[]= {label_47, label_48, lblNotification};
	static  JLabel labelfId[] = {label_30, label_32 ,label_34 ,label_36 ,label_38};
	static  JLabel labelfName[] = {lblXasasa , lblQws ,label_35 ,label_37 ,label_39};
	/*JLabel labelfrId[] = {label_20, label_22 ,label_24 ,label_26 ,label_28};
	JLabel labelfrName[] = {label_21 , label_23 ,label_25 ,label_27 ,label_29};
	  JLabel notiLabel[]= {label_47, label_48, lblNotification};
	 JLabel labelfId[] = {label_30, label_32 ,label_34 ,label_36 ,label_38};
	  JLabel labelfName[] = {lblXasasa , lblQws ,label_35 ,label_37 ,label_39};*/
	
	static JLabel pics[] = {lblNewLabel_14,label_31,label_33,label_40,label_41};
	
	

	static JPanel panel_3;
	static JButton button_13;
	

	static JPanel panel_4;
	static JButton button_14;


	static JPanel panel_5;

	static JPanel panel_6;

	static JPanel panel_7;

	static JPanel panel_8;

	static JPanel panel_9;

	static JButton btnNewButton_4;
	static JButton btnMoreRequests;
	static JLabel lblNewLabel_9;
	static JButton upbutton;
	public static int q1;
	static JMenu mnNotification;
	static JPanel panel_11;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MainPage() throws Exception {
		
		
	for(int i=0;i<1;i++) {
			pArr[i]=new panel();
			//pArr[i].lblNewLabel_1.setText("Posted by "+i);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1550, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 		 
		
		 
		 
			contentPane.setLayout(null);
		 
		 
//		to add all panel with "panels" and then add panels with card layout object "card" 
		 card = new CardLayout();
		 
		 	panels = new JPanel(card);
		 	panels.setBounds(20, 300, 1460, 450);
		 	panels.setVisible(true);
		 	
		 	panel_11 = new JPanel();
		 	panel_11.setBounds(330, 71, 520, 447);
		 	contentPane.add(panel_11);
		 	panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		 	panel_11.setLayout(null);
		 	panel_11.setVisible(false);
		 	
		 	label_46 = new JLabel("My Notifications");
		 	label_46.setBounds(156, 10, 224, 73);
		 	label_46.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		 	panel_11.add(label_46);
		 	label_47.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	
	//	label_47 = new JLabel("New label");
		 	label_47.setBounds(36, 98, 445, 73);
		 	label_47.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	panel_11.add(label_47);
		 	label_48.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	
	//	label_48 = new JLabel("New label");
		 	label_48.setBounds(36, 181, 445, 73);
		 	label_48.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	panel_11.add(label_48);
		 	lblNotification.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	
	//	lblNotification = new JLabel("Notification1");
		 	lblNotification.setBounds(36, 268, 445, 73);
		 	lblNotification.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	panel_11.add(lblNotification);
		 	
		 	button_15 = new JButton("See More");
		 	button_15.setForeground(Color.WHITE);
		 	button_15.setBounds(183, 370, 153, 49);
		 	button_15.setBackground(new Color(60,90,153));
		 	button_15.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			post.lblnumber+=3;
		 	        	try {
		 	        	Main12.po.viewNoti();
		 	        	}catch(Exception e1) { }
		 		}
		 	});
		 	button_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	panel_11.add(button_15);
		 	
		 	panelfriends = new JPanel();
		 	panelfriends.setBounds(291, 88, 591, 623);
		 	contentPane.add(panelfriends);
		 	panelfriends.setForeground(new Color(0, 0, 0));
		 	panelfriends.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		 	panelfriends.setLayout(null);
		 	
		 	lblNewLabel_7 = new JLabel("My Friends");
		 	lblNewLabel_7.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		 	lblNewLabel_7.setBounds(66, 13, 185, 31);
		 	panelfriends.add(lblNewLabel_7);
		 	panelfriends.setVisible(false);
		 	
		 	lblNewLabel_8 = new JLabel("Friend Requests");
		 	lblNewLabel_8.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		 	lblNewLabel_8.setBounds(323, 15, 236, 26);
		 	panelfriends.add(lblNewLabel_8);
		 	
		 	panel = new JPanel();
		 	panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel.setLayout(null);
		 	panel.setBounds(291, 66, 279, 74);
		 	panelfriends.add(panel);
		 	
		 	button_10 = new JButton("Accept");
		 	button_10.setBackground(new Color(0, 153, 0));
		 	button_10.setForeground(Color.WHITE);
		 	
		 	
		 	button_10.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			try {
		 				Main12.fr.acceptRequest(label_20,label_21);
		 			
		 			} catch (Exception e1) {
		 		
		 			}
		 		}
		 	});
		 	button_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 	button_10.setBounds(151, 10, 118, 54);
		 	panel.add(button_10);
		 	
		 	//labeltype1[] = new JLabel("FrndId");
		 	// label_20 = new JLabel("frID");
		 	label_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_20.setBounds(10, 10, 65, 24);
		 	panel.add(label_20);
		 	
		 	// label_21 = new JLabel("FrndName");
		 	label_21.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_21.setBounds(10, 31, 191, 33);
		 	panel.add(label_21);
		 	

		 	panel_1 = new JPanel();
		 	panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel_1.setLayout(null);
		 	panel_1.setBounds(291, 164, 279, 74);
		 	panelfriends.add(panel_1);
		 	
		 	button_11 = new JButton("Accept");
		 	button_11.setBackground(new Color(0, 153, 0));
		 	button_11.setForeground(Color.WHITE);
		 	button_11.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			try {
		 				Main12.fr.acceptRequest(label_22,label_23);
		 			} catch (Exception e1) {
		 			}
		 		}
		 	});
		 	button_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 	button_11.setBounds(151, 10, 118, 54);
		 	panel_1.add(button_11);
		 	
		 	// label_22 = new JLabel("FrndId");
		 	label_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_22.setBounds(10, 10, 65, 24);
		 	panel_1.add(label_22);
		 	
		 	//// label_23 = new JLabel("FrndName");
		 	label_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_23.setBounds(10, 31, 191, 33);
		 	panel_1.add(label_23);
		 	
		 	panel_2 = new JPanel();
		 	panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel_2.setLayout(null);
		 	panel_2.setBounds(291, 262, 279, 74);
		 	panelfriends.add(panel_2);
		 	
		 	button_12 = new JButton("Accept");
		 	button_12.setBackground(new Color(0, 153, 0));
		 	button_12.setForeground(Color.WHITE);
		 	button_12.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			try {
		 				Main12.fr.acceptRequest(label_24,label_25);
		 			} catch (Exception e1) {
		 			}
		 		}
		 	});
		 	button_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 	button_12.setBounds(151, 10, 118, 54);
		 	panel_2.add(button_12);
		 	
		 	// label_24 = new JLabel("FrndId");
		 	label_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_24.setBounds(10, 10, 65, 24);
		 	panel_2.add(label_24);
		 	
		 	// label_25 = new JLabel("FrndName");
		 	label_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_25.setBounds(10, 31, 191, 33);
		 	panel_2.add(label_25);
		 	
		 	
		 	panel_3 = new JPanel();
		 	panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel_3.setLayout(null);
		 	panel_3.setBounds(291, 364, 279, 74);
		 	panelfriends.add(panel_3);
		 	
		 	button_13 = new JButton("Accept");
		 	button_13.setBackground(new Color(0, 153, 0));
		 	button_13.setForeground(Color.WHITE);
		 	button_13.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			try {
		 				Main12.fr.acceptRequest(label_26,label_27);
		 			} catch ( Exception e1) {
		 			}
		 		}
		 	});
		 	button_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 	button_13.setBounds(151, 10, 118, 54);
		 	panel_3.add(button_13);
		 	
		 	// label_26 = new JLabel("FrndId");
		 	label_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_26.setBounds(10, 10, 65, 24);
		 	panel_3.add(label_26);
		 	
		 	//label_27 = new JLabel("FrndName");
		 	label_27.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_27.setBounds(10, 31, 191, 33);
		 	panel_3.add(label_27);
		 	
		 	panel_4 = new JPanel();
		 	panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel_4.setLayout(null);
		 	panel_4.setBounds(291, 464, 279, 74);
		 	panelfriends.add(panel_4);
		 	
		 	button_14 = new JButton("Accept");
		 	button_14.setBackground(new Color(0, 153, 0));
		 	button_14.setForeground(Color.WHITE);
		 	button_14.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			try {
		 				Main12.fr.acceptRequest(label_28,label_29);
		 			} catch (Exception e1) {
		 			}
		 		}
		 	});
		 	button_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 	button_14.setBounds(151, 10, 118, 54);
		 	panel_4.add(button_14);
		 	
		 	//label_28 = new JLabel("FrndId");
		 	label_28.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_28.setBounds(10, 10, 65, 24);
		 	panel_4.add(label_28);
		 	
		 	// label_29 = new JLabel("FrndName");
		 	label_29.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_29.setBounds(10, 31, 191, 33);
		 	panel_4.add(label_29);
		 	
		 	panel_5 = new JPanel();
		 	panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel_5.setLayout(null);
		 	panel_5.setBounds(21, 66, 249, 74);
		 	panelfriends.add(panel_5);
		 	
	/// label_30 = new JLabel("FrndId");
		 	label_30.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_30.setBounds(92, 10, 65, 24);
		 	panel_5.add(label_30);
		 	
	//	 label_31 = new JLabel("FrndName");
		 	lblXasasa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	lblXasasa.setBounds(92, 31, 147, 33);
		 	panel_5.add(lblXasasa);
		 	
		 	// JLabel lblNewLabel_14 = new JLabel("New label");
		 	lblNewLabel_14.setBounds(10, 10, 65, 54);
		 	panel_5.add(lblNewLabel_14);
		 	
		 	panel_6 = new JPanel();
		 	panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel_6.setLayout(null);
		 	panel_6.setBounds(21, 164, 249, 74);
		 	panelfriends.add(panel_6);
		 	
	//	 label_32 = new JLabel("FrndId");
		 	label_32.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_32.setBounds(93, 10, 65, 24);
		 	panel_6.add(label_32);
		 	
	//	 label_33 = new JLabel("FrndName");
		 	lblQws.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	lblQws.setBounds(93, 31, 146, 33);
		 	panel_6.add(lblQws);
		 	
		 	// JLabel label_31 = new JLabel("New label");
		 	label_31.setBounds(10, 10, 65, 54);
		 	panel_6.add(label_31);
		 	
		 	panel_7 = new JPanel();
		 	panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel_7.setLayout(null);
		 	panel_7.setBounds(21, 262, 249, 74);
		 	panelfriends.add(panel_7);
		 	
		 	// label_34 = new JLabel("FrndId");
		 	label_34.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_34.setBounds(93, 10, 65, 24);
		 	panel_7.add(label_34);
		 	
		 	// label_35 = new JLabel("FrndName");
		 	label_35.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_35.setBounds(93, 31, 146, 33);
		 	panel_7.add(label_35);
		 	
		 	JLabel label_33_1 = new JLabel("");
		 	label_33_1.setBounds(10, 10, 65, 54);
		 	panel_7.add(label_33_1);
		 	
		 	
		 	panel_8 = new JPanel();
		 	panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel_8.setLayout(null);
		 	panel_8.setBounds(21, 364, 249, 74);
		 	panelfriends.add(panel_8);
		 	
		 	// label_36 = new JLabel("FrndId");
		 	label_36.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_36.setBounds(91, 10, 65, 24);
		 	panel_8.add(label_36);
		 	
		 	// label_37 = new JLabel("FrndName");
		 	label_37.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_37.setBounds(91, 31, 148, 33);
		 	panel_8.add(label_37);
		 	
		 	// JLabel label_40 = new JLabel("New label");
		 	label_40.setBounds(10, 10, 65, 54);
		 	panel_8.add(label_40);
		 	
		 	panel_9 = new JPanel();
		 	panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		 	panel_9.setLayout(null);
		 	panel_9.setBounds(21, 464, 249, 74);
		 	panelfriends.add(panel_9);
		 	
	//	 label_38 = new JLabel("FrndId");
		 	label_38.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_38.setBounds(92, 10, 65, 24);
		 	panel_9.add(label_38);
		 	
	//	 label_39 = new JLabel("FrndName");
		 	label_39.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 	label_39.setBounds(92, 31, 147, 33);
		 	panel_9.add(label_39);
		 	
		 	//JLabel label_41 = new JLabel("New label");
		 	label_41.setBounds(10, 10, 65, 54);
		 	panel_9.add(label_41);
		 	
		 			 
		 			 btnNewButton_4 = new JButton("More Friends");
		 			 btnNewButton_4.setForeground(Color.WHITE);
		 			btnNewButton_4.setBackground(new Color(60,90,153));
		 			 btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 			 btnNewButton_4.setBounds(86, 564, 129, 43);
		 			 panelfriends.add(btnNewButton_4);
		 			 btnNewButton_4.addActionListener(this);
		 			 
		 			 btnMoreRequests = new JButton("More Requests");
		 			btnMoreRequests.setBackground(new Color(60,90,153));
		 			 btnMoreRequests.setForeground(Color.WHITE);
		 			 btnMoreRequests.addActionListener(this);
		 			 
		 			 btnMoreRequests.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 			 btnMoreRequests.setBounds(358, 564, 139, 43);
		 			 panelfriends.add(btnMoreRequests);
		 	
		 	panelprof = new JPanel();
		 	panelprof.setBounds(30, 89, 386, 400);
		 	contentPane.add(panelprof);
		 	panelprof.setBackground(new Color(240, 240, 240));
		 	panelprof.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		 	panelprof.setVisible(false);
		 	panelprof.setLayout(null);
		 	
		 	lblUsername = new JLabel("Username");
		 	lblUsername.setBounds(39, 103, 239, 62);
		 	lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 	panelprof.add(lblUsername);
		 	
		 	lblUserid = new JLabel("userID");
		 	lblUserid.setBounds(39, 219, 259, 57);
		 	lblUserid.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 	panelprof.add(lblUserid);
		 	
		 	lblPhoneNo = new JLabel("phone no");
		 	lblPhoneNo.setBounds(39, 317, 259, 57);
		 	lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		 	panelprof.add(lblPhoneNo);
		 	
		 	lblNewLabel_9 = new JLabel("My Details");
		 	lblNewLabel_9.setBounds(121, 0, 144, 57);
		 	lblNewLabel_9.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		 	panelprof.add(lblNewLabel_9);
		 	
		 	JLabel lblNewLabel_10 = new JLabel("User Name:");
		 	lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		 	lblNewLabel_10.setBounds(39, 80, 109, 34);
		 	panelprof.add(lblNewLabel_10);
		 	
		 	JLabel lblNewLabel_11 = new JLabel("User ID:");
		 	lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		 	lblNewLabel_11.setBounds(39, 189, 88, 47);
		 	panelprof.add(lblNewLabel_11);
		 	
		 	JLabel lblNewLabel_12 = new JLabel("Contact :");
		 	lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		 	lblNewLabel_12.setBounds(39, 291, 96, 34);
		 	panelprof.add(lblNewLabel_12);
		 	
		 	 lblNewLabel_13 = new JLabel("");
		 	lblNewLabel_13.setSize(new Dimension(2, 6));
		 	lblNewLabel_13.setBounds(new Rectangle(7, 7, 4, 4));
		 	lblNewLabel_13.setBounds(169, 85, 190, 200);
		 	panelprof.add(lblNewLabel_13);
		 	contentPane.add(panels);
		
		 lblNewLabel = new JLabel("Username : ");
		 lblNewLabel.setBounds(30, 110, 220, 52);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		contentPane.add(lblNewLabel);
		 
		  lblNewLabel_4 = new JLabel();
		  lblNewLabel_4.setBounds(260, 110, 220, 52);
		 lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 35));
		 contentPane.add(lblNewLabel_4);
		
		 textArea = new JTextArea();
		 textArea.setBounds(20, 181, 1460, 100);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		textArea.setBackground(Color.WHITE);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 25));
		contentPane.add(textArea);
		
		
		 menuBar = new JMenuBar();
		 menuBar.setBounds(26, 21, 424, 40);
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 30));
		contentPane.add(menuBar);
		
		 mnProfile = new JMenu("Profile");
		 mnProfile.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent m1) {
		 		Main12.profilemouseClicked(m1);
		 	}
		 });
		 //mnProfile.addMouseListener(new Main12());
		 
		mnProfile.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnProfile);
		/*menuBar.addMouseListener(new MouseAdapter() {
			 	
			 	public void mouseClicked(MouseEvent m1) {
			 		Main12.profilemouseClicked(m1);
			 	}
			 });*/
		
		 mnNewMenu = new JMenu("Timeline");
		// mnNewMenu.addMouseListener(new Main12());
		 mnNewMenu.addMouseListener(new MouseAdapter() {
			 	
			 	public void mouseClicked(MouseEvent m1) {
			 		Main12.timemouseClicked(m1);
			 	}
			 });
		 
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnNewMenu);
		
		
		 mnFriends = new JMenu("Friends");
		 mnFriends.addMouseListener(new MouseAdapter() {
		 	
		 	public void mouseClicked(MouseEvent m1) {
		 		Main12.frndmouseClicked(m1);
		 	}
		 });
		// mnFriends.addMouseListener(new Main12());
		
		mnFriends.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnFriends);
		
		mnNotification = new JMenu("Notification");
	
		mnNotification.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		menuBar.add(mnNotification);
		mnNotification.addMouseListener(new MouseAdapter() {
		 	
		 	public void mouseClicked(MouseEvent m1) {
		 		Main12.notimouseClicked(m1);
		 		
		 	}
		 });
		
		txtSearch = new JTextField();
		txtSearch.setBounds(850, 21, 449, 40);
		txtSearch.setForeground(Color.LIGHT_GRAY);
		txtSearch.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtSearch.setText("search");
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		 btnNewButton_3 = new JButton("Send Request");
		 btnNewButton_3.setForeground(Color.WHITE);
		 btnNewButton_3.setBounds(1320, 21, 160, 40);
		 btnNewButton_3.setBackground(new Color(60,90,153));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new Main12());
		
		previousPost = new JButton("Previous");
		previousPost.setForeground(Color.WHITE);
		previousPost.setBounds(20, 760, 160, 41);
		previousPost.setBackground(new Color(0, 153, 0));
		previousPost.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(previousPost);
		
		nextPost = new JButton("Next");
		nextPost.setForeground(Color.WHITE);
		nextPost.setBounds(1331, 760, 149, 41);
		nextPost.setBackground(new Color(0, 153, 0));
		nextPost.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(nextPost);
		
		 btnNewButton = new JButton("Add Post");
		 btnNewButton.setForeground(Color.WHITE);
		 btnNewButton.setBounds(1209, 110, 110, 50);
		 btnNewButton.setBackground(new Color(0, 153, 0));
		 btnNewButton.addActionListener(new Main12());
		 
		 
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btnNewButton);
		
		upbutton = new JButton("Post a pic");
		upbutton.setForeground(Color.WHITE);
		upbutton.setBounds(1345, 110, 130, 50);
		upbutton.setBackground(new Color(0, 153, 0));
		upbutton.addActionListener(new Main12());
		
		
		upbutton.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(upbutton);


//		here  you have to write the class object at 'this' and use this 		

		nextPost.addActionListener(this);
		previousPost.addActionListener(this);
		for(int i=0;i<1;i++) {
			panels.add(pArr[i].panel,"panel"+i);
		}
		
		contentPane.setVisible(false);
		setVisible(true);
	
  }
	public void actionPerformed (ActionEvent e) {
        if (e.getSource() == previousPost){
        	//panel.textArea.setVisible(false);
		//	panel.scrollPane.setVisible(false);
        	post.postnumber-=1;
        	try {
        	pArr[0].piclabel.setText("");
        	Main12.po.showTimeline(Main12.usr , Main12.pass);
        	}catch(Exception e1) { }
         }	
		
		if (e.getSource() == nextPost){
			//panel.textArea.setVisible(false);
		//	panel.scrollPane.setVisible(false);
			post.postnumber+=1;
        	try {
        	pArr[0].piclabel.setText("");
        	Main12.po.showTimeline(Main12.usr , Main12.pass);
        	}catch(Exception e1) { }
		}
		if (e.getSource() ==btnNewButton_4 ){
			friends.friendnumber+=5;
        	try {
        	Main12.fr.seeFriends();
        	}catch(Exception e1) { }
		}
		if(e.getSource()== btnMoreRequests) {
			friends.reqfriendnumber+=5;
        	try {
        	Main12.fr.seeFriends();//also call after accept
        	}catch(Exception e1) { }
		}
	/*	if(e.getSource()==button_10 ) {
			
			
			try {
				Main12.fr.acceptRequest(label_20.getText());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	
		}
		if(e.getSource()==button_11 ) {
			
			
			try {
				Main12.fr.acceptRequest(label_22.getText());
		
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	
		}
		if(e.getSource()==button_12 ) {
			
			
			try {
				Main12.fr.acceptRequest(label_24.getText());
			} catch (Exception e1) {}
        	
		}
		//more friends
		if(e.getSource()==button_13 ) {
			
			
			try {
				Main12.fr.acceptRequest(label_26.getText());
			}
			catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	
		}
		//more requests
		if(e.getSource()==button_14 ) {
			
			
			try {
				Main12.fr.acceptRequest(label_28.getText());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	
		}*/
	
	}
}
/*
public void actionPerformed(ActionEvent e) {


    */