package controller;

public class Qt09 {
	public static void main(String[] args) {
		
		//Desenvolver um programa que gere um vetor vazio com 8 posições, preencha-o através de uma rotina de
		//repetição (laço) com os valores abaixo e exiba-o:
		//20 25 30 35 40 45 50 55
		
		int a[] = new int [8];
		
		for (int i = 0 ; i < 8 ; i ++) {
			a[i] = 20 + (i*5);
			System.out.println(a[i]);
		}
	}
}
