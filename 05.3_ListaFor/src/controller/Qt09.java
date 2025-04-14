package controller;

import util.Teclado;

public class Qt09 {
public static void main(String[] args) {
	
	final double POLEGADA = 2.54; // Declarado como constante
	
	int p = Teclado.lerInt("Digite as polegadas:");
	
	for (int i = 1; i <= p; i ++) {
		System.out.println(i + " Polegadas = " + (i*POLEGADA)+" CM");
	}
	
}
}
