package controller;

import util.Teclado;

public class qt9 {
public static void main(String[] args) {
	int anos, meses, dias, minvi;
	
	System.out.println("Digite a sua idade em:");
	anos = Teclado.lerInt("Anos: ");
	meses = Teclado.lerInt("Meses: ");
	dias = Teclado.lerInt("Dias: ");
	minvi = anos * 365 + meses * 30 + dias;
	
	System.out.println("Voce está vivo a aproximadamente " + minvi + " dias");
	
}
}
