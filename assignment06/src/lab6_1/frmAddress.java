package lab6_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAddress extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtStreet;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAddress frame = new frmAddress();
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
	public frmAddress() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(24, 20, 61, 16);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(24, 48, 130, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtStreet = new JTextField();
		txtStreet.setColumns(10);
		txtStreet.setBounds(166, 48, 130, 26);
		contentPane.add(txtStreet);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setBounds(166, 20, 61, 16);
		contentPane.add(lblStreet);
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setBounds(314, 48, 130, 26);
		contentPane.add(txtCity);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(314, 20, 61, 16);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(72, 86, 61, 16);
		contentPane.add(lblState);
		
		txtState = new JTextField();
		txtState.setColumns(10);
		txtState.setBounds(72, 114, 130, 26);
		contentPane.add(txtState);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setBounds(225, 86, 61, 16);
		contentPane.add(lblZip);
		
		txtZip = new JTextField();
		txtZip.setColumns(10);
		txtZip.setBounds(225, 114, 130, 26);
		contentPane.add(txtZip);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Person person = new Person();
				person.setName(txtName.getText());
				person.setStreet(txtStreet.getText());
				person.setCity(txtCity.getText());
				person.setState(txtState.getText());
				person.setZip(txtZip.getText());
				
				System.out.print(person);
				
			}
		});
		 
		btnSubmit.setBounds(148, 173, 117, 29);
		contentPane.add(btnSubmit);
	}
}
