package controller;

import util.Teclado;

public class questao9 {
public static void main(String[] args) {
	double n1, quad, raiz;
	
	n1 = Teclado.lerDouble("Digite um número: ");
	quad = Math.pow(n1, 2);
	raiz = Math.sqrt(n1);
	
	System.out.println("O número digitado: " + n1);
	System.out.println("Quadrado do número: " + quad);
	System.out.println("Raiz quadrada: " + raiz);
	
}
}
