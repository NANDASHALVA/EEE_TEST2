package METRO_TICKET;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class METRO_TICKET {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METRO_TICKET window = new METRO_TICKET();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public METRO_TICKET() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1369, 808);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HYD-METRO TICKET");
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.BOLD, 25));
		lblNewLabel.setBounds(501, 145, 181, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(480, 190, 71, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("FROM :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(480, 240, 71, 39);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("TO :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(501, 290, 38, 39);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		tb1 = new JTextField();
		tb1.setBounds(576, 202, 142, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 18));
		c1.setModel(new DefaultComboBoxModel(new String[] {"UPPAL", "PARADISE", "BALANAGAR", "KUKATPALLY", "KPHP", "JNTU", "MIYAPUR"}));
		c1.setBounds(576, 243, 142, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"MIYAPUR", "JNTU", "KPHP", "KUKATPALLY", "BALANAGAR", "PARADISE", "UPPAL"}));
		c2.setFont(new Font("Tahoma", Font.BOLD, 18));
		c2.setBounds(576, 298, 142, 22);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_2 = new JLabel("TICKETS :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(445, 341, 106, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c3 = new JComboBox();
		c3.setFont(new Font("Tahoma", Font.BOLD, 18));
		c3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		c3.setBounds(576, 350, 142, 22);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("BOOK TICKETS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pn=tb1.getText();
				String fs=(String) c1.getSelectedItem();
				String ts=(String) c2.getSelectedItem();
				String tickets=(String) c3.getSelectedItem();
				int t=Integer.parseInt(tickets);
				int bill=t*40;
				JOptionPane.showMessageDialog(btnNewButton, "Hello "+pn+"\n from : "+fs+"\n To :"+ts+" \n Tickets : "+t+" \n bill :"+bill );
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(539, 416, 179, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
