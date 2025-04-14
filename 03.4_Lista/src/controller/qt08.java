package controller;

import util.Teclado;

public class qt08 {
public static void main(String[] args) {
	int n1;
	
	n1 = Teclado.lerInt("Digite um número: ");
	if ((n1 > 0 ) && (n1 < 10)) {
		System.out.println("O número digitado está entre 1 a 10: " + n1);
	} else {
		System.out.println("O número digitado não está entre 1 a 10");
	}
}
}
