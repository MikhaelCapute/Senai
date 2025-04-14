package controller;

import util.Teclado;

public class questao6 {
public static void main(String[] args) {
	double f, c;
	
	f = Teclado.lerDouble("Digite a temperatura em fahrenheint: ");
	c = (f - 32) * 5 / 9;
	
	System.out.println("Convertendo fehrenheint para celsius: " + c);

}
}
