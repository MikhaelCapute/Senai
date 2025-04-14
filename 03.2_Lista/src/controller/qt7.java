package controller;

import util.Teclado;

public class qt7 {
public static void main(String[] args) {
	double valor, prestacoes, valpre;
	
	valor = Teclado.lerDouble("Digite o valor da compra:R$ ");
	prestacoes = Teclado.lerDouble("Digite em quantas parcelas: ");
	valpre = valor / prestacoes;
	
	System.out.println("Valor da compra:R$ " + valor);
	System.out.println("Parcelas escolhidas: " + prestacoes);
	System.out.println("Valor de cada parcela:R$ " + valpre);
	
}
}
