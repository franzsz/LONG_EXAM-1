import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Home extends MainPage {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		super();
		setTitle("Home");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/pics/289668641_472310704895130_8578588350581848792_n(1).jpg")));
		lblNewLabel.setBounds(81, 137, 357, 457);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HELLO EVERYONE! I AM");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(448, 151, 687, 81);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("FRANZ JOHN O. JARCIA");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(448, 196, 687, 81);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CURRENTLY STUDYING BSIT-MOBILE WEB APPLICATION");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1_1_1.setBounds(448, 288, 687, 81);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("AT NATIONAL UNIVERSITY-MANILA");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1_1_1_1.setBounds(448, 337, 687, 81);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
	}
}
