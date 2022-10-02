package lab6_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmString extends JFrame {

	private JPanel contentPane;
	private JTextField txtIn;
	private JTextField txtOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmString frame = new frmString();
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
	public frmString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCountLetter = new JButton("Count Letter");
		btnCountLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = new Util().countLetter(txtIn.getText());  
				txtOut.setText(  String.valueOf(i));
			}
		});
		btnCountLetter.setBounds(30, 6, 164, 29);
		contentPane.add(btnCountLetter);
		
		JButton btnReverseLetter = new JButton("Reverse Letter");
		btnReverseLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = new Util().reverseLetter(txtIn.getText());
				txtOut.setText(result);
			}
			
		});
		btnReverseLetter.setBounds(30, 47, 164, 29);
		contentPane.add(btnReverseLetter);
		
		JButton btnRemoveDuplicates = new JButton("Remove Duplicates");
		btnRemoveDuplicates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = new Util().removeDuplicates(txtIn.getText());
				txtOut.setText(result);
			}
		});
		btnRemoveDuplicates.setBounds(30, 88, 164, 29);
		contentPane.add(btnRemoveDuplicates);
		
		txtIn = new JTextField();
		txtIn.setBounds(211, 39, 192, 26);
		contentPane.add(txtIn);
		txtIn.setColumns(10);
		
		txtOut = new JTextField();
		txtOut.setColumns(10);
		txtOut.setBounds(211, 88, 192, 26);
		contentPane.add(txtOut);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(214, 19, 61, 16);
		contentPane.add(lblInput);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(214, 71, 61, 16);
		contentPane.add(lblOutput);
	}

}
