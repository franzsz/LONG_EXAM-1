import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Contacts extends MainPage {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contacts frame = new Contacts();
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
	public Contacts() {
		super();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Contacts.class.getResource("/pics/2x2 ID(1).jpg")));
		lblNewLabel.setBounds(120, 143, 343, 355);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("YOU CAN CONTACT ME THROUGH:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(473, 129, 558, 57);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("GMAIL :");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1.setBounds(473, 197, 558, 57);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("franzjarcia19@gmail.com");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_1.setBounds(473, 221, 558, 57);
		getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("PHONE NUMBER :");
		lblNewLabel_2_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_2.setBounds(473, 276, 558, 57);
		getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("09569427087");
		lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_1_1.setBounds(473, 302, 558, 57);
		getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("FACEBOOK:");
		lblNewLabel_2_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_2_1.setBounds(473, 363, 558, 57);
		getContentPane().add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("FRANZ JOHN JARCIA");
		lblNewLabel_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_1_1_1.setBounds(473, 399, 558, 57);
		getContentPane().add(lblNewLabel_2_1_1_1_1);
	}
}
