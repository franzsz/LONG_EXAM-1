import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Aboutme extends MainPage {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aboutme frame = new Aboutme();
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
	public Aboutme() {
		super();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Aboutme.class.getResource("/pics/My Life(1).png")));
		lblNewLabel.setBounds(29, 103, 533, 467);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MYSELF");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(572, 103, 533, 56);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- STUDENT ATHLETE IN HIGH SCHOOL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(582, 170, 553, 47);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("- 20 YEARS OLD");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1.setBounds(582, 215, 553, 47);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("- LOVES TO HANGOUT WITH MY FRIENDS");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_1.setBounds(582, 258, 553, 47);
		getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("HOBBIES");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(572, 318, 533, 56);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("- BASKETBALL");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_1_1.setBounds(582, 373, 553, 47);
		getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("- VOLLEYBALL");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_1_1_1.setBounds(582, 417, 553, 47);
		getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("- VIDEO GAMES");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_1_1_1_1.setBounds(582, 456, 553, 47);
		getContentPane().add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("- BILLIARDS");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(582, 496, 553, 47);
		getContentPane().add(lblNewLabel_2_1_1_1_1_1_1);
	}

}
