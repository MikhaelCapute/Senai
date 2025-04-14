package controller;

import util.Teclado;

public class qt10 {
public static void main(String[] args) {
	double n1, n2;
	
	n1 = Teclado.lerDouble("Digite um número: ");
	n2 = Teclado.lerDouble("Digite outro número: ");
	if (n2%n1 == 0) {
		System.out.println("O segundo número digitado É um divisor do primeiro número.");
	} else {
		System.out.println("O segundo número digitado NÃO É um divisor do primeiro número.");
	}
}
}
