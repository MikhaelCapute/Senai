package controller;

import util.Teclado;

public class Ex07 {
	public static void main(String[] args) {
		String semana[] = {"Domingo", "Segunda-Feira" , "Terça-Feira", "Quarta-Feira" , "Quinta-Feira",
				"Sexta-Feira" , "Sábado"};
		
		int opc = Teclado.lerInt("Digite um número correspondente ao dia da semana:");
		
		switch (opc) {
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
			System.out.println("Dia da semana inválido!");
		}
	}
}
