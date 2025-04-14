package controller;

import util.Teclado;

public class Qt07 {
	public static void main(String[] args) {

		String semana[] = { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", 
				"Quinta-feira", "Sexta-feira", "Sábado" };
		int num = Teclado.lerInt("Digite um número");

		switch (num) {
		case 1:
			System.out.println(semana[0]);
			break;
		case 2:
			System.out.println(semana[1]);
			break;
		case 3:
			System.out.println(semana[2]);
			break;
		case 4:
			System.out.println(semana[3]);
			break;
		case 5:
			System.out.println(semana[4]);
			break;
		case 6:
			System.out.println(semana[5]);
			break;
		case 7:
			System.out.println(semana[6]);
			break;
		default:
			System.out.println("Número não corresponde a um dia da semana");
		}

	}
}
