package pkg1;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class panel {
	 public JLabel lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_5,lblNewLabel_6;
	static public JButton btnNewButton_1,btnNewButton_2,btnNewButton;
	 public JTextField txtToWriteCimment;
	static boolean visibArea = false;
	// public JPanel contentPane;
	 public JPanel panel;
	 public JLabel piclabel;
	 private JLabel lblNewLabel;
	 static JTextArea textArea;
	 public static JScrollPane scrollPane;
	 private JScrollBar scrollBar;
	public void initialize() throws Exception{
	
	
	panel = new JPanel();
	panel.setBackground(new Color(240, 240, 240));
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
	panel.setBounds(20, 300, 1460, 450);
	 panel.setLayout(null);
	
	 lblNewLabel_1 = new JLabel("Posted By :");
	 lblNewLabel_1.setBounds(26, 16, 129, 52);
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
	panel.add(lblNewLabel_1);
//	try with "" type null 
	 lblNewLabel_2 = new JLabel();
	 lblNewLabel_2.setBounds(1297, 16, 153, 52);
	 lblNewLabel_2.setBackground(Color.WHITE);
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	panel.add(lblNewLabel_2);
	
	 lblNewLabel_3 = new JLabel("This is my post");
	 lblNewLabel_3.setBounds(26, 117, 466, 275);
	 lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
	lblNewLabel_3.setFont(new Font("Segoe Script", Font.PLAIN, 30));
	panel.add(lblNewLabel_3);
	
	 btnNewButton_1 = new JButton("Like ");
	 btnNewButton_1.setBounds(26, 402, 173, 38);
	 btnNewButton_1.setForeground(Color.WHITE);
	 btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0)));
	 btnNewButton_1.setBackground(new Color(60,90,153));
	 btnNewButton_1.addActionListener(new Main12());
	 	
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
	panel.add(btnNewButton_1);
	
	 btnNewButton_2 = new JButton("Comment");
	 btnNewButton_2.setBounds(534, 402, 185, 38);
	 btnNewButton_2.addActionListener(new Main12());
	
	 btnNewButton_2.setForeground(Color.WHITE);
	 btnNewButton_2.setBackground(new Color(60,90,153));
	btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
	panel.add(btnNewButton_2);
	
	txtToWriteCimment = new JTextField();
	txtToWriteCimment.setBounds(728, 404, 601, 35);
	txtToWriteCimment.setFont(new Font("Tahoma", Font.PLAIN, 25));
	txtToWriteCimment.setText("   Leave a comment");
	panel.add(txtToWriteCimment);
	txtToWriteCimment.setColumns(10);
	
	 lblNewLabel_5 = new JLabel("count like");
	 lblNewLabel_5.setBounds(215, 400, 123, 32);
	lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
	panel.add(lblNewLabel_5);
	
	 lblNewLabel_6 = new JLabel();
	 lblNewLabel_6.setBounds(165, 23, 193, 38);
	lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
	panel.add(lblNewLabel_6);
	
	piclabel = new JLabel("");
	piclabel.setForeground(SystemColor.textHighlight);
	piclabel.setFont(new Font("Segoe Print", Font.BOLD, 25));
	piclabel.setBounds(534, 38, 449, 354);
	panel.add(piclabel);
	
	 btnNewButton = new JButton("Send");
	 btnNewButton.setBounds(1339, 405, 103, 36);
	 btnNewButton.addActionListener(new Main12());
	 
	 btnNewButton.setForeground(Color.WHITE);
	btnNewButton.setBackground(new Color(60,90,153));
	

			
		
	
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
	panel.add(btnNewButton);
	
	lblNewLabel = new JLabel("Post Id :");
	lblNewLabel.setBounds(1203, 17, 84, 52);
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
	panel.add(lblNewLabel);
	
	JLabel lblNewLabel_4 = new JLabel("Caption :");
	lblNewLabel_4.setBounds(26, 72, 103, 35);
	lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
	panel.add(lblNewLabel_4);
	
	textArea = new JTextArea();
	textArea.setBackground(new Color(60,90,153));
	textArea.setForeground(Color.WHITE);
	visibArea = false;
	textArea.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
//	textArea.append("	Comments");
	textArea.setEditable(false);
	textArea.setBounds(534, 38, 485, 354);
	
	
	scrollPane = new JScrollPane(textArea);
	scrollPane.setBounds(534, 36, 485, 354);
	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	
	/*textArea.add(scrollPane);*/
	/*scrollBar = new JScrollBar();
	scrollBar.setBounds(993, 38, 26, 354);
	textArea.add(scrollBar);*/
	panel.add(scrollPane);
	
	textArea.setVisible(false);
	scrollPane.setVisible(false);
	}
	


	public panel() throws Exception {
		initialize();
	}
}
