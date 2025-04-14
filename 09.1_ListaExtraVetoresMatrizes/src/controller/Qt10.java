package controller;

public class Qt10 {
	public static void main(String[] args) {
		
		//Desenvolver um programa que gere um vetor vazio com 8 posições, preencha-o através de uma rotina de
		//repetição (laço) com os valores abaixo e exiba-o:
		//60 59 58 57 56 55 54 53
		
		
		int a[] = new int [8];
		
		for (int i = 0 ; i < 8 ; i ++) {
			a[i] = 60 - i;
			System.out.println(a[i]);
		}
	}
}
