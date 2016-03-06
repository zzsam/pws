package PWS;

public class Rekenen {
	

	


	
	
//------------------------------------------------------------------------------ B R U I K B A R E   G R O E P E N ----------------------------------------------------------------------------------------
	
	// hoeveel groepen een logaritme hebben
	public static int timesLog( boolean[] A){ // Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]== true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}
	public static int timesAtotX( boolean[] A){		// Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn.
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]== true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}
	public static int timesSin(boolean[] A){	// Tellen hoeveel groepen er van de dorogegeven groepen bruikbaar zijn.
		int i = A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i] == true){
				aantal++;
			}
			i--;
			keer--;
		}
		
		return aantal;
	}
	public static int timesCos(boolean[] A){	// Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn.
		int i = A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i] == true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}
	public static int timesTan(boolean[] A){	// Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn.
		int i = A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i] == true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}
	// hoeveel groepen er werkelijk zijn(groepen met A=0 er uit halen)
	public static int timesA( double A[]){ // Tellen hoeveel groepen er van de doorgegeven groepen bruikbaar zijn
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]>0 || A[i]<0){
				aantal++;
			}
			i--;
			keer--;
		}
		
		return aantal;
	}
	// hoeveel van de groepen een macht hebben
	public static int timesB( double A[]){ // Tellen hoeveel groepen er van de doorgegeven groepen een macht hebben
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]>1.0 || A[i]<1.0){
				aantal++;					// aantal machten die aanders zijn dan 1 gaat 1 omhoog
			}
			i--;
			keer--;
		}
		return aantal;
	}
	
	public static int timesX(boolean A[]){
		int i= A.length-1;
		int aantal=0;
		int keer = A.length;
		while(keer>0){
			if(A[i]== true){
				aantal++;
			}
			i--;
			keer--;
		}
		return aantal;
	}

		

	
//-------------------------------------------------------------------------------------- O P L O S S E N -------------------------------------------------------------------------------------------------
	
	// ax^b = c hier wordt x berekend
    public static String eenTermOplossen(double a, double b, double c){
    	double xvinden;
    	xvinden = Math.pow((c/a),( 1/b));
    	String uitvoer = AntwoordControleren.controleren(xvinden);
    	if(AntwoordControleren.mooieBreuk == true){
    		return uitvoer;
    	}
    	else{
    		return c/a + "^" + 1/b;
    	}
    	
    }
    //ax^b + dx = 0 hier wordt x berekend
    public static String simpelOntbinden(double A, double kwadraat, double B){
 		double kwadraatAntwoord = 1/( kwadraat -1);
 		double antwoord = -1 * Math.pow( B/A, kwadraatAntwoord);
 		String returnwaarde;
 		String uitvoer = AntwoordControleren.controleren(antwoord);
 		if(AntwoordControleren.mooieBreuk ==true){
 		if (kwadraat >=1 || kwadraat <=-1)   {
 			if((kwadraat)%2 ==0){
 				returnwaarde = ("x= 0 of x= "+ uitvoer );
 			}	
 			else{
 		returnwaarde =("x= 0 of x= "+ antwoord+ " of bij x= "+ "-"+uitvoer);
 			}
 			}
 			else {
 					returnwaarde =("x= 0 of x= "+ uitvoer );
 			}
 		}
 		else{
 			if (kwadraat >=1 || kwadraat <=-1)   {
 	 			if((kwadraat)%2 ==0){
 	 				returnwaarde = ("x= 0 of x= " + AntwoordControleren.controleren(-(B/A))+"^"+kwadraatAntwoord );
 	 			}	
 	 			else{
 	 		returnwaarde =("x= 0 of x= " +  AntwoordControleren.controleren(-(B/A))+"^"+kwadraatAntwoord+ " of x= "+AntwoordControleren.controleren(B/A)+"^"+kwadraatAntwoord);
 	 			}
 	 			}
 	 			else {
 	 					returnwaarde =("x= 0 of x= "+ AntwoordControleren.controleren(-(B/A))+"^"+kwadraatAntwoord);
 	 			}
 	 		}
 		
 		
 		
 		return returnwaarde;
 	}
  
    // ax^2 + bx + d = c hier wordt x berekend
    public static String kwadratischeformule1(double a, double b, double c){
    	double abcd1, abcd2;
        abcd1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);    
        abcd2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        String uitvoer = AntwoordControleren.controleren(Math.max(abcd1,abcd2));
        System.out.println("MooieBreuk: "+AntwoordControleren.mooieBreuk);
        if(AntwoordControleren.mooieBreuk == true){
        	return uitvoer;
        }
        else if (Math.max(abcd1,abcd2) == abcd1){
         return "("+ -b + " + √(" + (AntwoordControleren.controleren(Math.pow(b,2) - 4*a*c)) + "))/"+ (2*a)  ; // Als het geen mooie breuk is returnt die de laatste berekening.
        }
        else  {
            return "("+-b + " - √(" + (AntwoordControleren.controleren(Math.pow(b,2) - 4*a*c)) + "))/"+ (2*a)  ;
           }						
     }
    public static String kwadratischeformule2(double a, double b, double c){
    	double abcd1, abcd2;
        abcd1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);    
        abcd2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
        String uitvoer = AntwoordControleren.controleren(Math.min(abcd1,abcd2));		// controleren of het antwoord een mooie breuk is
        System.out.println("MooieBreuk: "+AntwoordControleren.mooieBreuk);
        if(AntwoordControleren.mooieBreuk == true){
        	return uitvoer;
     
        }
        else if (Math.min(abcd1,abcd2) == abcd1){
         return "("+-b + " + √(" + (AntwoordControleren.controleren(Math.pow(b,2) - 4*a*c)) + "))/"+ (2*a)  ;	// als het geen mooie breuk is returnt hij de laatste berekening.
        }
        else  {
            return "("+-b + " - √(" + (AntwoordControleren.controleren(Math.pow(b,2) - 4*a*c)) + "))/"+ (2*a)  ;
           }													
     }
	
     //a^log x = c hier wordt x berekend
    public static String logb(double a, double c){
        double answer2;
        answer2 = (Math.pow(a,c));
        String uitvoer = AntwoordControleren.controleren(answer2);			// controleren of het antwoord een mooie breuk is
        if(AntwoordControleren.mooieBreuk == true){
        	return uitvoer;
        }
        else{
        	return "x = " + a + "^"+ c;										// als het geen mooie breuk is returnt hij de berekening
        }
       
     }
    

    
   
 
    //a * sin x = c hier wordt x berekend
    public static String Sinx(double antwoord, double a1){
		double save = StrictMath.asin(antwoord/a1);
		double breuk = save/Math.PI;													// antwoord geven in π
		String uitvoer = AntwoordControleren.controleren(breuk);						// controleren of het antwoord een mooie breuk is
		return uitvoer + "π";
	}
    //a *cos x = c hier wordt x berekend
	public static String Cosx(double antwoord, double a1){
		double save = StrictMath.acos(antwoord/a1);
		double breuk = save/Math.PI;												// antwoord geven in π
		String uitvoer = AntwoordControleren.controleren(breuk);					// controleren of het antwoord een mooie breuk is
		return uitvoer + "π";
		
	}
	//a *tan x = c hier wordt x berekend
	public static String Tanx(double antwoord, double a1){
		double save = StrictMath.atan(antwoord/a1);
		double breuk = save/Math.PI;												// antwoord geven in π
		String uitvoer = AntwoordControleren.controleren(breuk);					// controleren of het antwoord een mooie breuk is
		return uitvoer + "π";
		
	}
	
//------------------------------------------------------------------------------------ T O E W I J Z E N ----------------------------------------------------------------------------------------------------
    
	public static void toewijzen(int A, int B, int log, int Sin,int Cos, int Tan, int aantalAtotx, int X, double[]AwaardesVoorClass,double[]BwaardesVoorClass, boolean[] Atotx, double antwoord, boolean equal){   	// Alle variabelen C, in dit stuk, moeten door de UI bepaald worden
			
		//if(aantalAtotx <=1)	{
														
					if( A == 3 && B ==1 && log == 0 && Sin ==0 && Cos == 0 && Tan == 0 && BwaardesVoorClass[0] == 2 && X == 2 ){			// hierbij moet die ene macht wel gelijk zijn aan 2, anders numeriek oplossen
						
						if (GUIpws.vanafWanneerNegatief == A-1){ 
							AwaardesVoorClass[A-1] = AwaardesVoorClass[A-1]*-1;
					}
						String save = kwadratischeformule1(AwaardesVoorClass[0],AwaardesVoorClass[1],AwaardesVoorClass[2]);
						String save1 = kwadratischeformule2(AwaardesVoorClass[0],AwaardesVoorClass[1],AwaardesVoorClass[2]);
						if (save.equals(save1)){
							GUIpws.textField.setText("x = "  + save);
						}
						else{
						GUIpws.textField.setText("x = "  + save + " of " +"x = " + save1);
						}
						
						
					}
					else if( A==2 && B==1 && log == 0 && Sin ==0 && Cos == 0 && Tan == 0 && X ==2){
						GUIpws.textField.setText(	simpelOntbinden(AwaardesVoorClass[0], BwaardesVoorClass[0], AwaardesVoorClass[1]));
					}
					else if (A==2 && B==0 && log == 0 && Sin ==0 && Cos == 0 && Tan == 0 && X ==2){
						GUIpws.textField.setText("x = 0.0");
					}
					else if ( (A==1||A==2) && B==1 && log == 0 && Sin ==0&& Cos == 0 && Tan == 0 && X == 1){
						
						GUIpws.textField.setText("x = " + eenTermOplossen( AwaardesVoorClass[0], BwaardesVoorClass[0], antwoord));
					}
					
					else if ((A==2||A==1) && log == 1 && X == 1 && B==0){
						double logBase = AwaardesVoorClass[0]; 					
						GUIpws.textField.setText( logb(logBase, antwoord ));
					}
					else if((A==2||A==1) && X==1 && B==0 && Sin==0 && Cos== 0 && Tan==0 && log==0){
						
						double save = antwoord/ AwaardesVoorClass[0];
						String uitvoer = AntwoordControleren.controleren(save);
						
						GUIpws.textField.setText("x = " + uitvoer);
						
					}
					
					else if ((A==2||A==1) && Sin==1 && X == 1&& B==0){
						GUIpws.textField.setText("x = "  + Sinx(antwoord, AwaardesVoorClass[0]));
				}
					else if ((A==2||A==1) && Cos==1 && X == 1&& B==0){
						GUIpws.textField.setText("x = " + Cosx(antwoord, AwaardesVoorClass[0]));
					}
					else if ((A==2||A==1) && Tan==1 && X == 1 && B==0){
						GUIpws.textField.setText("x = " + Tanx(antwoord, AwaardesVoorClass[0]));
					}
			
				//	else if(Atotx[0] == true){
				//		if (A==1 && log ==0){
															
				//			GUIpws.textField.setText("x = " +Atotx( AwaardesVoorClass[0], antwoord ));
				//	}
	//}
				//	else if (A==2  && log ==0){			
				//		if(Atotx[1] = true){
				//			
					//		GUIpws.textField.setText("x = " + AtotXPlusB( AwaardesVoorClass[0], AwaardesVoorClass[1], antwoord ));
				//		}
					
				//	}

		//}
		
					else  {
					
			System.out.println("newton");
			
			NewtonRaphson.run();
			
		}
		
	}
    

}
