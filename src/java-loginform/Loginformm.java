package project2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Loginformm implements ActionListener{
	
	JTextField textfield;
	JPasswordField passwordfield;
	JButton loginbutton;
	JLabel displayLabel2;
	
	public Loginformm(){
		JFrame jf=new JFrame("USER LOGIN FORM");
		jf.setLayout(null);
		jf.setBounds(600,100,500,400);
		jf.getContentPane().setBackground(Color.white);
		jf.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.red));
		jf.setVisible(true);
		
		JLabel displayLabel=new JLabel("USERNAME");
		displayLabel.setBounds(40,50,540,20);
		displayLabel.setBackground(Color.WHITE);
		displayLabel.setForeground(Color.RED);
		displayLabel.setFont(new Font("Calibiri", Font.BOLD,16));
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		JLabel displayLabel1=new JLabel("PASSWORD");
		displayLabel1.setBounds(40,120,540,20);
		displayLabel1.setBackground(Color.WHITE);
		displayLabel1.setForeground(Color.RED);
		displayLabel1.setFont(new Font("Calibiri", Font.BOLD,16));
		displayLabel1.setOpaque(true);
		jf.add(displayLabel1);
		
		displayLabel2=new JLabel();
		displayLabel2.setBounds(183,280,540,20);
		displayLabel2.setBackground(Color.WHITE);
		displayLabel2.setForeground(Color.green);
		displayLabel2.setFont(new Font("Calibiri", Font.BOLD,13));
		displayLabel2.setOpaque(true);
		jf.add(displayLabel2);
		
		textfield=new JTextField();
		textfield.setBounds(40,80,380,30);
		textfield.setBackground(Color.white);
		textfield.setBorder(new LineBorder(Color.red,2));
		textfield.setFont(new Font("Calibiri", Font.PLAIN,16));
		textfield.addActionListener(this);
		textfield.setOpaque(true);
		textfield.setVisible(true);
		jf.add(textfield);
		
		passwordfield=new JPasswordField();
		passwordfield.setBounds(40,150,380,30);
		passwordfield.setBackground(Color.white);
		passwordfield.setBorder(new LineBorder(Color.red,2));
		passwordfield.setFont(new Font("Calibiri", Font.PLAIN,16));
		passwordfield.addActionListener(this);
		passwordfield.setOpaque(true);
		jf.add(passwordfield);
		
		loginbutton=new JButton("LOGIN");
		loginbutton.setBounds(170,210,100,50);
		loginbutton.setBorder(new LineBorder(Color.red,2));
		loginbutton.setBackground(Color.white);
		loginbutton.setForeground(Color.red);
		loginbutton.setFont(new Font("Calibiri", Font.BOLD,16));
		loginbutton.addActionListener(this);
		jf.add(loginbutton);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}public static void main(String[] args) {
		new Loginformm(); 
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginbutton) {
			String username = textfield.getText();
			String password = passwordfield.getText();
			if(username.equals("admin") && password.equals("pass123")){
				  displayLabel2.setText("Login success");
				  displayLabel2.setForeground(Color.green);
				
		}else {
			displayLabel2.setText("Login failed");
			displayLabel2.setForeground(Color.red);}
}
	}
}
