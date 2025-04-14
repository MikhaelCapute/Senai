package controller;

import util.Teclado;

public class Ex12 {
	public static void main(String[] args) {
		
		int a[] = new int [5];
		int b[] = new int [5];
		
		System.out.println("PREENCHENDO VETOR A");
		for (int i  = 0 ; i < 5 ; i ++) {
			a[i] = Teclado.lerInt("Digite um número:");
			
		}
		
		System.out.println("");
		
		System.out.println("PREENCHENDO VETOR B");
		for (int i = 0 ; i < 5 ; i ++) {
			b[i] = Teclado.lerInt("Digite um número:");
		}
		System.out.println("");
		
		System.out.println("EXIBINDO OS NÚMEROS REPETIDOS");
		for (int i = 0 ; i < 5 ; i ++) {
			for (int j = 0 ; j < 5 ; j ++) {
				if (a[i] == b[j]) {
				System.out.println(a[i]);
			}
		}
			
		}
		
	} 
}
