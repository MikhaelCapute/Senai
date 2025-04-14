package controller;

import util.Teclado;

public class Qt06 {
	public static void main(String[] args) {
		// Desenvolver um programa que pergunte ao usuário os valores de um vetor a com
		// 15 elementos inteiros.
		// Construir um vetor b de mesmo tipo e com os mesmos valores de a, sendo que o
		// vetor b deve ser ordenado de
		// forma decrescente.

		int a[] = new int[5];
		int b[] = new int[5];

		for (int i = 0; i < 5; i++) {
			a[i] = Teclado.lerInt("Digite um número:");
			b[i] = a[i];
			
		}
		for (int i = 0 ; i < 5 ; i ++) {
			for (int j = i + 1; j < 5; j++) {
				if (b[i] < b[j]) {
					int aux = b[i];
					b[i] = b[j];
					b[j] = aux;
				}
			}

		}
		
		System.out.println("A:" + "\t" + "B:");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i] + "\t" + b[i]);
			
		}
		
		System.out.println("");
		
	}
}
