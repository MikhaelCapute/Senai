package controller;

import util.Teclado;

public class qt04 {
public static void main(String[] args) {
	int n1;
	
	n1 = Teclado.lerInt("Digite um número: ");
	if ((n1%4 == 0) && (n1%5 == 0)) {
		System.out.println("O número " + n1 + " É divisível por 4 e 5.");
	} else {
		System.out.println("O número " + n1 + " NÃO É divisível por 4 e 5: ");
	}
}
}
