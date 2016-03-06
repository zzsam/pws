package PWS;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

public class HelpTutorial {

	private JFrame frmTutorial;

	/**
	 * Launch the application.
	 */
	public static void TutorialScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelpTutorial window = new HelpTutorial();
					window.frmTutorial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelpTutorial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTutorial = new JFrame();
		frmTutorial.setTitle("Tutorial");
		frmTutorial.setBounds(100, 100, 573, 463);
		frmTutorial.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// Dit is zo zodat alleen de tutorial scherm afsluit en ook niet de andere rekenmachine
		frmTutorial.getContentPane().setLayout(null);
//----------------------------------------------------------------- TEXT OP TUTORIAL FRAME -----------------------------------------------------------------------------	
		JTextArea txtrHalloIkBen = new JTextArea();
		txtrHalloIkBen.setTabSize(7);
		txtrHalloIkBen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		// Uitleg tutorial
		txtrHalloIkBen.setText("\t\tAan het programma zijn er op dit moment nog een paar eisen, namelijk:\r\n\r\n- Voor een variable moet altijd een double staan: bijv. x^2.0 + 2.5 is fout. Dit ---> 1.0x^2.0 + 2.5 is goed.\r\n\r\n- Sommige vergelijkingen worden nog niet opgelost: \r\n   * bijv. 1.0x^2.0 + 3.5x + 4.6 = 12.3, dit zijn  namelijk 4 groepen. Op dit moment lost hij maximaal \r\n      vergelijkingen met 3 groepen exact op, anders doet die netwonRaphson\r\n  \r\n   * Dit betekent dat je bijv. ook niet 1.0x^2.0 + 3.5x + 4.6 = 0.0 als abc vergelijkingen kan oplossen. Dit kan \r\n      echter wel als je alleen 1.0x^2.0 + 3.5x + 4.6 opschrijft, dan stelt hij deze automatisch gelijk aan 0.\r\n   \r\n   * Functies met met sin cos tan worden alleen opgelost in de volgende vorm--> 2.0sinx = 2.0, dus\r\n      double sin x = double, of  2.0sinx. Zodra er achter een vergelijking geen = staat wordt die vergelijking \r\n      automatisch aan 0 gelijk gesteld. Ook kan je 1.0sinx + 1.0cosx + enz. = 0 oplossen\r\n\r\n   * Om een double aan de begin van een regel of na een = teken negatief te maken moet je een andere min \r\n      gebruiken dan normaal. Hiervoor gebruiken wij: \u00B1.\r\n\t \r\n   * Als je een functie wil oplossen zal je deze op een bepaalde manier moeten ordenen namelijk-->de \r\n      grootste macht eerst en dan aflopend en groepen met een x gaan voor de getallen. Ook kan je nog geen\r\n      machten op nummers.  \r\n\r\n- Ook voegt de rekenmachine groepen nog niet samen : 2.0x + 5.6 x wordt nog niet samengevoegd tot\r\n   7.6x.\r\n\r\n- Om bij de normale rekenmachine komen doe je het volgende: Options-->Weergave-->Standaard.\r\n");
		txtrHalloIkBen.setBounds(10, 32, 537, 381);
		frmTutorial.getContentPane().add(txtrHalloIkBen);
		
		JLabel lblNewLabel = new JLabel("Dit is de tutorial voor de Equation Solver \u00A9");
		lblNewLabel.setBounds(101, 11, 275, 14);
		frmTutorial.getContentPane().add(lblNewLabel);
	}
	}