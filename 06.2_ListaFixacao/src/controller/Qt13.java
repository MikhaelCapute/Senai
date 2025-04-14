package controller;

import util.Teclado;

public class Qt13 {
public static void main(String[] args) {
	System.out.println("1 - Capricórnio");
	System.out.println("2 - Aquário");
	System.out.println("3 - Peixes");
	System.out.println("4 - Áries");
	System.out.println("5 - Touro");
	System.out.println("6 - Gêmeos");
	System.out.println("7 - Câncer");
	System.out.println("8 - Leão");
	System.out.println("9 - Virgem");
	System.out.println("10 - Libra");
	System.out.println("11 - Escorpião");
	System.out.println("12 - Sagitário");
	
	int c = Teclado.lerInt("Digite o código:");
	if ((c <= 12) && (c > 0)){
		switch (c) {
		case 1:
			System.out.println("Capricórnio - 22/12 à 21/01");
			break;
		case 2:
			System.out.println("Aquário - 22/01 à 18/02");
			break;
		case 3:
			System.out.println("Peixes - 19/02 à 19/03");
			break;
		case 4:
			System.out.println("Áries - 20/03 à 20/04");
			break;
		case 5:
			System.out.println("Touro - 21/04 à 20/05");
			break;
		case 6:
			System.out.println("Gêmeos - 21/05 à 20/06");
			break;
		case 7:
			System.out.println("Câncer - 22/01 à 18/02");
			break;
		case 8:
			System.out.println("Leão - 22/07 à 22/08");
			break;
		case 9:
			System.out.println("Virgem - 23/08 à 22/09");
			break;
		case 10:
			System.out.println("Libra - 23/09 à 22/10");
			break;
		case 11:
			System.out.println("Escorpião - 23/10 à 21/11");
			break;
		case 12:
			System.out.println("Sagitário - 22/11 à 21/12");
			break;
		default:
			
		}
	}
}
}
