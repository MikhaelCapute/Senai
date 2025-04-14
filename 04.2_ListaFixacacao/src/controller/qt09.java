package controller;

import util.Teclado;

public class qt09 {
public static void main(String[] args) {
	int n;
	
	n = Teclado.lerInt("Digite um número de 1 a 7: ");
	
	if ((n >=1) && (n <= 7)) {
		if (n == 1) {
			System.out.println("Segunda-Feira");
		}
		if (n == 2) {
			System.out.println("Terça-Feira");
		}
		if (n == 3) {
			System.out.println("Quarta-Feira");
		}
		if (n == 4) {
			System.out.println("Quinta-Feira");
		}
		if (n == 5) {
			System.out.println("Sexta-Feira");
		}
		if (n == 6) {
			System.out.println("Sábado");
		}
		if (n == 7) {
			System.out.println("Domingo");
		}
		
	} else {
		System.out.println("Somente números de 1 a 7.");
	}
}
}
