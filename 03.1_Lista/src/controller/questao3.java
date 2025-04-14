package controller;

import util.Teclado;

public class questao3 {
public static void main(String[] args) {
	double usd, brl;
	
	usd = Teclado.lerDouble("Digite o valor em dólares: $");
	brl = usd * 4.99;
	
	System.out.println("Sua carteira em real:R$ " + brl);
	
}
}
