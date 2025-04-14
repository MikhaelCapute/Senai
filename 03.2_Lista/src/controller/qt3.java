package controller;

import util.Teclado;

public class qt3 {
public static void main(String[] args) {
	double peso, altura;
	
	peso = Teclado.lerDouble("Digite o seu peso em KG: ");
	altura = Teclado.lerDouble("Digite a sua altura em metros: ");
	peso = peso * 1000;
	altura = altura * 10000;
	
	System.out.println("Seu peso em gramas: " + peso);
	System.out.println("Sua altura em cm: " + altura);
	
}
}
