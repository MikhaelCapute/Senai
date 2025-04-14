package controller;

import util.Teclado;

public class Qt14 {
public static void main(String[] args) {
	double r = 0, t = 0;
	int q = 0, cont = -1;
	boolean i = true;
	
	System.out.println("Código Especificação Preço\n"
			+ "1 | Cachorro quente R$9,90\n"
			+ "2 | Bauru simples R$11,50\n"
			+ "3 | Bauru com ovo R$13,50\n"
			+ "4 | Hambúrger R$12,50\n"
			+ "5 | Cheeseburguer R$14,90\n"
			+ "6 | Refrigerante R$6,50");
	System.out.println(" ");
	
	while (i == true) {
		
		int c = Teclado.lerInt("Digite o código do produto desejada:");
		
		if (c == 0) {
			i = false;
			break;
		}
		
		q = Teclado.lerInt("Digite quantos produtos do código "+ c +" você deseja:");
		
		cont += q;
		
		if (c == 1) {
			r = 9.90 * q;
			System.out.println("CACHORRO QUENTE - Sub-Total:R$"+r);
			
		} else {
			if (c == 2) {
				r = 11.50 * q;
				System.out.println("BAURU SIMPLES - Sub-Total:R$"+r);
				
			} else {
				if (c == 3) {
					r = 13.50 * q;
					System.out.println("BAURU COM OVO - Sub-Total:R$"+r);
					
				} else {
					if (c == 4) {
						r = 12.50 * q;
						System.out.println("HAMBÚRGER - Sub-TotalR$"+r);
						
					} else {
						if (c == 5) {
							r = 14.90 * q;
							System.out.println("CHESSEBURGUER - Sub-TotalR$"+r);
							
						} else {
							if (c == 6) {
								r = 6.50 * q;
								System.out.println("REFRIGERANTE - Sub-TotalR$"+r);
								
							}
						}
					}
				}
			}
		}
		t += r;
		String opc = Teclado.lerTexto("Deseja mais alguma coisa? [s/n]");
		if (opc.equals("n")) {
			i = false;

		} else {
			if (opc.equals("s")) {
				i = true;
				//t += r;
				cont ++ ;
			}
		}
	}
	System.out.println(cont + " itens:");
	System.out.println("Total a pagar R$" + t);		
}
}
