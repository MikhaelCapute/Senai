package controller;

import util.Teclado;

public class qt4 {
public static void main(String[] args) {
	double n1, n2, n3, n4, media;
	
	n1 = Teclado.lerDouble("Digite o primeiro número: ");
	n2 = Teclado.lerDouble("Digite o segundo número: ");
	n3 = Teclado.lerDouble("Digite o terceiro número: ");
	n4 = Teclado.lerDouble("Digite o quarto número: ");
	
	media = (n1 + n2 * 2 + n3 * 3 + n4 * 4) / 10;
	
	System.out.println("A média aritmética é: " + media);
	
}
}
