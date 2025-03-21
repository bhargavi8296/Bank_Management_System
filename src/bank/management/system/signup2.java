package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

public class signup2 extends JFrame implements ActionListener{
	static String formno="";
	JComboBox comboBox,categoryBox,incomeBox,educationBox,occupationBox;
	JTextField textPan,textAadhar;
	JRadioButton r1,r2,m1,m2;
	JButton next;
	ButtonGroup seniorBG,exsistingBG;
		@SuppressWarnings("unchecked")
		signup2(String formno)
		{
			super("APPLICATION FORM");
			
			URL bankImageUrl = getClass().getResource("/icon/bank.png");
			ImageIcon i=new ImageIcon(bankImageUrl);
			Image i1=i.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
			ImageIcon i2=new ImageIcon(i1);
			JLabel image=new JLabel(i2);
			image.setBounds(150, 5, 100, 100);
			add(image);
			
			this.formno=formno;
			
			JLabel l1= new JLabel("Page 2");
			l1.setFont(new Font("Raleway",Font.BOLD,22));
			l1.setBounds(300,30,600,40);
			add(l1);
			
			JLabel l2=new JLabel("Additional Details");
			l2.setFont(new Font("Releway",Font.BOLD,22));
			l2.setBounds(300,60,600,40);
			add(l2);
			
			JLabel l3=new JLabel("Religion:");
			l3.setFont(new Font("Raleway",Font.BOLD,18));
			l3.setBounds(100,120,100,30);
			add(l3);
			
			String religion[]= {"Hindu","Christian","Sikh","Muslim","Other"};
			comboBox=new JComboBox(religion);
			comboBox.setFont(new Font("Raleway",Font.BOLD,14));
			comboBox.setBounds(350,120,320,30);
			comboBox.setBackground(new Color(252,208,76));
			add(comboBox);
			
			JLabel l4=new JLabel("Ctegory:");
			l4.setFont(new Font("Raleway",Font.BOLD,18));
			l4.setBounds(100,170,100,30);
			add(l4);
			
			String category[]= {"General","OBC","SC","ST","Other"};
			categoryBox=new JComboBox(category);
			categoryBox.setFont(new Font("Raleway",Font.BOLD,14));
			categoryBox.setBounds(350,170,320,30);
			categoryBox.setBackground(new Color(252,208,76));
			add(categoryBox);
			
			JLabel l5=new JLabel("Income:");
			l5.setFont(new Font("Raleway",Font.BOLD,18));
			l5.setBounds(100,220,100,30);
			add(l5);
			
			String income[]= {"NULL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
			incomeBox=new JComboBox(income);
			incomeBox.setFont(new Font("Raleway",Font.BOLD,14));
			incomeBox.setBounds(350,220,320,30);
			incomeBox.setBackground(new Color(252,208,76));
			add(incomeBox);
			
			JLabel l6=new JLabel("Educational:");
			l6.setFont(new Font("Raleway",Font.BOLD,18));
			l6.setBounds(100,270,150,30);
			add(l6);
			
			String education[]= {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
			educationBox=new JComboBox(education);
			educationBox.setFont(new Font("Raleway",Font.BOLD,14));
			educationBox.setBounds(350,270,320,30);
			educationBox.setBackground(new Color(252,208,76));
			add(educationBox);
			
			JLabel l7=new JLabel("Occupation:");
			l7.setFont(new Font("Raleway",Font.BOLD,18));
			l7.setBounds(100,340,150,30);
			add(l7);
			
			String occupation[]= {"Salaried","Self-Employed","Student","Reteried","Others"};
			occupationBox=new JComboBox(occupation);
			occupationBox.setFont(new Font("Raleway",Font.BOLD,14));
			occupationBox.setBounds(350,340,320,30);
			occupationBox.setBackground(new Color(252,208,76));
			add(occupationBox);
			
			JLabel l8= new JLabel("Pan Number:");
			l8.setBounds(100,390,150,30);
			l8.setFont(new Font("Raleway",Font.BOLD,18));
			add(l8);
			
			textPan=new JTextField();
			textPan.setBounds(350,390,320,30);
			textPan.setFont(new Font("Raleway",Font.BOLD,18));
			textPan.setBackground(new Color(252,208,76));
			add(textPan);
			
			JLabel l9= new JLabel("Aadhar Number:");
			l9.setBounds(100,440,150,30);
			l9.setFont(new Font("Raleway",Font.BOLD,18));
			add(l9);
			
			textAadhar=new JTextField();
			textAadhar.setBounds(350,440,320,30);
			textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
			textAadhar.setBackground(new Color(252,208,76));
			add(textAadhar);
			
			JLabel l10= new JLabel("Senior Citizen:");
			l10.setBounds(100,490,150,30);
			l10.setFont(new Font("Raleway",Font.BOLD,18));
			add(l10);
			
			r1=new JRadioButton("Yes");
			r1.setBounds(350,490,100,30);
			r1.setBackground(new Color(252,208,76));
			r1.setFont(new Font("Raleway",Font.BOLD,14));
			add(r1);
			
			r2=new JRadioButton("No");
			r2.setBounds(450,490,100,30);
			r2.setBackground(new Color(252,208,76));
			r2.setFont(new Font("Raleway",Font.BOLD,14));
			add(r2);
			
			seniorBG=new ButtonGroup();
			seniorBG.add(r1);
			seniorBG.add(r2);
			
			JLabel l11= new JLabel("Exsisting Account:");
			l11.setBounds(100,540,200,30);
			l11.setFont(new Font("Raleway",Font.BOLD,18));
			add(l11);
			
			m1=new JRadioButton("Yes");
			m1.setBounds(350,540,100,30);
			m1.setBackground(new Color(252,208,76));
			m1.setFont(new Font("Raleway",Font.BOLD,14));
			add(m1);
			
			m2=new JRadioButton("No");
			m2.setBounds(450,540,100,30);
			m2.setBackground(new Color(252,208,76));
			m2.setFont(new Font("Raleway",Font.BOLD,14));
			add(m2);
			
			exsistingBG=new ButtonGroup();
			exsistingBG.add(m1);
			exsistingBG.add(m2);
			
			JLabel l12= new JLabel("Form No:");
			l12.setBounds(700,10,80,30);
			l12.setFont(new Font("Raleway",Font.BOLD,18));
			add(l12);
			
			JLabel l13= new JLabel(formno);
			l13.setBounds(760,10,60,30);
			l13.setFont(new Font("Raleway",Font.BOLD,18));
			add(l13);
			
			next=new JButton("next");
			next.setBounds(570,640,100,30);
			next.setFont(new Font("Raleway",Font.BOLD,14));
			next.setBackground(Color.white);
			next.setForeground(Color.black);
			next.addActionListener(this);
			add(next);
			
			setLayout(null);
			setSize(850,750);
			setLocation(450,80);
			getContentPane().setBackground(new Color(252,208,76));
			setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new signup2(formno);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			String rel=(String)comboBox.getSelectedItem();
			String category=(String)categoryBox.getSelectedItem();
			String income=(String)incomeBox.getSelectedItem();
			String education=(String)educationBox.getSelectedItem();
			String occupation=(String)occupationBox.getSelectedItem();
			String pan=textPan.getText();
			String aadhar=textAadhar.getText();
			String seniorcitizen=null;
			if(r1.isSelected()){seniorcitizen="Yes";}
			else if(r2.isSelected()) {seniorcitizen="No";}
			String exsistingaccount=null;
			if(m1.isSelected()) {exsistingaccount="Yes";}
			else if(m2.isSelected()) {exsistingaccount="No";}
			if(pan.equals("")||aadhar.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Fill all the Fields");
			}
			else
			{
				connect con=new connect();
				String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+seniorcitizen+"','"+exsistingaccount+"')";
				con.getStatement().executeUpdate(q);
				new signup3(formno);
				setVisible(false);
			}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
	}

}
