package PWS;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class StandaardRekenmachine {
	double PlusMin;
	double waarde1;
	double waarde2;
	String teken;
	double resultaat;
	//controle button klik
	int plusClick;
	int minClick;
	int vermenigvuldigClick;
	int deelClick;
	int machtClick;
	int wortelClick;
	int decimaalClick;

	private JFrame frmStandaardRekenmachine;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void StandaardFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StandaardRekenmachine window = new StandaardRekenmachine();
					window.frmStandaardRekenmachine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StandaardRekenmachine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandaardRekenmachine = new JFrame();
		frmStandaardRekenmachine.setResizable(false);
		frmStandaardRekenmachine.setTitle("Standaard Rekenmachine");
		frmStandaardRekenmachine.setBounds(100, 100, 323, 383);
		frmStandaardRekenmachine.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmStandaardRekenmachine.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 11, 295, 40);
		frmStandaardRekenmachine.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 51, 295, 40);
		frmStandaardRekenmachine.getContentPane().add(textField_1);
//--------------------------------------------------------------------Nummer Buttons---------------------------------------------------------------------------		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_0.getText());
			}
		});
		button_0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_0.setBounds(10, 302, 110, 40);
		frmStandaardRekenmachine.getContentPane().add(button_0);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_1.getText());
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBounds(10, 251, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_2.getText());
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_2.setBounds(70, 251, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_3.getText());
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_3.setBounds(130, 251, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_4.getText());
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_4.setBounds(10, 200, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_5.getText());
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_5.setBounds(70, 200, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_6.getText());
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_6.setBounds(130, 200, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_7.getText());
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_7.setBounds(10, 149, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_8.getText());
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_8.setBounds(70, 149, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+button_9.getText());
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_9.setBounds(130, 149, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_9);
		//--------------------------------------------------------------------Tekens Buttons---------------------------------------------------------------------------			
		JButton button_decimalen = new JButton(".");
		button_decimalen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(decimaalClick==0){
				textField.setText(textField.getText()+button_decimalen.getText());//weergeeft punt op textfield
				decimaalClick=3;//zorgt ervoor dat je alleen 1 keer het punt-knopje kan klikken
			}
			}
		});
		button_decimalen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_decimalen.setBounds(130, 302, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_decimalen);
		
		JButton button_Plus = new JButton("+");
		button_Plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waarde1=Double.parseDouble(textField.getText());// eerste waarde komt terug als een double op de textfield
				textField.setText("");// waarde1 verdwijnt als je op het plus-knopje klikt
				teken = "+"; 
				plusClick=1;// zorgt ervoor dat je alleen maar 1 keer op het knopje klikt
			}
		});
		button_Plus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Plus.setBounds(190, 302, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_Plus);
		
		
		JButton button_Min = new JButton("-");
		button_Min.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					waarde1=Double.parseDouble(textField.getText());// eerste waarde komt terug als een double op de textfield
					textField.setText("");// waarde1 verdwijnt als je op het min-knopje klikt
					teken = "-"; 
					minClick=1;// zorgt ervoor dat je alleen maar 1 keer op het minknopje klikt
				}
			});
		button_Min.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Min.setBounds(190, 251, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_Min);
		
		JButton button_Vermenigvuldigen = new JButton("*");
		button_Vermenigvuldigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waarde1=Double.parseDouble(textField.getText());// eerste waarde komt terug als een double op de textfield
				textField.setText("");// waarde1 verdwijnt als je op het keer-knopje klikt
				teken = "*"; 
				vermenigvuldigClick=1;// zorgt ervoor dat je alleen maar 1 keer op het keerknopje klikt
			}
		});
		button_Vermenigvuldigen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Vermenigvuldigen.setBounds(190, 200, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_Vermenigvuldigen);
		
		JButton button_Delen = new JButton("/");
		button_Delen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waarde1=Double.parseDouble(textField.getText()); // eerste waarde komt terug als een double op de textfield
				textField.setText("");// waarde1 verdwijnt als je op het deel-knopje klikt
				teken = "/"; 
				deelClick=1; // zorgt ervoor dat je alleen maar 1 keer op het deelknopje klikt
			}
		});
		button_Delen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_Delen.setBounds(250, 149, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_Delen);
		
		JButton button_PosNeg = new JButton("+/-");
		button_PosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlusMin=(Double.parseDouble(String.valueOf(textField.getText())));
				PlusMin=PlusMin*(-1); // dit zorgt ervoor dat de ingevoerde waarde negatief wordt als je op het plusmin knopje klikt. Negatief kan ook positief worden
				textField.setText(String.valueOf(PlusMin));	
			}
		});
		button_PosNeg.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_PosNeg.setBounds(130, 98, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(button_PosNeg);
		
		JButton Wortel = new JButton("\u221A"); // wortel button
		Wortel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waarde1=Double.parseDouble(textField.getText());// eerste waarde komt terug als een double op de textfield
				teken = "\u221A";
				wortelClick=1;
			}
		});
		Wortel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Wortel.setBounds(190, 149, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(Wortel);
		
		JButton macht = new JButton("^");//macht button
		macht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waarde1=Double.parseDouble(textField.getText());// eerste waarde komt terug als een double op de textfield
				textField.setText("");
				teken = "^"; 
				machtClick=1;

			}
		});
		macht.setFont(new Font("Tahoma", Font.PLAIN, 10));
		macht.setBounds(250, 200, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(macht);
//--------------------------------------------------------------------Reken Methodes(=) ---------------------------------------------------------------------------		
		JButton Resultaat = new JButton("=");
		Resultaat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				waarde2 = Double.parseDouble(textField.getText());
				if(teken == "+"){   // optelling van twee waardes
					resultaat = waarde1 + waarde2;
					textField_1.setText(String.valueOf(resultaat));			
				}
				else if(teken == "-"){  // aftrekking van twee waardes
					resultaat = waarde1 - waarde2;
					textField_1.setText(String.valueOf(resultaat));
				}
				else if(teken == "*"){  // vermenigvuldiging van twee waardes
					resultaat = waarde1 * waarde2;
					textField_1.setText(String.valueOf(resultaat));
			}
				else if(teken == "/"){  //deling van twee waardes
					resultaat = waarde1 / waarde2;
					textField_1.setText(String.valueOf(resultaat));
				}
				else if (teken == "^"){// waarde 1^waarde 2
					resultaat = Math.pow(waarde1, waarde2);
					textField_1.setText(String.valueOf(resultaat));
				}
				else if (teken == "\u221A"){//wortel van waarde1
					resultaat = Math.sqrt(waarde1);
					textField_1.setText(String.valueOf(resultaat));
			}
			}
		});

				Resultaat.setFont(new Font("Tahoma", Font.PLAIN, 18));
				Resultaat.setBounds(250, 251, 50, 91);
				frmStandaardRekenmachine.getContentPane().add(Resultaat);
		
//--------------------------------------------------------------------Clear and Delete Buttons---------------------------------------------------------------------------				
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // verwijdert wat er in de eerste textField en tweede textField staat
				textField.setText("");
				textField_1.setText("");
				decimaalClick=0;
			}
			
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(70, 98, 50, 40);
		frmStandaardRekenmachine.getContentPane().add(btnClear);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // Verwijdert de laatste ingevoerde teken of cijfer in de eerste textField
					String save;
					save = textField.getText();
					textField.setText("");
					int n = save.length();
					int i = 0;
					while( i <n-1){
						String whileSave = textField.getText();
						
						textField.setText(whileSave + save.charAt(i));
						i++;
					}
				}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDelete.setBounds(190, 98, 110, 40);
		frmStandaardRekenmachine.getContentPane().add(btnDelete);

	}
		
}


