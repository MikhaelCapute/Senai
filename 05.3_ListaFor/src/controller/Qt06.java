package controller;

import util.Teclado;

public class Qt06 {
public static void main(String[] args) {
	
	int n = Teclado.lerInt("Digite um número: ");
	
	for (int i = 1; i <= n; i ++) {
		if ((i % 3 == 0) && (i % 5 == 0)) {
			System.out.println(i + " É um número divisível por "
					+ "3 e 5.");
		}
	}
	
}
}
