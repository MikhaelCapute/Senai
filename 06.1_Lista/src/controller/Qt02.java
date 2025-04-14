package controller;

import util.Teclado;

public class Qt02 {
public static void main(String[] args) {
	int n = Teclado.lerInt("Digite um número:");
	
	if (n < 0) {
		System.out.println("Negativo");
	} else {
		if (n > 0) {
			System.out.println("Positivo");
		} else {
			if (n == 0) {
				System.out.println("Nulo");
			}
		}
	}
	
}
}
