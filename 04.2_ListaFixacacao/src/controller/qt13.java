package controller;

import util.Teclado;

public class qt13 {
public static void main(String[] args) {
	int n1, n2, n3, maior = 0;
	
	n1 = Teclado.lerInt("Digite um número: ");
	n2 = Teclado.lerInt("Digite outro número: ");
	n3 = Teclado.lerInt("Digite outro número: ");
	
	if ((n1 > n2) && (n2 > n3)) {
		maior = n1;
	}
	if  ((n2 > n3) && (n3 > n1)) {
		maior = n2;
	}
	if ((n3 > n2) && (n2 > n1)) {
		maior = n3;
	}
	
	System.out.println("O maior número digitado é o: " + maior);
}
}
