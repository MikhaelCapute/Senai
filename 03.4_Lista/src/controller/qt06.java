package controller;

import util.Teclado;

public class qt06 {
public static void main(String[] args) {
	int n1, n2;
	
	n1 = Teclado.lerInt("Digite um número: ");
	n2 = Teclado.lerInt("Digite outro número: ");
	if (n1>n2) {
		System.out.println("Diferença entre o maior valor e o menor valor: " + (n1 - n2));
	} else {
		System.out.println("Diferença entre o maior valor e o menor valor: " + (n2 - n1));
	}
}
}
