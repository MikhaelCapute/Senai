package controller;

import util.Teclado;

public class Qt11 {
public static void main(String[] args) {
	int n = Teclado.lerInt("Digite um número de 1 a 5:");
	
	switch (n) {
	case 1:
		System.out.println("Um");
		break;
		
	case 2:
		System.out.println("Dois");
		break;
		
	case 3:
		System.out.println("Três");
		break;
		
	case 4:
		System.out.println("Quatro");
		break;
		
	case 5:
		System.out.println("Cinco");
		break;
	default:
		System.out.println("Número informado não está entre 1 e 5");
	}
}
}
