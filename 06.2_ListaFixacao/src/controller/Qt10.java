package controller;

public class Qt10 {
public static void main(String[] args) {
	
	double chico = 1.50, juca = 1.1;
	int ano = 0;
	
	while (juca < chico) {
		
		chico += 0.02;
		juca += 0.03;
		ano ++ ;
		System.out.println("Chico:" + chico +", Juca:" + juca + ", ano: " + ano);
		
	}
	System.out.println("São necessários " + ano + " anos");
}
}
