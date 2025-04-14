package controller;

import util.Teclado;

public class exemplo {
public static void main(String[] args) {
	int ultimo;
	int mat = Teclado.lerInt("Digite a matrícula:");
	ultimo = mat%10;
	
	switch(ultimo) {
	case 0:
		System.out.println("Pagamento em Janeiro");
		break;
		
	case 1:
		System.out.println("Pagamento em Fevereiro");
		break;
		
	case 2:
		System.out.println("Pagemento e Março");
		break;
		
	case 3:
		System.out.println("Pagamento em abril");
		break;
		
	default:
		System.out.println("Pagamento em Maio");
	}	
}
}
