package bank.management.system;

import javax.swing.JFrame;

public class Login extends JFrame{
	Login(){
		super("Bank Management System");
		setSize(850,480);
		setVisible(true);
		setLocation(450,200);
	}
	public static void main(String args[])
	{
		new Login();
	}
}
