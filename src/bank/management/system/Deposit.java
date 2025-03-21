package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
	String pin;
	JTextField textAmount;
	JButton buttonDeposit,buttonBack;
	Deposit(String pin)
	{
		URL bankImageUrl = getClass().getResource("/icon/atm2.png"); 
		ImageIcon i=new ImageIcon(bankImageUrl);
		Image i1=i.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i1);
		JLabel i3 = new JLabel(i2);
		i3.setBounds(0,0,1550,830);
		add(i3);
		
		JLabel l1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
		l1.setBounds(460,180,400,35);
		l1.setForeground(Color.white);
		l1.setFont(new Font("System",Font.BOLD,16));
		i3.add(l1);
		
		textAmount=new JTextField();
		textAmount.setBackground(new Color(65,125,128));
		textAmount.setForeground(Color.white);
		textAmount.setBounds(460,230,320,25);
		textAmount.setFont(new Font("Raleway",Font.BOLD,22));
		i3.add(textAmount);
		
		buttonDeposit=new JButton("DEPOSIT");
		buttonDeposit.setBounds(700,362,150,35);
		buttonDeposit.addActionListener(this);
		buttonDeposit.setForeground(Color.white);
		buttonDeposit.setBackground(new Color(65,125,128));
		i3.add(buttonDeposit);
		
		buttonBack=new JButton("BACK");
		buttonBack.setBounds(700,406,150,35);
		buttonBack.addActionListener(this);
		buttonBack.setForeground(Color.white);
		buttonBack.setBackground(new Color(65,125,128));
		i3.add(buttonBack);
		
		this.pin=pin;
		setLayout(null);
		setLocation(0,0);
		setSize(1550,1080);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Deposit("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			String amount=textAmount.getText();
			Date date=new Date();
			if(e.getSource()==buttonDeposit)
			{
				if(amount.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please enter the amount you want to Deposit");
				}
				else
				{
					connect con=new connect();
					String q="insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"')";
					con.getStatement().executeUpdate(q);
					JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully!!!");
					setVisible(false);
					new main_class(pin);
				}
			}
			else if(e.getSource()==buttonBack)
			{
				setVisible(false);
			}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
		
		
	}

}
