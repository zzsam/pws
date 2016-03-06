package PWS;

public class NewtonRaphson {
	public static double f(double x){
		
		double antwoord = RaphsonHerkennen.RaphsonToewijzen(GUIpws.B1,GUIpws.A1,GUIpws.sin1,GUIpws.cos1, GUIpws.tan1,GUIpws.log1,GUIpws.xofniet1, x, GUIpws.AantalGroepen1  );
		
		
		return antwoord;
	}
//boolean[] sin, boolean[] log1, boolean[] tan, boolean[] cos,boolean[] xofniet
	
	public static double g(double x){ 										// dit is functie g(x), hierin g(x) = f'(x)
		double antwoordafgeleide =  (  f(x + 0.0000001)- f(x))/0.0000001;	// de afgeleide van f(x) wordt berekend in een punt
		return antwoordafgeleide;
	}
	public static double newtonRaphson(double i){
		int maximum = 0;
		double x1 = i*0.1;
		boolean doorgaan = true;

		while (doorgaan == true && maximum<=1E6){
			x1 = x1 - ((f(x1)/g(x1)));										
			maximum++;
			
			if (f(x1) <= 1E-10 && f(x1)>= (-1E-10)){
				doorgaan = false;
				if(x1 <= 1E-5 && x1>= (-1E-5)){
					x1 = 0.0;
				}
				return x1;													// Als het antwoord gevonden is, wordt dit gereturned 
			}
			
			
		}
		if(x1 <= 1E-5 && x1>= (-1E-5)){
			x1 = 0.0;
		}
		return x1;
	}
	
	public static void run(){
		double antwoord = newtonRaphson(0.1);					// De berekeningen worden maar 1 keer uitgevoerd, wat tijd bespaard
		double antwoord1 = newtonRaphson(-1E10);
		double fAntwoord = f(antwoord);															
		double fAntwoord1 = f(antwoord1);
		boolean antwoordenGelijk=false;
		
		if ((antwoord - antwoord1)<=1E-6 &&(antwoord - antwoord1)>=-1E-6 ){
			antwoordenGelijk = true;
		}
		if (fAntwoord <= 1E-10 && fAntwoord>= (-1E-10)&& fAntwoord1 <= 1E-10 && fAntwoord1 >= (-1E-10) && antwoordenGelijk == false){	// Als de antwoorden niet het zelfde zijn en het klopt dat het, het nulpunt is
			

				GUIpws.textField.setText("Benaderd tot: x= " + antwoord+ " & x= " +antwoord1);
	//	}
		}
		else if(fAntwoord <= 1E-10 && fAntwoord>= (-1E-10)){		// Als de antwoorden wel het zelfde zijn
			GUIpws.textField.setText("Benaderd tot: x= " + antwoord);
			}
		
		else{
			GUIpws.textField.setText("NaN");				// Als het antwoord niet uitkomt moet de rekenmachine dat weergeven
		}
		
	}
	
}
