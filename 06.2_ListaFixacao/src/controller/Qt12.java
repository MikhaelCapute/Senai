package controller;

import util.Teclado;

public class Qt12 {
public static void main(String[] args) {
	int n = Teclado.lerInt("Digite um número:");
	int r = 0;
	if (n % 10 == 0) {
		 r = 1;
	}
	
	switch (r) {
	case 1:
		System.out.println(n + " É divisível por 10");
		break;
	default:
		System.out.println(n + " NÃO É divisível por 10");
	}
}
}
