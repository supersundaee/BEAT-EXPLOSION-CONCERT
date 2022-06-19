import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paymentPage extends JFrame {

	DecimalFormat priceformatter = new DecimalFormat ("#0.00");
	private JPanel contentPane;
	
	Date obj = new Date();
	String date1 = obj.toString();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paymentPage frame = new paymentPage();
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
	//
	public paymentPage(String  Name,String icNumber,String email,String phone,String seat,String TotalSeat,double price) {
		setTitle("BEAT EXPLOSION CONCERT TICKET");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1364, 609);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelConfirmPayment = new JPanel();
		panelConfirmPayment.setBorder(new TitledBorder(null, "CONFIRM PAYMENT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelConfirmPayment.setBackground(Color.BLACK);
		panelConfirmPayment.setBounds(10, 11, 1338, 556);
		contentPane.add(panelConfirmPayment);
		panelConfirmPayment.setLayout(null);
		
		JLabel lblName = new JLabel("Name: " + Name);
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Book Antiqua", Font.BOLD, 24));
		lblName.setBounds(10, 28, 234, 43);
		panelConfirmPayment.add(lblName);
		
		JLabel lblCinemaType = new JLabel("IC number: " + icNumber);
		lblCinemaType.setForeground(Color.WHITE);
		lblCinemaType.setFont(new Font("Book Antiqua", Font.BOLD, 24));
		lblCinemaType.setBounds(10, 82, 334, 43);
		panelConfirmPayment.add(lblCinemaType);
		
		JLabel lblMovie = new JLabel("Email:" + email);
		lblMovie.setForeground(Color.WHITE);
		lblMovie.setFont(new Font("Book Antiqua", Font.BOLD, 24));
		lblMovie.setBounds(10, 136, 334, 43);
		panelConfirmPayment.add(lblMovie);
		
		JLabel lblDate = new JLabel("Phone number: " + phone);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Book Antiqua", Font.BOLD, 24));
		lblDate.setBounds(10, 190, 334, 43);
		panelConfirmPayment.add(lblDate);
		
		JLabel lblTime = new JLabel("Time: " + date1 );
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Book Antiqua", Font.BOLD, 24));
		lblTime.setBounds(10, 244, 334, 43);
		panelConfirmPayment.add(lblTime);
		
		JLabel lblHallNum = new JLabel("Seat: " + seat);
		lblHallNum.setForeground(Color.WHITE);
		lblHallNum.setFont(new Font("Book Antiqua", Font.BOLD, 24));
		lblHallNum.setBounds(10, 299, 334, 43);
		panelConfirmPayment.add(lblHallNum);
		
		JLabel lblSeatNum = new JLabel("Total seat: " + TotalSeat);
		lblSeatNum.setForeground(Color.WHITE);
		lblSeatNum.setFont(new Font("Book Antiqua", Font.BOLD, 24));
		lblSeatNum.setBounds(10, 353, 435, 43);
		panelConfirmPayment.add(lblSeatNum);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(455, 11, 19, 545);
		panelConfirmPayment.add(separator);
		
		JLabel lblTotal = new JLabel("TOTAL: RM " +priceformatter.format(price));
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Arial", Font.BOLD, 24));
		lblTotal.setBounds(484, 39, 311, 43);
		panelConfirmPayment.add(lblTotal);
		
		//User have to click Confirm to Print reciept
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reciept r = new Reciept(Name,icNumber,email,phone,seat,TotalSeat,price);
				r.show();
				dispose();
				
				
				
				
				
			}
		});
		btnConfirm.setBackground(new Color(255, 255, 255));
		btnConfirm.setFont(new Font("Arial", Font.BOLD, 14));
		btnConfirm.setBounds(610, 366, 119, 23);
		panelConfirmPayment.add(btnConfirm);
		
		//User have to click Back to return to ticket
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ticket b = new Ticket();
				b.show();
				dispose();
			}
		});
		btnBack.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(484, 367, 116, 23);
		panelConfirmPayment.add(btnBack);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
}