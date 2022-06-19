import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Reciept extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txticnumber;
	private JTextField txtemail;
	private JTextField txtzone;
	private JTextField txttotalseat;
	private JTextField txtpaymenttype;
	private JTextField txttotalpayment;
	private JTextField txtphonenumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reciept frame = new Reciept();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Reciept(String  Name,String icNumber,String email,String phone,String seat,String TotalSeat,double price) {
		
		Date obj = new Date();

		String date = obj.toString();
		
		String total = Double.toString(price);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 476);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BEAT EXPLOSION CONCERT");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(31, 10, 249, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(31, 73, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("AXIATA ARENA KUALA LUMPUR");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(65, 32, 182, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(31, 73, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		txtname = new JTextField(Name);
		txtname.setBounds(146, 67, 142, 19);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("IC NUMBER");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(31, 98, 81, 13);
		contentPane.add(lblNewLabel_4);
		
		txticnumber = new JTextField(icNumber);
		txticnumber.setBounds(145, 96, 143, 19);
		contentPane.add(txticnumber);
		txticnumber.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("EMAIL");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(31, 131, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		txtemail = new JTextField(email);
		txtemail.setBounds(145, 125, 142, 19);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("ZONE");
		lblNewLabel_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(31, 249, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		txtzone = new JTextField(seat);
		txtzone.setBounds(146, 243, 142, 19);
		contentPane.add(txtzone);
		txtzone.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TOTAL SEAT");
		lblNewLabel_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(31, 278, 81, 13);
		contentPane.add(lblNewLabel_7);
		
		txttotalseat = new JTextField(TotalSeat);
		txttotalseat.setBounds(146, 272, 142, 19);
		contentPane.add(txttotalseat);
		txttotalseat.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("PAYMENT TYPE");
		lblNewLabel_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(31, 307, 95, 13);
		contentPane.add(lblNewLabel_8);
		
		txtpaymenttype = new JTextField("Debit");
		txtpaymenttype.setBounds(146, 301, 142, 19);
		contentPane.add(txtpaymenttype);
		txtpaymenttype.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("TOTAL PAYMENT");
		lblNewLabel_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(31, 332, 109, 13);
		contentPane.add(lblNewLabel_9);
		
		txttotalpayment = new JTextField(total);
		txttotalpayment.setBounds(146, 330, 142, 19);
		contentPane.add(txttotalpayment);
		txttotalpayment.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("PHONE NUMBER");
		lblNewLabel_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(31, 159, 95, 13);
		contentPane.add(lblNewLabel_10);
		
		txtphonenumber = new JTextField(phone);
		txtphonenumber.setBounds(146, 154, 142, 19);
		contentPane.add(txtphonenumber);
		txtphonenumber.setColumns(10);
		
		JTextArea area = new JTextArea();
		area.setBounds(333, 64, 281, 329);
		contentPane.add(area);
		
		JButton btnNewButton_1 = new JButton("Generate ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				area.setText("=======================================\n");
				area.setText(area.getText()+ "---------------BEAT EXPLOSION CONCERT--------------\n");
				area.setText(area.getText()+ "========================================\n");
				
				
				
				area.setText(area.getText()+ "\n"+date+"\n\n");
				
				area.setText(area.getText()+ "Name :" + txtname.getText() + "\n");
				
				area.setText(area.getText()+ "Ic Number :" + txticnumber.getText() + "\n");
				
				
				area.setText(area.getText()+ "Email :" + txtemail.getText() +"\n");
				
				
				area.setText(area.getText()+ "Phone Number :" + txtphonenumber.getText() + "\n");
				
				
				area.setText(area.getText()+ "Zone :" + txtzone.getText() + "\n");
				
				
				area.setText(area.getText()+ "Total Seat :" + txttotalseat.getText() + "\n");
				
				
				area.setText(area.getText()+ "Payment Type :" + txtpaymenttype.getText() +"\n");
				
				
				area.setText(area.getText()+ "Total Payment :" + txttotalpayment.getText() + "\n");
				
				area.setText(area.getText()+ "\n");
				
				
				
				area.setText(area.getText()+"==========THANK YOU FOR BUYING===============\n");
				area.setText(area.getText()+"==========SEE YOU THERE iKONIC===============\n");
				
				
				
			}
		});
		btnNewButton_1.setBounds(99, 373, 109, 21);
		contentPane.add(btnNewButton_1);
		
		
		
	}
}
