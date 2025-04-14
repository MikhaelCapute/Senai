package controller;

import util.Teclado;

public class qt7 {
public static void main(String[] args) {
	double h, c1, c2;
	
	c1 = Teclado.lerInt("Digite o valor do cateto 1: ");
	c2 = Teclado.lerInt("Digite o valor do cateto 2: ");
	h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
	
	System.out.println("A hipotenusa é: " + h);
	
}
}
