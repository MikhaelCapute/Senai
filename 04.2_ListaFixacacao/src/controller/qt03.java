package controller;

import util.Teclado;

public class qt03 {
public static void main(String[] args) {
	double n1, desc, acres;
	
	n1 = Teclado.lerDouble("Digite um valor: ");
	
	acres = n1 + (n1*18/100);
	desc = n1 - (n1*65/100);
	
	System.out.println("Valor com acréscimo de 10%: " + acres);
	System.out.println("Valor com desconto de 65%: " + desc);
	
}
}
