package controller;

import util.Teclado;

public class Qt03 {
public static void main(String[] args) {
	int n = Teclado.lerInt("Digite um número com 3 casas:");
	int r;
	
	if ((n > 99) && (n < 1000)) {
		r = n / 100;
		switch (r) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("UM");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		case 6:
			System.out.println("Seis");
			break;
		case 7:
			System.out.println("Sete");
			break;
		case 8:
			System.out.println("Oito");
			break;
		case 9:
			System.out.println("Nove");
			break;
		default:
			System.out.println("Inválido");
		}
	} else {
		System.out.println("Número não possui 3 algarismos.");
	}
		
}
}
