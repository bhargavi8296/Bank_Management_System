package bank.management.system;

import java.awt.Color;
import java.util.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,back;
	String pin="";
	
	FastCash(String pin){
		this.pin=pin;
		URL bankImageUrl = getClass().getResource("/icon/atm2.png"); 
		ImageIcon i=new ImageIcon(bankImageUrl);
		Image i1=i.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i1);
		JLabel i3 = new JLabel(i2);
		i3.setBounds(0,0,1550,830);
		add(i3);
		
		JLabel l1=new JLabel("SELECT WITHDRAWL AMOUNT");
		l1.setFont(new Font("System",Font.BOLD,23));
		l1.setForeground(Color.white);
		l1.setBounds(445,180,700,35);
		i3.add(l1);
		
		b1=new JButton("Rs. 100");
		b1.setBounds(410,274,150,35);
		b1.setBackground(new Color(65,125,128));
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		i3.add(b1);
		
		b2=new JButton("Rs. 500");
		b2.setBounds(700,274,150,35);
		b2.setBackground(new Color(65,125,128));
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		i3.add(b2);
		
		b3=new JButton("Rs. 1000");
		b3.setBounds(410,318,150,35);
		b3.setBackground(new Color(65,125,128));
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		i3.add(b3);
		
		b4=new JButton("Rs. 2000");
		b4.setBounds(700,318,150,35);
		b4.setBackground(new Color(65,125,128));
		b4.setForeground(Color.white);
		b4.addActionListener(this);
		i3.add(b4);
		
		b5=new JButton("Rs. 5000");
		b5.setBounds(410,362,150,35);
		b5.setBackground(new Color(65,125,128));
		b5.setForeground(Color.white);
		b5.addActionListener(this);
		i3.add(b5);
		
		b6=new JButton("Rs. 10000");
		b6.setBounds(700,362,150,35);
		b6.setBackground(new Color(65,125,128));
		b6.setForeground(Color.white);
		b6.addActionListener(this);
		i3.add(b6);
		
		back=new JButton("BACK");
		back.setBounds(700,406,150,35);
		back.setBackground(new Color(65,125,128));
		back.setForeground(Color.white);
		back.addActionListener(this);
		i3.add(back);
		
		setLayout(null);
		setSize(1550,830);
		setLocation(0,0);
		setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FastCash("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==back) {new main_class(pin);setVisible(false);return;}
		else {
			String amount=((JButton)e.getSource()).getText().substring(4);
			connect con=new connect();
			Date date=new Date();
			int balance=0;
			try {
				ResultSet result=con.getStatement().executeQuery("select * from bank where pin = '" + pin + "'");
				while(result.next())
				{
					if(result.getString("type").equals("Deposit"))
					{
						balance+=Integer.parseInt(result.getString("amount"));
					}
					else {
						balance-=Integer.parseInt(result.getString("amount"));
					}
				}
				System.out.print(balance);
				if(balance<Integer.parseInt(amount))
				{
					JOptionPane.showMessageDialog(null, "Insufficient Amount!!");return;
				}
					con.getStatement().executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
					 JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
				}
			catch(Exception E)
			{
				E.printStackTrace();
			}
			setVisible(false);
            new main_class(pin);
		}
	}
			
		
}


