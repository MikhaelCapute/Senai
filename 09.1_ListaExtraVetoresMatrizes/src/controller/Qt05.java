package controller;

import util.Teclado;

public class Qt05 {
	public static void main(String[] args) {
		// Desenvolver um programa que pergunte ao usuário dois vetores a e b com 15 elementos cada, construa um
		// vetor c com 30 elementos, sendo este a junção dos outros dois vetores. (primeiro os 15 elementos de a, em
		// seguida os 15 elementos de b). Apresentar ao final o vetor c.
		
		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [10];
		
		for (int i = 0 ; i < 5 ; i ++) {
			a[i] = Teclado.lerInt("VA - Digite um número:");
		}
		for (int i = 0 ; i < 5 ; i ++) {
			b[i] = Teclado.lerInt("VB - Digite um número:");
		}
		for (int i = 0 ; i < 5 ; i ++) {
			c[i] = a[i];
		}
		for (int i = 5 ; i < 10; i ++) {
			c[i] = b[i-5];
		}
			
		for (int i = 0 ; i < 10 ; i ++) {
			System.out.println(c[i]);
		}
	}
}
