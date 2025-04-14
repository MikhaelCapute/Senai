package controller;

import util.Teclado;

public class qt03 {
public static void main(String[] args) {
	double n1;
	
	n1 = Teclado.lerDouble("Digite um número: ");
	if (n1%2 == 0) {
		System.out.println("O número " + n1 + " é um número par.");
	} else {
		System.out.println("O número " + n1 + " é um número ímpar.");
	}
}
}
