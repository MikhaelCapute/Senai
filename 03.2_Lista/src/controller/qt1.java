package controller;

import util.Teclado;

public class qt1 {
public static void main(String[] args) {
	double valor, garcon;
	
	valor = Teclado.lerDouble("Digite o valor da conta:R$ ");
	garcon = valor + (valor * 10 / 100);
	
	System.out.println("Valor da conta com acréscimo do garçon:R$ " + garcon);
	
}
}
