package controller;

import util.Teclado;

public class qt6 {
public static void main(String[] args) {
	
	int a, b, c;
	
	a = Teclado.lerInt("Digite um valor: ");
	b = Teclado.lerInt("Digite outro valor: ");
	
	
	c = a;
	a = b;
	b = c;
	
	System.out.println("O valor A trocado: " + a);
	System.out.println("O valor B trocado: " + b);
	
}
}
