package controller;

import util.Teclado;

public class qt8 {
public static void main(String[] args) {
	double b, h, perimetro, area, diagonal;
	
	b = Teclado.lerDouble("Digite a base do retangulo: ");
	h = Teclado.lerDouble("Digite a altura do retangulo: ");
	
	perimetro = Math.pow(b, 2) + Math.pow(h, 2);
	area = b * h;
	diagonal = Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));
	
	System.out.println("Perímetro do retangulo: " + perimetro);
	System.out.println("Área do retangulo: " + area);
	System.out.println("Diagonal do retangulo: " + diagonal);
	
}
}
