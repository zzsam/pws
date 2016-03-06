package PWS;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;

public class ExtraMakers {

	private JFrame frmMakers;

	/**
	 * Launch the application.
	 */
	public static void MakersScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExtraMakers window = new ExtraMakers();
					window.frmMakers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExtraMakers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMakers = new JFrame();
		frmMakers.setTitle("Makers");
		frmMakers.setBounds(100, 100, 450, 300);
		frmMakers.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMakers.getContentPane().setLayout(null);
		
		JLabel lblGemaaktDoor = new JLabel("Gemaakt door:");
		lblGemaaktDoor.setBounds(162, 11, 129, 27);
		frmMakers.getContentPane().add(lblGemaaktDoor);
		
		JLabel lblSamHesselmans = new JLabel("Sam Hesselmans     &     Zhou Zhou Lan");
		lblSamHesselmans.setBounds(127, 108, 250, 27);
		frmMakers.getContentPane().add(lblSamHesselmans);
	}
}
