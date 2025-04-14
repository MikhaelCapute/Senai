package controller;

import util.Teclado;

public class questao2 {
public static void main(String[] args) {
	int n1, n2, n3, n4, soma, mult;
	
	n1 = Teclado.lerInt("Digite o 1° número: ");
	n2 = Teclado.lerInt("Digite o 2° número: ");
	n3 = Teclado.lerInt("Digite o 3° número: ");
	n4 = Teclado.lerInt("Digite o 4° número: ");
	
	soma = n1 + n2 + n3 + n4;
	mult = n1 * n2 * n3 * n4;
	
	System.out.println("Soma: " + soma);
	System.out.println("Multiplicação: " + mult);
	
}
}
