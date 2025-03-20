package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	JLabel label,label1,label2 ;
	JTextField textField;
	JPasswordField password;
	JButton button1,button2,button3;
    Login() {
        super("Bank Management System");

        // Load bank.png
        URL bankImageUrl = getClass().getResource("/icon/bank.png");
        ImageIcon i1 = new ImageIcon(bankImageUrl);
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);
        
        // Load card.png
        URL cardImageUrl = getClass().getResource("/icon/card.png");
        ImageIcon ii1 = new ImageIcon(cardImageUrl);
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);
         label=new JLabel("WELCOME TO ATM");
         label.setForeground(Color.WHITE);
         label.setFont(new Font("AvantGrade",Font.BOLD,38));
         label.setBounds(230, 125,450,50);
         add(label);
         
         label1=new JLabel("Card No:");
         label1.setForeground(Color.WHITE);
         label1.setFont(new Font("Ralway",Font.BOLD,28));
         label1.setBounds(150, 190, 375, 30);
         add(label1);
         
         textField= new JTextField(15);
         textField.setBounds(325, 190, 230, 30);
         textField.setFont(new Font("Arial",Font.BOLD,14));
         add(textField);
         
         label2=new JLabel("PIN:");
         label2.setForeground(Color.white);
         label2.setFont(new Font("Ralway",Font.BOLD,28));
         label2.setBounds(150,250,373,30);
         add(label2);
         
         password=new JPasswordField(15);
         password.setBounds(325, 250, 230, 30);
         password.setFont(new Font("Arial",Font.BOLD,14));
         add(password);
         
         button1=new JButton("SIGN IN");
         button1.setFont(new Font("Arial",Font.BOLD,14));
         button1.setForeground(Color.white);
         button1.setBackground(Color.black);
         button1.setBounds(300, 300, 100, 30);
         button1.addActionListener(this);
         add(button1);
         
         button2=new JButton("CLEAR");
         button2.setFont(new Font("Arial",Font.BOLD,14));
         button2.setForeground(Color.white);
         button2.setBackground(Color.black);
         button2.setBounds(430, 300, 100, 30);
         button2.addActionListener(this);
         add(button2);
         
         button3=new JButton("SIGN UP");
         button3.setFont(new Font("Arial",Font.BOLD,14));
         button3.setForeground(Color.white);
         button3.setBackground(Color.black);
         button3.setBounds(300,350,230,30);
         button3.addActionListener(this);
         add(button3);
         
        URL backImageUrl = getClass().getResource("/icon/backbg.png");
        ImageIcon iii1 = new ImageIcon(backImageUrl);
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);
        

        // Frame settings
        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    	try {
    		if(e.getSource()==button1)
    		{
    			
    		}
    		else if(e.getSource()==button2)
    		{
    			
    		}
    		else if(e.getSource()==button3)
    		{
    			textField.setText("");
    			password.setText("");
    		}
    	}
    	catch(Exception E)
    	{
    		
    	}
    }
    public static void main(String[] args) {
        new Login();
    }
}
