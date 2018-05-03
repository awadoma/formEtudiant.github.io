package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class frmtest extends JFrame {

	private JPanel contentPane;
	private JTextField textNom;
	private JTextField textPrenom;
	private JTextField txtAge;
	private JTextField txtVille;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmtest frame = new frmtest();
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
	public frmtest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNom = new JTextField();
		textNom.setBounds(101, 20, 86, 20);
		contentPane.add(textNom);
		textNom.setColumns(10);
		
		textPrenom = new JTextField();
		textPrenom.setBounds(101, 51, 86, 20);
		contentPane.add(textPrenom);
		textPrenom.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(101, 89, 86, 20);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		txtVille = new JTextField();
		txtVille.setBounds(101, 120, 86, 20);
		contentPane.add(txtVille);
		txtVille.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(34, 23, 46, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("preNom");
		lblPrenom.setBounds(34, 54, 46, 14);
		contentPane.add(lblPrenom);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(34, 79, 46, 14);
		contentPane.add(lblAge);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(22, 123, 46, 14);
		contentPane.add(lblVille);
	}
}
