package controller;

import util.Teclado;

public class qt12 {
public static void main(String[] args) {
	int n1, n2;
	
	n1 = Teclado.lerInt("Digite um número: ");
	n2 = Teclado.lerInt("Digite outro número: ");
	
	if (n1 == n2) {
		System.out.println("Os números digitados são iguais.");
	}
	
	if (n1 > n2) {
		System.out.println("MAIOR: " + n1);
		System.out.println("MENOR: " + n2);
	} 
	if (n1 < n2) {
		System.out.println("MAIOR: " + n2);
		System.out.println("MENOR: " + n1);
	}
	
	
}
}
