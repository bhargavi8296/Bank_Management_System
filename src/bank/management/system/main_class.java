package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class main_class extends JFrame implements ActionListener{
	JButton buttonD,buttonCW,buttonFC,buttonMS,buttonPC,buttonBE,exit;
	String pin="";
	main_class(String pin)
	{
		this.pin=pin;
		URL bankImageUrl = getClass().getResource("/icon/atm2.png"); 
		ImageIcon i=new ImageIcon(bankImageUrl);
		Image i1=i.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i1);
		JLabel i3 = new JLabel(i2);
		i3.setBounds(0,0,1550,830);
		add(i3);
		
		JLabel l1=new JLabel("Please Select Your Transaction");
		l1.setFont(new Font("System",Font.BOLD,28));
		l1.setForeground(Color.white);
		l1.setBounds(430,180,700,35);
		i3.add(l1);
		
		buttonD=new JButton("DEPOSIT");
		buttonD.setBounds(410,274,150,35);
		buttonD.setBackground(new Color(65,125,128));
		buttonD.setForeground(Color.white);
		buttonD.addActionListener(this);
		i3.add(buttonD);
		
		buttonCW=new JButton("CASH WITHDRAWL");
		buttonCW.setBounds(700,274,150,35);
		buttonCW.setBackground(new Color(65,125,128));
		buttonCW.setForeground(Color.white);
		buttonCW.addActionListener(this);
		i3.add(buttonCW);
		
		buttonFC=new JButton("FAST CASH");
		buttonFC.setBounds(410,318,150,35);
		buttonFC.setBackground(new Color(65,125,128));
		buttonFC.setForeground(Color.white);
		buttonFC.addActionListener(this);
		i3.add(buttonFC);
		
		buttonMS=new JButton("MAIN STATEMENT");
		buttonMS.setBounds(700,318,150,35);
		buttonMS.setBackground(new Color(65,125,128));
		buttonMS.setForeground(Color.white);
		buttonMS.addActionListener(this);
		i3.add(buttonMS);
		
		buttonPC=new JButton("PIN CHANGE");
		buttonPC.setBounds(410,362,150,35);
		buttonPC.setBackground(new Color(65,125,128));
		buttonPC.setForeground(Color.white);
		buttonPC.addActionListener(this);
		i3.add(buttonPC);
		
		buttonBE=new JButton("BALANCE ENQUIRY");
		buttonBE.setBounds(700,362,150,35);
		buttonBE.setBackground(new Color(65,125,128));
		buttonBE.setForeground(Color.white);
		buttonBE.addActionListener(this);
		i3.add(buttonBE);
		
		exit=new JButton("EXIT");
		exit.setBounds(700,406,150,35);
		exit.setBackground(new Color(65,125,128));
		exit.setForeground(Color.white);
		exit.addActionListener(this);
		i3.add(exit);
		
		setLayout(null);
		setSize(1550,830);
		setLocation(0,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main_class("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			if(e.getSource()==buttonD) {new Deposit(pin);setVisible(false);}
			else if(e.getSource()==exit) {System.exit(0);}
			else if(e.getSource()==buttonCW) {new withdrawl(pin);setVisible(false);}
			else if(e.getSource()==buttonBE) {new bankEnquiry(pin);setVisible(false);}
			else if(e.getSource()==buttonFC) {new FastCash(pin);setVisible(false);}
			else if(e.getSource()==buttonPC) {new pin(pin);setVisible(false);}
			else if(e.getSource()==buttonMS) {new mini(pin);setVisible(false);}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
	}

}
