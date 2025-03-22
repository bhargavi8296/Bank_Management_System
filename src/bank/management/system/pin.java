package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class pin extends JFrame implements ActionListener{
	JButton b1, b2;
	JPasswordField p1,p2;
	String pin;
	pin(String pin){
		this.pin=pin;
		URL bankImageUrl = getClass().getResource("/icon/atm2.png"); 
		ImageIcon i=new ImageIcon(bankImageUrl);
		Image i1=i.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		ImageIcon i2=new ImageIcon(i1);
		JLabel i3 = new JLabel(i2);
		i3.setBounds(0,0,1550,830);
		add(i3);
		
		JLabel l1=new JLabel("CHANGE YOUR PIN:");
		l1.setBounds(430,180,400,35);
		l1.setForeground(Color.white);
		l1.setFont(new Font("System",Font.BOLD,16));
		i3.add(l1);
		
		JLabel l2=new JLabel("NEW PIN:");
		l2.setBounds(430,220,150,35);
		l2.setForeground(Color.white);
		l2.setFont(new Font("System",Font.BOLD,16));
		i3.add(l2);
		
		p1=new JPasswordField();
		p1.setBounds(600,220,200,25);
		p1.setForeground(Color.white);
		p1.setBackground(new Color(65,125,128));
		p1.setFont(new Font("Raleway",Font.BOLD,22));
		i3.add(p1);
		
		JLabel l3=new JLabel("Re-Enter NEW PIN:");
		l3.setBounds(430,250,400,35);
		l3.setForeground(Color.white);
		l3.setFont(new Font("System",Font.BOLD,16));
		i3.add(l3);
		
		p2=new JPasswordField();
		p2.setBounds(600,255,200,25);
		p2.setForeground(Color.white);
		p2.setBackground(new Color(65,125,128));
		p2.setFont(new Font("Raleway",Font.BOLD,22));
		i3.add(p2);
		
		b1=new JButton("CHANGE");
		b1.setBounds(700,362,150,35);
		b1.addActionListener(this);
		b1.setForeground(Color.white);
		b1.setBackground(new Color(65,125,128));
		i3.add(b1);
		
		b2=new JButton("BACK");
		b2.setBounds(700,406,150,35);
		b2.addActionListener(this);
		b2.setForeground(Color.white);
		b2.setBackground(new Color(65,125,128));
		i3.add(b2);
		
		setLayout(null);
		setSize(1550,1080);
		setLocation(0,0);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pin("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			String pin1=p1.getText();
			String pin2=p2.getText();
			if(pin1.equals(pin1)) {
				if(pin1.equals("")) {JOptionPane.showMessageDialog(null, "Enter new PIN");return;}
				if(pin2.equals("")) {JOptionPane.showMessageDialog(null, "Re-Enter new PIN");return;}
				try {
					connect con=new connect();
					String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
	                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
	                String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";
	                JOptionPane.showMessageDialog(null, "PIN changed successfully");

	                con.getStatement().executeUpdate(q1);
	                con.getStatement().executeUpdate(q2);
	                con.getStatement().executeUpdate(q3);
	                setVisible(false);
	                new main_class(pin);
				}
				catch(Exception E)
				{
					E.getStackTrace();
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Entered PIN doesn't match");
			}
		}
		else if(e.getSource()==b2)
		{
			new main_class(pin);
			setVisible(false);
		}
		
	}

}
