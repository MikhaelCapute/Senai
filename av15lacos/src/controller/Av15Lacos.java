package controller;

import util.Teclado;

public class Av15Lacos {
public static void main(String[] args) {
	
	int sexo, contm = 0, contf = 0;
	double renda = 0, pretencao = 0;
	double masculino_media_prent = 0, masculino_media_renda = 0, feminino_media_prent = 0, feminino_media_renda = 0, masculino_soma_renda = 0,
			masculino_soma_prent = 0, feminino_soma_renda = 0, feminino_soma_prent = 0;
	
	for (int i = 1; i <= 4; i ++) {
		sexo = Teclado.lerInt("1 - Masculino\n"
				+ "2 - Feminino\n"
				+ "Digite o número do seu sexo:");
		
		switch(sexo) {
		case 1:
			contm ++ ;
			System.out.println("Masculino");
			renda = Teclado.lerDouble("Digite a renda:R$");
			pretencao = Teclado.lerDouble("Digite a pretenção de gasto com presentes no natal:R$");
			masculino_soma_renda += renda;
			masculino_soma_prent += pretencao;
			masculino_media_prent = masculino_soma_prent / contm;
			masculino_media_renda = masculino_soma_renda / contm;
			break;
			
		case 2:
			contf ++ ;
			System.out.println("Feminino");
			renda = Teclado.lerDouble("Digite a renda:R$");
			pretencao = Teclado.lerDouble("Digite a pretenção de gasto com presentes no natal:R$");
			feminino_soma_renda += renda;
			feminino_soma_prent += pretencao;
			feminino_media_prent = feminino_soma_prent / contf;
			feminino_media_renda = feminino_soma_renda / contf;
			break;
			
		default:
			System.out.println("Número digitado Inválido.");
			i -- ;
		}
		
	}
	System.out.println("MASCULINO:\n"
			+ "Média de renda Masculina:R$" + masculino_media_renda + "\n"
			+ "Média pretenção de gastos:R$" + masculino_media_prent);
	
	System.out.println("");
	
	System.out.println("FEMININO:\n"
			+ "Média renda feminina:R$" + feminino_media_renda + "\n" 
			+ "Média pretenção de gasto: R$" + feminino_media_prent);
}
}
