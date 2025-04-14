package controller;

import util.Teclado;

public class Qt01 {
public static void main(String[] args) {
	int m = Teclado.lerInt("Digite um número de 0 a 12:");
	
	if (m <= 12) {
		switch (m) {
		case 1:
			System.out.println("Janeiro");
			break;
		
		case 2:
			System.out.println("Fevereiro");
			break;
		
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
			
		case 5:
			System.out.println("Maio");
			break;
		
		case 6:
			System.out.println("Junho");
			break;
		
		case 7:
			System.out.println("Julho");
			break;
			
		case 8:
			System.out.println("Agosto");
			break;
			
		case 9:
			System.out.println("Setembro");
			
		case 10:
			System.out.println("Outubro");
			break;
			
		case 11:
			System.out.println("Novembro");
			break;
			
		case 12:
			System.out.println("Dezembro");
			break;
			
		default:
			System.out.println("Inválido");
		}
	} else {
		System.out.println("Número digitado acima de 12!");
	}
}
}
