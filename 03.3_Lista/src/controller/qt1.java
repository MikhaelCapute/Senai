package controller;

import util.Teclado;

public class qt1 {
public static void main(String[] args) {
	double raio, a;
	
	raio = Teclado.lerDouble("Digite o valor do raio: ");
	a = Math.PI * Math.pow(raio, 2);
	
	System.out.println("A área do circulo é: " + a);
}
}
