package controller;

import util.Teclado;

public class Qt01 {
	public static void main(String[] args) {
		
		int a[] = new int [20];
		int soma = 0;
		int media = 0;
		
		for (int i = 0 ; i < 20 ; i ++) {
			a[i] = Teclado.lerInt("Digite um número:");
			soma += a[i];
		}
		
		media = soma / 20;
		
		for (int i = 0 ; i < 19 ; i ++) {
			for(int j = i + 1; j < 20 ; j ++) {
				if (a[i] > a[j]) {
					int aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
	}
}
