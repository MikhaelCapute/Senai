package controller;

import util.Teclado;

public class Ex15 {
	public static void main(String[] args) {
		int a[] = new int [5];
		int b[] = new int [5];
		int aux;
		
		for (int i = 0 ; i < 5 ; i ++) {
			a[i] = Teclado.lerInt("Digite um número:");
			b[i] = a[i];
			
		}
		
		for (int i = 0 ; i < 5 ; i ++) {
			for (int j = i + 1 ; j < 5 ; j ++) {
				if (b[i] < b[j]) {
					aux = b[i];
					b[i] = b[j];
					b[j] = aux;
				}
			}
		}
		
		System.out.println("VETOR A\t VETOR B");
		for (int i = 0 ; i < 5 ; i ++) {
			System.out.println(a[i] + "\t" + b[i]);
		}
	}
}
