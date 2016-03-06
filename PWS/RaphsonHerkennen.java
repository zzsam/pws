package PWS;

public class RaphsonHerkennen {
public static double RaphsonToewijzen(double B[],double A[], boolean sin[],boolean cos[],boolean tan[],boolean log[],boolean Xofniet[],double x,int aantalgroepen){
int i = 0;
double antwoord = 0;
double antwoordsave = 0;
while (i<aantalgroepen){
if(sin[i]==true){// als Sinus herkend wordt dan wordt het met antwoordsave berekend
 antwoordsave = Math.sin(x)*A[i];
}
else if(cos[i]==true&& Xofniet[i]==true){// als cosinus en een X herkend wordt dan wordt het op de manier van antwoordsave berekend
 antwoordsave = Math.cos(x)*A[i];
}
else if(tan[i]==true&& Xofniet[i]==true){// als tanges en een X herkend wordt dan wordt het op de manier van antwoordsave berekend
 antwoordsave = Math.tan(x)*A[i];
}
else if(log[i]==true&& Xofniet[i]==true){// als log en een X herkend wordt dan wordt het op de manier van antwoordsave berekend
 antwoordsave = A[i]*Math.log(x);

}
else if((B[i]<1||B[i]>1)&& Xofniet[i]==true){// als een X herkend wordt en als de macht kleiner of groter is dan 1 dan wordt het met antwoordsave berekend
 antwoordsave= Math.pow(x,B[i])*A[i];
}
else if(B[i]==1 && Xofniet[i]==true){// als een X herkend wordt en als de macht gelijk is aan 1 dan wordt het op de manier van antwoordsave berekend
 antwoordsave = A[i]*x;
 
}
else if( Xofniet[i]==false ){// als er geen x is dan wordt het met antwoordsave berekend
 
 antwoordsave = A[i];
}
antwoord= antwoord + antwoordsave;
i++;
}

return antwoord;
}
 
}