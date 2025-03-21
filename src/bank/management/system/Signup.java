package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
import javax.swing.JFrame;

import com.toedter.calendar.JDateChooser;

import java.util.*;

public class Signup extends JFrame implements ActionListener{
	Random ran=new Random();
	long first4=(ran.nextLong()%9000L)+1000L;
	String first=" "+Math.abs(first4);
	JTextField textName,textFname,textEmail,textMs,textAdd,textCity,textPin,textState; 
	JDateChooser dateChooser;
	JRadioButton r1,r2,m1,m2,m3;
	JButton next;
	Signup()
	{
		super("APPLICATION FORM");
		URL bankImageUrl = getClass().getResource("/icon/bank.png");
		ImageIcon i=new ImageIcon(bankImageUrl);
		Image i2 = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(25,10,100,100);
		add(image);
		
		JLabel label1=new JLabel("Application Form No:"+first);
		label1.setFont(new Font("Raleway",Font.BOLD,38));
		label1.setBounds(160,20,600,40);
		add(label1);
		
		JLabel label2=new JLabel("Page1");
		label2.setFont(new Font("Ralway",Font.BOLD,22));
		label2.setBounds(330,70,600,30);
		add(label2);
		
		JLabel label3=new JLabel("Personal Information");
		label3.setFont(new Font("Ralway",Font.BOLD,22));
		label3.setBounds(290,90,600,30);
		add(label3);
		
		JLabel labelName=new JLabel("Name:");
		labelName.setFont(new Font("Ralway",Font.BOLD,22));
		labelName.setBounds(100,190,100,30);
		add(labelName);
		
		textName=new JTextField();
		textName.setFont(new Font("Raleway",Font.BOLD,14));
		textName.setBounds(300,190,400,30);
		add(textName);
		
		JLabel labelFname=new JLabel("Father's Name:");
		labelFname.setFont(new Font("Ralway",Font.BOLD,22));
		labelFname.setBounds(100,240,200,30);
		add(labelFname);
		
		textFname=new JTextField();
		textFname.setFont(new Font("Raleway",Font.BOLD,14));
		textFname.setBounds(300,240,400,30);
		add(textFname);
		
		JLabel DOB=new JLabel("Date Of Birth");
		DOB.setFont(new Font("Ralway",Font.BOLD,22));
		DOB.setBounds(100,340,200,30);
		add(DOB);
		
		dateChooser=new JDateChooser();
		dateChooser.setForeground(new Color(105,105,105));
		dateChooser.setBounds(300,340,400,30);
		add(dateChooser);
		
		JLabel labelGender=new JLabel("Gender:");
		labelGender.setFont(new Font("Ralway",Font.BOLD,20));
		labelGender.setBounds(100,290,200,30);
		add(labelGender);
		
		r1=new JRadioButton("Male");
		r1.setFont(new Font("Ralway",Font.BOLD,14));
		r1.setBackground(new Color(222,255,228));
		r1.setBounds(300,290,60,30);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setFont(new Font("Ralway",Font.BOLD,14));
		r2.setBackground(new Color(222,255,228));
		r2.setBounds(450,290,90,30);
		add(r2);
		
		ButtonGroup buttongroup=new ButtonGroup();
		buttongroup.add(r1);
		buttongroup.add(r2); 
		
		JLabel labelEmail=new JLabel("Email Address:");
		labelEmail.setFont(new Font("Ralway",Font.BOLD,20));
		labelEmail.setBounds(100,390,200,30);
		add(labelEmail);
		
		textEmail=new JTextField();
		textEmail.setFont(new Font("Raleway",Font.BOLD,14));
		textEmail.setBounds(300,390,400,30);
		add(textEmail);
		
		JLabel labelMs=new JLabel("Marital Status:");
		labelMs.setFont(new Font("Ralway",Font.BOLD,20));
		labelMs.setBounds(100,440,200,30);
		add(labelMs);
		
		m1=new JRadioButton("Unmarried");
		m1.setFont(new Font("Ralway",Font.BOLD,14));
		m1.setBackground(new Color(222,255,228));
		m1.setBounds(300,440,100,30);
		add(m1);
		
		m2=new JRadioButton("Married");
		m2.setFont(new Font("Ralway",Font.BOLD,14));
		m2.setBackground(new Color(222,255,228));
		m2.setBounds(450,440,100,30);
		add(m2);
		
		m3=new JRadioButton("Other");
		m3.setFont(new Font("Ralway",Font.BOLD,14));
		m3.setBackground(new Color(222,255,228));
		m3.setBounds(600,440,100,30);
		add(m3);
		
		ButtonGroup buttongroup1=new ButtonGroup();
		buttongroup1.add(m1);
		buttongroup1.add(m2);
		buttongroup1.add(m3);
		
		JLabel labelAdd=new JLabel("Address:");
		labelAdd.setFont(new Font("Ralway",Font.BOLD,20));
		labelAdd.setBounds(100,490,200,30);
		add(labelAdd);
		
		textAdd=new JTextField();
		textAdd.setFont(new Font("Raleway",Font.BOLD,14));
		textAdd.setBounds(300,490,400,30);
		add(textAdd);
		
		JLabel labelCity=new JLabel("City:");
		labelCity.setFont(new Font("Ralway",Font.BOLD,20));
		labelCity.setBounds(100,540,200,30);
		add(labelCity);
		
		textCity=new JTextField();
		textCity.setFont(new Font("Raleway",Font.BOLD,14));
		textCity.setBounds(300,540,400,30);
		add(textCity);
		
		JLabel labelPin=new JLabel("Pin Code:");
		labelPin.setFont(new Font("Ralway",Font.BOLD,20));
		labelPin.setBounds(100,590,200,30);
		add(labelPin);
		
		textPin=new JTextField();
		textPin.setFont(new Font("Raleway",Font.BOLD,14));
		textPin.setBounds(300,590,400,30);
		add(textPin);
		
		JLabel labelState=new JLabel("State:");
		labelState.setFont(new Font("Raleway",Font.BOLD,20));
		labelState.setBounds(100,640,200,30);
		add(labelState);
		
		textState=new JTextField();
		textState.setFont(new Font("Raleway",Font.BOLD,14));
		textState.setBounds(300,640,400,30);
		add(textState);
		
		next=new JButton("Next");
		next.setBounds(620,710,80,30);
		next.setBackground(Color.black);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setForeground(Color.white );
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(new Color(222,255,228));
		setLayout(null);
		setSize(850,800);
		setLocation(360,40);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String formno=first;
		String name=textName.getText();
		String fatherName=textFname.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String email=textEmail.getText();
		String gender=null;
		if(r1.isSelected()) {gender="Male";}
		else if(r2.isSelected()) {gender="Female";}
		String maritalStatus=null;
		if(m1.isSelected()) {maritalStatus="Unmarried";}
		else if(m2.isSelected()) {maritalStatus="Married";}
		else if(m3.isSelected()) {maritalStatus="Other";}
		String address=textAdd.getText();
		String city=textCity.getText();
		String pinCode=textPin.getText();
		String state=textState.getText();
		
		try {
			if(name.equals("")||fatherName.equals("")||dob.equals("")||email.equals("")||gender.equals("")||maritalStatus.equals("")||address.equals("")||city.equals("")||pinCode.equals("")||state.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Fill all the Fields");
			}
			else
			{
				connect con= new connect();
				String q="insert into signup values('"+formno+"','"+name+"','"+fatherName+"','"+dob+"','"+email+"','"+gender+"','"+maritalStatus+"','"+address+"','"+city+"','"+pinCode+"','"+state+"')";
				con.getStatement().executeUpdate(q);
				new signup2(formno);
				setVisible(false);
			}
			
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
	}
	public static void main(String args[])
	{
		new Signup();
	}


}
