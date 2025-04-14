package controller;

import util.Teclado;

public class qt8 {
public static void main(String[] args) {
	double custo, percentual, prod_final;
	
	custo = Teclado.lerDouble("Digite o valor de custo do produto:R$ ");
	percentual = Teclado.lerDouble("Digite o percentual de lucro: ");
	prod_final = custo + (custo*percentual/100);
	
	System.out.println("Preço final do produto:R$ " + prod_final);
	
}
}
