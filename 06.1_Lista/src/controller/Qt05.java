package controller;

import util.Teclado;

public class Qt05 {
public static void main(String[] args) {
	int n = Teclado.lerInt("Digite um número:");
	
	switch (n) {
	case 5:
		System.out.println("O número digitado foi 5");
		break;
	case 200:
		System.out.println("O número digitado foi 200");
		break;
	case 400:
		System.out.println("O número digitado foi 400");
		break;
	default:
		if ((n >= 500) && (n <= 1000)){
			System.out.println("O número digitado está entre 500"
					+ " e 1000");
		} else {
			System.out.println("Número digitado está fora"
					+ " dos escopos anteriores");
		}
	}
}
}
