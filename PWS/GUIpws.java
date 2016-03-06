package PWS;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionListener;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class GUIpws implements ActionListener{			// We gebruiken dit omdat we dit toen het makkelijkst vonden
	private JFrame frmEquationSolver;
	static JTextField textField;
	 static boolean negatief = false;
	 static boolean equal = false;
	 static int wanneerNegatief = -1;
	 static int vanafWanneerNegatief = -1;
	 static int AantalGroepen1; 
		static double[] A1 ;
		static double[] B1 ;
		static boolean[] sin1 ;
		static boolean[] cos1 ;
		static boolean[] tan1 ;
		static boolean[] log1 ;
		static boolean[] aTotX1 ;
		static boolean[] xofniet1 ;
	 

	/**
	 * Launch the application.
	 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {										// Het frame opstarten
						GUIpws window = new GUIpws();
						window.frmEquationSolver.setVisible(true);						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public GUIpws() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frmEquationSolver = new JFrame();
			frmEquationSolver.setTitle("Equation Solver \u00A9");
			frmEquationSolver.setBounds(100, 100, 610, 482);							//Het frame bepaalde grootes en andere eigenschappen geven
			frmEquationSolver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmEquationSolver.getContentPane().setLayout(null);
			frmEquationSolver.setResizable(false);
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
			textField.setBounds(6, 17, 586, 83);
			frmEquationSolver.getContentPane().add(textField);
			textField.setColumns(10);
	//-------------------------------------------------------------------------BUTTONS-EN-MENUITEMS-----------------------------------------------	
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBounds(0, 111, 592, 291);
			frmEquationSolver.getContentPane().add(panel);
			
			JButton button_1 = new JButton("x");
			button_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
			button_1.setBounds(52, 185, 89, 45);
			button_1.addActionListener(this);
			panel.add(button_1);
			
			JButton button_2 = new JButton("^");
			button_2.addActionListener(this);
			
			button_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_2.setBounds(52, 243, 89, 45);
			panel.add(button_2);
			
			JButton button_3 = new JButton("sin");
			button_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_3.setBounds(52, 75, 89, 45);
			button_3.addActionListener(this);
			panel.add(button_3);
			
			JButton button_4 = new JButton("cos");
			button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_4.setBounds(52, 17, 89, 45);
			button_4.addActionListener(this);
			panel.add(button_4);
			
			JButton button_5 = new JButton("tan");
			button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_5.setBounds(153, 17, 89, 45);
			button_5.addActionListener(this);
			panel.add(button_5);
			
			JButton button_12 = new JButton("+");
			button_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_12.setBounds(456, 185, 89, 45);
			button_12.addActionListener(this);
			panel.add(button_12);
			
			JButton button_13 = new JButton("-");
			button_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_13.setBounds(456, 127, 89, 45);
			button_13.addActionListener(this);
			panel.add(button_13);
			
			JButton button_14 = new JButton("/");
			button_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_14.setBounds(456, 17, 89, 45);
			button_14.addActionListener(this);
			panel.add(button_14);
			
			JButton button_15 = new JButton("*");
			button_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_15.setBounds(456, 75, 89, 45);
			button_15.addActionListener(this);
			panel.add(button_15);
			
			JButton button_17 = new JButton("=");
			button_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_17.setBounds(355, 243, 89, 45);
			button_17.addActionListener(this);
			panel.add(button_17);
			
			JButton button_18 = new JButton("0");
			button_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_18.setBounds(153, 243, 89, 45);
			button_18.addActionListener(this);
			panel.add(button_18);
			
			JButton button_19 = new JButton("2");
			button_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_19.setBounds(254, 185, 89, 45);
			button_19.addActionListener(this);
			panel.add(button_19);
			
			JButton button_20 = new JButton("1");
			button_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_20.setBounds(153, 185, 89, 45);
			button_20.addActionListener(this);
			panel.add(button_20);
			
			JButton button_21 = new JButton("3");
			button_21.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_21.setBounds(355, 185, 89, 45);
			button_21.addActionListener(this);
			panel.add(button_21);
			
			JButton button_22 = new JButton("4");
			button_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_22.setBounds(153, 133, 89, 45);
			button_22.addActionListener(this);
			panel.add(button_22);
			
			JButton button_23 = new JButton("5");
			button_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_23.setBounds(254, 133, 89, 45);
			button_23.addActionListener(this);
			panel.add(button_23);
			
			JButton button_24 = new JButton("6");
			button_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_24.setBounds(355, 133, 89, 45);
			button_24.addActionListener(this);
			panel.add(button_24);
			
			JButton button_25 = new JButton("7");
			button_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_25.setBounds(153, 75, 89, 45);
			button_25.addActionListener(this);
			panel.add(button_25);
			
			JButton button_26 = new JButton("8");
			button_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_26.setBounds(254, 75, 89, 45);
			button_26.addActionListener(this);
			panel.add(button_26);
			
			JButton button_27 = new JButton("9");
			button_27.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_27.setBounds(355, 75, 89, 45);
			button_27.addActionListener(this);
			panel.add(button_27);
			
			JButton button_28 = new JButton(".");
			button_28.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_28.setBounds(254, 243, 89, 45);
			button_28.addActionListener(this);
			panel.add(button_28);
			
			JButton button_29 = new JButton("\u00B1");
			button_29.setFont(new Font("Tahoma", Font.PLAIN, 18));
			button_29.setBounds(456, 243, 89, 45);
			button_29.addActionListener(this);
			panel.add(button_29);
			
			JButton btnLog = new JButton("log");
			btnLog.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnLog.setBounds(52, 133, 89, 45);
			btnLog.addActionListener(this);
			panel.add(btnLog);
			
			JButton btnDelete = new JButton("Delete");
			btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnDelete.setBounds(254, 17, 89, 45);
			btnDelete.addActionListener(this);
			panel.add(btnDelete);
			
			JButton btnSolve = new JButton("Solve");
			btnSolve.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnSolve.setBounds(355, 17, 89, 45);
			btnSolve.addActionListener(this);
			panel.add(btnSolve);

			
			JMenuBar menuBar = new JMenuBar();
			frmEquationSolver.setJMenuBar(menuBar);
			
			JMenu mnOptions = new JMenu("Options");
			menuBar.add(mnOptions);
			JMenu mnWeergave = new JMenu("Weergave");
			mnOptions.add(mnWeergave);
			
			JMenuItem mntmStandaardRekenmachine = new JMenuItem("Standaard");
			mnWeergave.add(mntmStandaardRekenmachine);
			mntmStandaardRekenmachine.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					StandaardRekenmachine.StandaardFrame();
				}
			});

			JMenuItem mntmClose = new JMenuItem("Close");
			mnOptions.add(mntmClose);
			mntmClose.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.exit(0);
				}
			});
			
			JMenu mnHelp = new JMenu("Help");
			menuBar.add(mnHelp);
			JMenuItem mntmTutorial = new JMenuItem("Tutorial");
			mnHelp.add(mntmTutorial);
			mntmTutorial.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					HelpTutorial.TutorialScreen();
				}
			});
			
			JMenu mnExtra = new JMenu("Extra");
			menuBar.add(mnExtra);
			JMenuItem mntmMakers = new JMenuItem("Makers");
			mnExtra.add(mntmMakers);
			mntmMakers.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					ExtraMakers.MakersScreen();
				}
			});
		

	}
//------------------------------------------------------------------------------------- METHODES ---------------------------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) { 			
		String name = e.getActionCommand();				//Als de naam overeenkomt wordt de bijbehoordene actie uitgevoerd. 
		if(name.equals("Delete")){
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
		else if (name.equals("Solve")){
			omschrijven();
		}
		else{
			String save;
			save = textField.getText();
			textField.setText(save + name);
		}
		}
	//----------------------------------------------------------------------------- HERKENNEN VAN GROEPEN EN TEKENS---------------------------------------------------------------------------------------	
	public static void omschrijven(){      // Het herkennen van verschillen groepen met zijn eigen tekens
		String saveText = textField.getText();
		
		int savei1=0;
		int savei2 = 0;
		boolean Continue = true;
		String[] doublePart = new String[Aantalgroepen(saveText)];
		
		int i = 0;
		int keer = 0;
		while( Continue == true && i<saveText.length()-1){
			
			savei1 = savei2;
			//Als er een een van deze tekens voorkomt is de volgende groep nog niet begonnen. 
			while(saveText.charAt(i) == '+' || saveText.charAt(i) == '-' || saveText.charAt(i) == '*' || saveText.charAt(i) == '/' || saveText.charAt(i) == '='|| saveText.charAt(i) == ' '){
				i++;
			
			}
			//Als de volgende groep begint
			if(saveText.charAt(i) != '+' && saveText.charAt(i) != '-' && saveText.charAt(i) != '*' && saveText.charAt(i) != '/' && saveText.charAt(i) != '='&& saveText.charAt(i) != '.' ){
				
				
				if(saveText.charAt(i) == '±'){		// als dit teken gevonden wordt voor een groep is die groep negatief
				savei1 = i+1;	// savei1 is het begin van een groep
				
				wanneerNegatief = keer;
				}
				else{
					savei1 = i;						
				}
			}
			// Als de String gelezen uit het scherm afgelopen is of er wordt weer een van de onderstaande tekens gevonden is dat het einde van een groep
			while ( i<saveText.length()-1 && saveText.charAt(i) != '+' && saveText.charAt(i) != '-' && saveText.charAt(i) != '*' && saveText.charAt(i) != '/' && saveText.charAt(i) != '='){
				i++;			// zoland de tekens niet gevonden worden gaat i steeds 1 omhoog
			}
			if (saveText.charAt(i) == '+' || saveText.charAt(i) == '-' || saveText.charAt(i) == '*' || saveText.charAt(i) == '/' || saveText.charAt(i) == '='){
				savei2 = i;							// save i 2 is het eind van een groep.
			}
			if (i== saveText.length()-1 && i != savei2){
				savei2 = i;
				
			}
			int n = savei1;			
			while(n <=savei2){
				if(saveText.charAt(n) == '±' ){						
					n++;
					wanneerNegatief = keer;			//hier wordt toegezewen in welke groep het negatief teken voorkomt
				}
				
				if (doublePart[keer] == null){					// hier worden alle losse tekens bij elkaar opgeteld tot een String in een Array
					doublePart[keer] = "" + saveText.charAt(n);
				}
				else{
					doublePart[keer] = doublePart[keer] + saveText.charAt(n);
				}
				
				doublePart[keer] = doublePart[keer].replaceAll("\\s+","");	//Hier worden alle spaties uit die string gehaald. 
				n++;
				
			}		
			if (i == saveText.length()-1){ 
				Continue = false;				// als de lengte van de String uit het textfield is bereikt moet hij niet nog een keer worden uitgevoerd
			}
			int n1= 0;
			while(doublePart[keer].charAt(n1)!= 'x' && n1 < doublePart[keer].length()-1){
				n1++;
			}
			
			keer++;	
		}
		
		doubleOnttrekken(doublePart);					// Hier wordt met de gevonden groepen doubleOntrekken gestart
		
		
	}
	//------------------------------------------------------------------------------------- ONTTREKKEN ---------------------------------------------------------------------------------------
	public static void doubleOnttrekken(String[] strings){// hier worden de groepen herkend
		 int AantalGroepen = Aantalgroepen(textField.getText());
		 double[] A = new double[AantalGroepen];
		 double[] B = new double[AantalGroepen];				// er zijn twee versies van elke double array, zodat we ze kunnen ordennen.
		 
		 boolean[] sin = new boolean[AantalGroepen];
		 boolean[] cos = new boolean[AantalGroepen];
		 boolean[] tan = new boolean[AantalGroepen];
		 boolean[] log = new boolean[AantalGroepen];
		 boolean[] aTotX = new boolean[AantalGroepen];
		 boolean[] xofniet = new boolean[AantalGroepen];
		 double antwoord = 0.0;
		 
		 int savei = 0;
//patrooon dat te maken heeft met de vergelijking die je invoert. //d betekent dat het een digit kan zijn. Het punt betekent dat er een decimaal is. Sin,cos,tan en log kunnen er ook in zitten.
		Pattern p = Pattern.compile("(\\d*.\\d*)\\s?(sin|cos|tan|log)?\\s?(.*)");		// De dingen waar de matcher naar moet zoeken

		  for(int i=0 ;i<strings.length;i++){
			  int index3 = 0;
		     Matcher m = p.matcher(strings[i]);
		      if (m.matches()){
		    	  		// er zijn drie dingen die worden afgesplitst
		      String extractedNumerical = m.group(1);	// De doubles aan de voorkant van de groep							
		      String gonioExtract = m.group(2);         // sin, cos, tan of log   
		      String extractedRemainder = m.group(3);    //het overige zoals machten enz.
		      double d = Double.parseDouble(extractedNumerical);
		      
		     
		     if( negatief == true){
		    	
		    	 A[i] = d*(-1); // als A negatief is moet de gevonden double *-1 gedaan worden
		    	  
		      negatief = false;						// negatief wordt weer terug gezet zodat het weer gebruikt kan worden voor de volgende groep
		     }
		     else{
		    	 A[i] = d;	// als hij niet negatief is
		    	
		    	  }
		   
		      if(gonioExtract != null){           //goniometrische Tekens worden hier uit gehaald
		      if(gonioExtract.equals("sin") ){    // Sinus wordt eruit gehaald
		    	  
		    	  sin[i] = true;
		      }
		      else if(gonioExtract.equals("cos") ){// cosinus wordt eruit gehaald
		    	  cos[i] = true;
		      }
		      else if(gonioExtract.equals("tan") ){// tanges wordt eruit gehaald
		    	  tan[i] = true;
		      }
		      else if(gonioExtract.equals("log")){// log wordt eruit gehaald
		    	  log[i] = true;
		      }
		     }
	    
		      int index = 0;
		      if (extractedRemainder.length() == 0){		// Als remainder niks is moet dit gebeuren, anders runt het volgende deel niet 
		    	  extractedRemainder = " ";
		    	 
		    	  
		      }
		      boolean doorgaan = true;
		      
		      while (index <= extractedRemainder.length()-1){              //Dit deel gaat de remainder langs
		    	  while( index3 <= extractedRemainder.length()-1 && doorgaan == true){		
		    			if(extractedRemainder.charAt(index3) == '^'){			
		    				
		    				doorgaan = false;						// als een dakje wordt gevonden moet de while niet nog een keer worden uitgevoerd
		    			}
		    			
		    				index3++;		
		    				
		    			}
		    	
		    			if (doorgaan == true){						// als er geen dakje is gevonden wordt de macht 1.0
		    				
		    				B[i] = 1.0;	// de macht wordt 1
		    			
		    			}	
		    			
		    			
		    		if(extractedRemainder.charAt(index) == 'x'){
		    			
						xofniet[i] = true;							// hier scant de code of er een x in de remainder zit
					}
		    			aTotX[i] = false;
		    		index++;
		    	}
		      
		      	int start = index3  ;							//hij moet doorgaan totdat het einde van de groep is gevonden
				while(start < extractedRemainder.length()-1 && doorgaan == false &&( extractedRemainder.charAt(start) != '+' && extractedRemainder.charAt(start) != '-'&& extractedRemainder.charAt(start) != '*'&& extractedRemainder.charAt(start) != '/'&& extractedRemainder.charAt(start) != '=')){
																							
					start++;								
				}
				
				if (extractedRemainder.charAt(extractedRemainder.length()-1) == '-'){			// als het einde van de groep een min is moet de volgende groep negatief zijn
					negatief = true;
					
				}
				else if (extractedRemainder.charAt(extractedRemainder.length()-1) == '='){		// als er een =  wordt gevonden moet de volgende groep of het antwoord zijn, of negatief zijn
					savei = i;
					vanafWanneerNegatief = i + 1;
					equal = true;
				}
				System.out.println(start + " "+(extractedRemainder.length()-1) );
				if((start < extractedRemainder.length()-1 && (extractedRemainder.charAt(start) == '+' ||extractedRemainder.charAt(start) == '-'||extractedRemainder.charAt(start) == '*'||extractedRemainder.charAt(start) == '/'||extractedRemainder.charAt(start) == '='))|| start == extractedRemainder.length()-1){
					System.out.println("üitgevoerd"+ i);
					B[i] = charStringToDouble(index3, start-1, extractedRemainder);		// als er een macht is moet die er nog uitworden gehaald
					
					
					
				}
			
				
 
		     
		      } 
		      else {
		  System.out.println("Er ging iets fout" );
	   }
		    }
		  for(int i = 0;i<A.length;i++){
		  
		  
		
		  if(wanneerNegatief == i){
			
			  A[i] = A[i] * -1;
				// als de groep een negatief teken voor zich had wordt het nu negatief gemaakt
			  wanneerNegatief = -1;			// de varaiabele wordt weer gereset 
		  }
		  if (vanafWanneerNegatief != -1 && i >= vanafWanneerNegatief && i<AantalGroepen-2){
			  A[i] = A[i] * -1;
				// als er meerdere groepen na een = staan worden die negatief gemaakt(ze worden naar de andere kant gehaald
		  }
		  else if ( savei < i ){
			  
			  antwoord = A[i];						// als er maar 1 groep is na een = dan wordt dat het antwoord
		  }
	
		  }

		 
		 AantalGroepen1 =   AantalGroepen;
			 A1=A ;								// waardes worden opgeslagen zodat newtonRaphson ze kan aanroepen
			 B1 =B;
			 sin1 =sin;
			 cos1 =cos;
			 tan1 =tan;
			 log1 =log;
			xofniet1 =xofniet;
			 							// rekenen wordt geopend
		  Rekenen.toewijzen(Rekenen.timesA(A), Rekenen.timesB(B),	Rekenen.timesLog( log), Rekenen.timesSin( sin), Rekenen.timesCos( cos), Rekenen.timesTan( tan), Rekenen.timesAtotX( aTotX), Rekenen.timesX(xofniet),A,B, aTotX, antwoord, equal);
	
	}
//------------------------------------------------------------------------------------- parseDouble---------------------------------------------------------------------------------------
	public static double charStringToDouble(int index3, int start, String extractedRemainder){
		int n = index3;
		String index4 = null;
		while(n <=start){
			if (index4 == null){
				index4 = "" + extractedRemainder.charAt(n);					// de cijfer tekens in de remainder worden omgezet tot een String
			}
			else{
				index4 = index4 + extractedRemainder.charAt(n);
			}
			index4 = index4.replaceAll("\\s+","");						// Alle spaties worden weggehaald
			n++;
	}
		System.out.println(index4);
		return Double.parseDouble(index4);// returned de double van de string
	}
	
	//------------------------------------------------------------------------------------- Aantal groepen tellen ---------------------------------------------------------------------------------------
	public static int Aantalgroepen(String s){ // telt aantal groepen van wat er ingevoerd wordt
		int length = s.length();
		int count = 0;
		int i = 0;
		while (i < length) {
		if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '=') {	// het aantal groepen wordt geteld
		count++;
		
		}
		i++;
		
		}
		count++;
		
		return count;
	}

}