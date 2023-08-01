import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class Educ extends MainPage {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Educ frame = new Educ();
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
	public Educ() {
		super();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Educ.class.getResource("/pics/photo1685884530(1).jpeg")));
		lblNewLabel.setBounds(77, 106, 292, 371);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Educ.class.getResource("/pics/photo1685884241(1).jpeg")));
		lblNewLabel_1.setBounds(456, 106, 292, 371);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Educ.class.getResource("/pics/289668641_472310704895130_8578588350581848792_n(2).jpg")));
		lblNewLabel_2.setBounds(807, 106, 292, 371);
		getContentPane().add(lblNewLabel_2);
		
		JTextArea txtrFsasfsfs = new JTextArea();
		txtrFsasfsfs.setBackground(Color.GRAY);
		txtrFsasfsfs.setEditable(false);
		txtrFsasfsfs.setFont(new Font("Monospaced", Font.BOLD, 17));
		txtrFsasfsfs.setText("NEW ERA ELEMENTARY SCHOOL\r\n2009-2015\r\nSTAR SECTION(GRADE 2-6)");
		txtrFsasfsfs.setBounds(77, 488, 292, 95);
		getContentPane().add(txtrFsasfsfs);
		
		JTextArea txtrSscrManila = new JTextArea();
		txtrSscrManila.setText("SSC-R MANILA\r\n2015-2019\r\nSTUDENT ATHLETE\r\n");
		txtrSscrManila.setFont(new Font("Monospaced", Font.BOLD, 17));
		txtrSscrManila.setEditable(false);
		txtrSscrManila.setBackground(Color.GRAY);
		txtrSscrManila.setBounds(456, 488, 292, 95);
		getContentPane().add(txtrSscrManila);
		
		JTextArea txtrNewEraUniversity = new JTextArea();
		txtrNewEraUniversity.setText("NEW ERA UNIVERSITY\r\n2019-2021\r\nWITH HONOR\r\n");
		txtrNewEraUniversity.setFont(new Font("Monospaced", Font.BOLD, 17));
		txtrNewEraUniversity.setEditable(false);
		txtrNewEraUniversity.setBackground(Color.GRAY);
		txtrNewEraUniversity.setBounds(807, 488, 292, 95);
		getContentPane().add(txtrNewEraUniversity);
		
	}
}
