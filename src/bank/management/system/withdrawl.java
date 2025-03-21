package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.*;

public class withdrawl extends JFrame implements ActionListener{
	String pin;
	JTextField textAmount;
	JButton buttonWithdraw,buttonBack;
	withdrawl(String pin){
		this.pin=pin;
		System.out.print(this.pin);
		URL bankImageUrl = getClass().getResource("/icon/atm2.png"); 
		ImageIcon i=new ImageIcon(bankImageUrl);
		Image i1=i.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i1);
		JLabel i3 = new JLabel(i2);
		i3.setBounds(0,0,1550,830);
		add(i3);
		
		JLabel l1=new JLabel("MAXIMUM WITHDRAWL AMOUNT IS RS. 10,000");
		l1.setBounds(460,180,700,35);
		l1.setForeground(Color.white);
		l1.setFont(new Font("System",Font.BOLD,16));
		i3.add(l1);
		
		JLabel l2=new JLabel("PLEASE ENTER YOUR AMOUNT");
		l2.setBounds(460,220,400,35);
		l2.setForeground(Color.white);
		l2.setFont(new Font("System",Font.BOLD,16));
		i3.add(l2);
		
		textAmount=new JTextField();
		textAmount.setBackground(new Color(65,125,128));
		textAmount.setForeground(Color.white);
		textAmount.setBounds(460,260,320,25);
		textAmount.setFont(new Font("Raleway",Font.BOLD,22));
		i3.add(textAmount);
		
		buttonWithdraw=new JButton("WITHDRAW");
		buttonWithdraw.setBounds(700,362,150,35);
		buttonWithdraw.addActionListener(this);
		buttonWithdraw.setForeground(Color.white);
		buttonWithdraw.setBackground(new Color(65,125,128));
		i3.add(buttonWithdraw);
		
		buttonBack=new JButton("BACK");
		buttonBack.setBounds(700,406,150,35);
		buttonBack.addActionListener(this);
		buttonBack.setForeground(Color.white);
		buttonBack.setBackground(new Color(65,125,128));
		i3.add(buttonBack);
		
		setLayout(null);
		setSize(1550,1080);
		setLocation(0,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new withdrawl("");

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==buttonWithdraw)
		{
			try {
					String amount=textAmount.getText();
					Date date=new Date();
					if(amount.equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
					}
					else
					{
						connect con=new connect();
						String q="select * from bank where pin = '" + pin + "'";
						ResultSet result=con.getStatement().executeQuery(q);
						int balance=0;
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
					 if(balance<Integer.parseInt(amount))
					 {
						 JOptionPane.showMessageDialog(null, "Insufficient Balance");return;
					 }
					 con.getStatement().executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
					 JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
					 setVisible(false);
	                  new main_class(pin);
				}
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}
		else if(e.getSource()==buttonBack)
		{
			setVisible(false);
            new main_class(pin);
		}
		
	}

}
