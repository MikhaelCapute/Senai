package controller;

import util.Teclado;

public class qt09 {
public static void main(String[] args) {
	int n1;
	
	n1 = Teclado.lerInt("Digite um número: ");
	if (n1 > 0) {
		System.out.println("O número digitado é POSITIVO.");
	}
	if (n1 < 0) {
		System.out.println("O número digitado é NEGATIVO.");
	}
	if (n1 == 0) {
		System.out.println("O número digitado é NULO.");
	}
}
}
