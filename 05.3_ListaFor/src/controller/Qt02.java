package controller;

import util.Teclado;

public class Qt02 {
public static void main(String[] args) {
	
	int n = Teclado.lerInt("Digite um valor:");
	int soma = 0;
	
	for (int i = 1; i <= n; i ++) {
		soma += i;
		
	}
	System.out.println("Somatório: " + soma);
}
}
