package controller;

import util.Teclado;

public class qt5 {
public static void main(String[] args) {
	double n1, n2, soma, sub1, sub2, mult, div, divI;
	
	n1 = Teclado.lerDouble("Digite um número: ");
	n2 = Teclado.lerDouble("Digite outro número: ");
	soma = n1 + n2;
	sub1 = n1 - n2;
	sub2 = n2 - n1;
	mult = n1 * n2;
	div = n1 / n2;
	divI = n1 % n2;
	
	System.out.println("Soma: " + soma);
	System.out.println("Subtração: " + sub1);
	System.out.println("Subtração Invertida: " + sub2);
	System.out.println("Multiplicação: " + mult);
	System.out.println("Divisão: " + div);
	System.out.println("Divisão Inteira: " + divI);
	
}
}
