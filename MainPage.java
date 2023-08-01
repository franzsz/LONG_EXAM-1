import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1161, 633);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FRANZ JOHN O. JARCIA");
		lblNewLabel.setBounds(10, 11, 224, 38);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblNewLabel);
		
		JPanel panelHome = new JPanel();
		panelHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();
			}
		});
		panelHome.setBackground(Color.GRAY);
		panelHome.setBounds(273, 26, 163, 38);
		contentPane.add(panelHome);
		panelHome.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("HOME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 11, 143, 22);
		panelHome.add(lblNewLabel_1);
		
		JPanel panelAbout = new JPanel();
		panelAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Aboutme aboutme = new Aboutme();
				aboutme.setVisible(true);
				aboutme.setLocationRelativeTo(null);
				dispose();
			}
		});
		panelAbout.setBackground(Color.GRAY);
		panelAbout.setBounds(463, 26, 163, 38);
		contentPane.add(panelAbout);
		panelAbout.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("ABOUT ME");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 11, 143, 22);
		panelAbout.add(lblNewLabel_1_1);
		
		JPanel panelContacts = new JPanel();
		panelContacts.setBackground(Color.GRAY);
		panelContacts.setBounds(649, 26, 163, 38);
		contentPane.add(panelContacts);
		panelContacts.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("CONTACTS");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Contacts contacts = new Contacts();
				contacts.setVisible(true);
				contacts.setLocationRelativeTo(null);
				dispose();
			}
		});
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(10, 11, 143, 22);
		panelContacts.add(lblNewLabel_1_2);
		
		JPanel panelEduc = new JPanel();
		panelEduc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Educ educ = new Educ();
				educ.setVisible(true);
				educ.setLocationRelativeTo(null);
				dispose();
			}
		});
		panelEduc.setBackground(Color.GRAY);
		panelEduc.setBounds(835, 26, 192, 38);
		contentPane.add(panelEduc);
		panelEduc.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("EDUCATIONAL BACKGROUND");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 11, 172, 22);
		panelEduc.add(lblNewLabel_1_3);
		
		JPanel panelExit = new JPanel();
		panelExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			  dispose();
			}
		});
		panelExit.setBackground(Color.GRAY);
		panelExit.setBounds(1077, 21, 58, 43);
		contentPane.add(panelExit);
		panelExit.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MainPage.class.getResource("/pics/icons8-exit-50.png")));
		lblNewLabel_2.setBounds(10, 0, 56, 43);
		panelExit.add(lblNewLabel_2);
	}
}