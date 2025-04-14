package controller;

import util.Teclado;

public class questao10 {
public static void main(String[] args) {
	double prest, valor, taxa, dias;
	
	valor = Teclado.lerDouble("Valor da compra: ");
	taxa = Teclado.lerDouble("Digite a taxa: ");
	dias = Teclado.lerDouble("Digite os dias em atraso: ");
	
	prest = valor + (valor*taxa/100) * dias;
	
	System.out.println("Calculo: " + prest);
	
}
}
