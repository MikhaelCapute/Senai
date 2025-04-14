package controller;

import util.Teclado;

public class Ex04 {
	public static void main(String[] args) {
		int a[] = new int [5];
		int b[] = new int [5];
		
		for (int i = 0 ; i < 5 ; i ++) {
			a[i] = Teclado.lerInt("Digite um número:");
			b[i] = a[i] * 3;
		}
		
		System.out.println("EXIBINDO VETOR A" + "\t");
		for (int i = 0 ; i < 5 ; i ++) {
			System.out.println(a[i]);
		}
		
		System.out.println("");
		
		System.out.println("EXIBINDO VETOR B");
		for (int i = 0 ; i < 5 ; i ++) {
			System.out.println(b[i]);
		}
	}
}
