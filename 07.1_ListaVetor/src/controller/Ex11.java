package controller;

import util.Teclado;

public class Ex11 {
	public static void main(String[] args) {
		int a[] = new int[5];
		double media = 0;
		int maior, menor, soma;
		
		a[0] = Teclado.lerInt("Digite um número:");
		maior = a[0];
		menor = a[0];
		soma = a[0];
		
		for (int i = 1 ; i < 5 ; i ++) {
			a[i] = Teclado.lerInt("Digite um número:");
			soma += a[i];
			if (a[i] > maior) {
				maior  = a[i];
			}
			if (a[i] < menor) {
				menor = a[i];
			}
			
		}
		media = soma / 5;
		
		System.out.println("MAIOR: " + maior);
		System.out.println("MENOR: " + menor);
		System.out.println("MÉDIA: " + media);
		
				
	}
}
