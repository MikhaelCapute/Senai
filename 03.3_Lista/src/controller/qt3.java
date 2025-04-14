package controller;

import util.Teclado;

public class qt3 {
public static void main(String[] args) {
	double n1, n2, acrescimo, desconto;
	
	n1 = Teclado.lerDouble("Digite um número: ");
	n2 = Teclado.lerDouble("Digite outro número: ");
	
	acrescimo = n1 + (n1*30/100);
	desconto = n2 - (n2*25/100);
	
	System.out.println("O primeiro número com acréscimo de 30% é igual a: " + acrescimo);
	System.out.println("O segundo número com desconto de 25% é igual a: " + desconto);
	
}
}
