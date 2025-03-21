package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.ResultSet;

import javax.swing.*;

public class bankEnquiry extends JFrame implements ActionListener{
	JLabel l2;
	JButton b1;
	String pin;
	bankEnquiry(String pin){
		this.pin=pin; 
		
		URL bankImageUrl = getClass().getResource("/icon/atm2.png"); 
		ImageIcon i=new ImageIcon(bankImageUrl);
		Image i1=i.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i1);
		JLabel i3 = new JLabel(i2);
		i3.setBounds(0,0,1550,830);
		add(i3);
		
		JLabel l1=new JLabel("Your Current Balance is Rs. ");
		l1.setBounds(430,180,700,35);
		l1.setForeground(Color.white);
		l1.setFont(new Font("System",Font.BOLD,16));
		i3.add(l1);
		
		l2=new JLabel();
		l2.setBounds(430,220,400,35);
		l2.setForeground(Color.white);
		l2.setFont(new Font("System",Font.BOLD,16));
		i3.add(l2);
		
		int balance=0;
		try {
			connect con=new connect();
			String q="select * from bank where pin = '" + pin + "'";
			ResultSet result=con.getStatement().executeQuery(q);
			while(result.next())
			{
				if(result.getString("type").equals("Deposit"))
				{
					balance+=Integer.parseInt(result.getString("amount"));
				}
				else
				{
					balance-=Integer.parseInt(result.getString("amount"));
				}
			}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		l2.setText(""+balance);
		
		b1=new JButton("Back");
		b1.setBounds(700,406,150,35);
		b1.setBackground(new Color(65,125,128));
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		i3.add(b1);
		
		setLayout(null);
		setSize(1550,1080);
		setLocation(0,0);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new bankEnquiry("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			if(e.getSource()==b1)
			{
				setVisible(false);
				new main_class(pin);
			}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
	}
}
