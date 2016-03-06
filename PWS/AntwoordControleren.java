package PWS;

public class AntwoordControleren {
		static boolean mooieBreuk = false;
	
	public static String controleren(double b){
		double c;
		boolean negatief = false;
		if(b<=0){
		 c = (b%1)*-1;
		 negatief = true;
	}
	else{
		 c = (b%1);
	}
		System.out.println("b"+ b+ "c"+ c);
	double breukAntwoord;
	boolean doorgaan = true;
	String returnBreuk = null;
	for(double i = 0; doorgaan == true&&i<=100;i++){						// Deze fors gaan 0/0 tot 100/100 af om te kijken of het een breuk is 
		mooieBreuk = false;
		for(double n = 0;doorgaan == true&& n<100;n++){
			mooieBreuk = false;																// de variabele wordt gereset
			breukAntwoord = i/n;
			
			if ( (c - breukAntwoord)<=1E-6 &&(c - breukAntwoord)>=-1E-6){					// omdat doubles niet oneindig precies zijn wordt het binnen een bepaalde marge berekent.
				
				mooieBreuk = true;
				if (negatief ==true){
					c = c*-1;
					
					if (breukAntwoord!= 0.0&&(b-c)!= 0.0){
						returnBreuk = (int)(b-c)+" "+ (int)i+"/"+(int)n;				// getal met daarachter een breuk
						}
						else if ((b-c)!= 0.0){
							returnBreuk =(int)(b-c)+"";					// alleen het getal
						}
						else if(breukAntwoord!= 0.0){
									
							i = i*-1;
							returnBreuk = "-("+(int)(-1*i)+"/"+(int)n+")";		//  alleen de breuk	
						}
						else{
							returnBreuk =b+ "";
						}
				}
				else{
				if (breukAntwoord!= 0.0&&(b-c)!= 0.0){						// het zelfde als bij negatief
				returnBreuk =(int)(b-c)+" "+  (int)i+"/"+(int)n;
				}
				else if ((b-c)!= 0.0){
					returnBreuk =(int)(b-c)+"";
				}
				else if(breukAntwoord!= 0.0){
					System.out.println("i: "+ i +" n: "+ n );
					returnBreuk = "("+ (int)i+"/"+(int)n+")";
				}
				else{
					returnBreuk =b+ "";
				}
				}
				doorgaan = false;
				
			}
		}
	}
	
	if(returnBreuk == null){
		returnBreuk= b+"";				// het wordt als string gereturnt.
	}
		
		return returnBreuk;
	}
}
