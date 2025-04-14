package controller;

import util.Teclado;

public class Qt08 {
public static void main(String[] args) {
	int i = 0;
	int b = Teclado.lerInt("Digite a base:");
	int e = Teclado.lerInt("Digite o expoente: ");
	int r = 1;
	
	do {
		r *= b;
		i ++ ;
		
	} while (i < e);
	System.out.println("Resultado: " + r);
}
}
