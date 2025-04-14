package controller;

import util.Teclado;

public class qt5 {
public static void main(String[] args) {
	double r, h, v;
	
	r = Teclado.lerDouble("Digite o raio da garrafa de óleo: ");
	h = Teclado.lerDouble("Digite a altura da garrafa de óleo: ");
	v = Math.PI * Math.pow(r, 2) * h;
	
	System.out.println("O volume da garrafa de óleo é: " + v);
	
	
}
}
