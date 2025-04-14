package controller;

import util.Teclado;

public class qt10 {
public static void main(String[] args) {
	double razao, v1, qui_ter;
	
	v1 = Teclado.lerDouble("Digite o 1° valor da P.G: ");
	razao = Teclado.lerDouble("Digite a razão da P.G: ");
	qui_ter = v1 * Math.pow(razao, 4);
	
	System.out.println("O 5° elemento da P.G: " + qui_ter);
	
}
}
