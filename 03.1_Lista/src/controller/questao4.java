package controller;

import util.Teclado;

public class questao4 {
public static void main(String[] args) {
	int n1, ant, suc;
	
	n1 = Teclado.lerInt("Digite um número: ");
	
	ant = n1 - 1;
	suc = n1 + 1;
	
	System.out.println("Antecessor: " + ant);
	System.out.println("Sucessor: " + suc);
	
}
}
