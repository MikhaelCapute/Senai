package controller;

import util.Teclado;

public class Ex05 {
	public static void main(String[] args) {
		double a[] = new double[5];
		double b[] = new double[5];
		
		for (int i = 0 ; i < 5 ; i ++) {
			a[i] = Teclado.lerInt("Digite um número:");
			b[i] = Math.pow(a[i], 2);
		}
		
		System.out.println("EXIBIDO VETOR A");
		for (int i = 0 ; i < 5 ; i ++) {
			System.out.println(a[i]);
		}
		
		System.out.println("");
		
		System.out.println("EXIBIDO VETOR B");
		for (int i = 0 ; i < 5 ; i ++) {
			System.out.println(b[i]);
		}
	}
}
