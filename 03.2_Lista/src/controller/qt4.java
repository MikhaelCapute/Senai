package controller;

import util.Teclado;

public class qt4 {
public static void main(String[] args) {
	double peso, altura, imc;
	
	peso = Teclado.lerDouble("Digite o seu peso em KG: ");
	altura = Teclado.lerDouble("Digite a sua altura em metro: ");
	imc = peso / Math.pow(altura, 2);
	
	System.out.println("Seu IMC: " + imc);
	
}
}
