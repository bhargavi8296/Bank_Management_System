package bank.management.system;

import java.net.URL;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class signup3 extends JFrame implements ActionListener{
	JRadioButton r1,r2,r3,r4;
	ButtonGroup accountBG;
	JCheckBox c1,c2,c3,c4,c5,c6;
	JButton submit,cancel;
	String formno;
	signup3(String formno){
		this.formno=formno;
		URL bankImageUrl = getClass().getResource("/icon/bank.png"); 
		ImageIcon i=new ImageIcon(bankImageUrl);
		Image i1=i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i1);
		JLabel image=new JLabel(i2);
		image.setBounds(150, 5, 100, 100);
		add(image);
		
		JLabel l1=new JLabel("Page 3:");
		l1.setBounds(280, 40, 400, 40);
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		add(l1);
		
		JLabel l2=new JLabel("Account Details:");
		l2.setBounds(280, 70, 400, 40);
		l2.setFont(new Font("Raleway",Font.BOLD,18));
		add(l2);
		
		JLabel l3=new JLabel("Account Type:");
		l3.setBounds(100, 140, 200, 30);
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		add(l3);
		
		r1=new JRadioButton("Saving Accounts");
		r1.setBounds(100,180,250,30);
		r1.setBackground(new Color(215,252,252));
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		add(r1);
		
		r2=new JRadioButton("Fixed Deposit Account");
		r2.setBounds(350,180,300,30);
		r2.setBackground(new Color(215,252,252));
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		add(r2);
		
		r3=new JRadioButton("Current Account");
		r3.setBounds(100,220,250,30);
		r3.setBackground(new Color(215,252,252));
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		add(r3);
		
		r4=new JRadioButton("Recurring Deposit Account");
		r4.setBounds(350,220,250,30);
		r4.setBackground(new Color(215,252,252));
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		add(r4);
		
		accountBG=new ButtonGroup();
		accountBG.add(r1);
		accountBG.add(r2);
		accountBG.add(r3);
		accountBG.add(r4);
		
		JLabel l4=new JLabel("Card Number:");
		l4.setBounds(100, 300, 200, 30);
		l4.setFont(new Font("Raleway",Font.BOLD,18));
		add(l4);
		
		JLabel l5=new JLabel("(Your 16-digit Card Number:)");
		l5.setBounds(100, 330, 200, 30);
		l5.setFont(new Font("Raleway",Font.BOLD,12));
		add(l5);
		
		JLabel l6=new JLabel("XXXX-XXXX-XXXX-4841:");
		l6.setBounds(330, 300, 250, 30);
		l6.setFont(new Font("Raleway",Font.BOLD,12));
		add(l6);
		
		JLabel l7=new JLabel("(It would appear on atm card/cheque Book and statements:)");
		l7.setBounds(330, 330, 500, 20);
		l7.setFont(new Font("Raleway",Font.BOLD,12));
		add(l7);
		
		JLabel l8=new JLabel("PIN:");
		l8.setBounds(100, 370, 200, 30);
		l8.setFont(new Font("Raleway",Font.BOLD,18));
		add(l8);
		
		JLabel l9=new JLabel("XXXX");
		l9.setBounds(330, 370, 200, 30);
		l9.setFont(new Font("Raleway",Font.BOLD,18));
		add(l9);
		
		JLabel l10=new JLabel("(4-Digit Password)");
		l10.setBounds(100, 400, 200, 30);
		l10.setFont(new Font("Raleway",Font.BOLD,12));
		add(l10);
		
		JLabel l11=new JLabel("Services Required:");
		l11.setBounds(100, 450, 200, 30);
		l11.setFont(new Font("Raleway",Font.BOLD,18));
		add(l11);
		
		c1=new JCheckBox("ATM Card");
		c1.setBackground(new Color(215,252,252));
		c1.setBounds(100,500,200,30);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		add(c1);
		
		c2=new JCheckBox("Internet Banking");
		c2.setBackground(new Color(215,252,252));
		c2.setBounds(350,500,200,30);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		add(c2);
		
		c3=new JCheckBox("Mobile Banking");
		c3.setBackground(new Color(215,252,252));
		c3.setBounds(100,550,200,30);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		add(c3);
		
		c4=new JCheckBox("EMAIL Alerts");
		c4.setBackground(new Color(215,252,252));
		c4.setBounds(350,550,200,30);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		add(c4);
		
		c5=new JCheckBox("Cheque Book");
		c5.setBackground(new Color(215,252,252));
		c5.setBounds(100,600,200,30);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		add(c5);
		
		c6=new JCheckBox("E-Statement");
		c6.setBackground(new Color(215,252,252));
		c6.setBounds(350,600,200,30);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		add(c6);
		
		JCheckBox c7=new JCheckBox("I here by declears that the above entered details are correct to the best of my knowledge");
		c7.setBackground(new Color(215,252,252));
		c7.setBounds(100,680,700,20);
		c7.setFont(new Font("Raleway",Font.BOLD,12 ));
		add(c7);
		
		JLabel l12= new JLabel("Form No:");
		l12.setBounds(700,10,100,30);
		l12.setFont(new Font("Raleway",Font.BOLD,14));
		add(l12);
		
		JLabel l13= new JLabel(formno);
		l13.setBounds(760,10,60,30);
		l13.setFont(new Font("Raleway",Font.BOLD,14));
		add(l13);
		
		submit=new JButton("Submit");
		submit.setBounds(250,720,100,30);
		submit.setFont(new Font("Raleway",Font.BOLD,14));
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.addActionListener(this);
		add(submit);
		
		cancel=new JButton("Cancel");
		cancel.setBounds(420,720,100,30);
		cancel.setFont(new Font("Raleway",Font.BOLD,14));
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(new Color(215,252,252));
		setLayout(null);
		setLocation(400,20);
		setSize(850,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new signup3("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			if(e.getSource()==submit)
			{
				String aType=null;
				if(r1.isSelected()) {aType = "Saving Account";}
				else if(r2.isSelected()) {aType ="Fixed Deposit Account";}
				else if(r3.isSelected()) {aType ="Current Account";}
				else if(r4.isSelected()) {aType = "Recurring Deposit Account";}
				
				Random ran=new Random();
		        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
		        String cardno = "" + Math.abs(first7);

		        long first3 = (ran.nextLong() % 9000L)+ 1000L;
		        String pin = "" + Math.abs(first3);
		        
				String sRequired="";
				if(c1.isSelected()) { sRequired+= "ATM CARD ";}
				if(c2.isSelected()) {sRequired+="Internet Banking ";}
				if(c3.isSelected()) {sRequired+="Mobile Banking ";}
				if(c4.isSelected()) {sRequired+="EMAIL Alerts ";}
				if(c5.isSelected()) {sRequired+="Cheque Book ";}
				if(c6.isSelected()) {sRequired+="E-Statement ";}
				connect c1 = new connect();
                String q1 = "insert into signupthree values('"+formno+"', '"+aType+"','"+cardno+"','"+pin+"','"+sRequired+"')";
                String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                c1.getStatement().executeUpdate(q1);
                c1.getStatement().executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                new Deposit(pin);
                setVisible(false);
			}
			else if(e.getSource()==cancel)
			{
				System.exit(0);
			}
		}
		catch(Exception E)
		{
			E.printStackTrace(); 
		}
		
	}

}
