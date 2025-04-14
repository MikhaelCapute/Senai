package controller;

import util.Teclado;

public class Qt02Fix {
	public static void main(String[] args) {
		String materias[] = {"Matemática", "Português", "Ciências", "Inglês   ", 
				"Geografia", "História", "Educação Física", "Artes   "};
		int a[][] = new int[8][5];
		int soma = 0;
		int trimestre = 0;
		double mediaFinal = 0;
		
		// Passando o valor para a matriz. De coluna em coluna e depois desce a linha com as matérias...
		for (int i = 0 ; i < 8 ; i ++) {
			System.out.println("Disciplina: " + materias[i]);
			for (int j = 0 ; j < 4 ; j ++) {
				a[i][j] = Teclado.lerInt((j+1) + "º Trimestre: ");
				
				// Soma para a divisão.
				soma += a[i][j];
				
			}
			// Calculo da divisão sendo armazenada na última coluna.
			a[i][4] = soma / 4;
			soma = 0;
		}
		
		// Calculo da média final e o melhor trimestre. Primeiro as linhas depois as colunas.
		for (int j = 0 ; j < 4 ; j ++) {
			for (int i = 0 ; i < 8 ; i ++) {
				// Soma para a divisão.
				soma += a[i][j];
			}
			soma = soma / 8;
			// Como da para perceber o primeiro laço ainda não saiu da primeira coluna pois o código ainda não acabou
			// Logo se a divisão da média dessa coluna for a maior será armazenado na variável "MediaFinal" e a variável
			// Trimestre será mostrada no final
			if (soma > mediaFinal) {
				mediaFinal = soma;
				trimestre = j + 1;
			}
		}
		
		System.out.println("BOLETIM:");
		System.out.println("Disciplina:\t1º Tri\t2º Tri\t3ºTri\t4º Tri\tMédia:");
		for(int i = 0 ; i < 8 ; i ++) {
			System.out.print(materias[i] + "\t");
			for (int j = 0 ; j < 5 ; j ++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("O melhor trimestre foi o " + trimestre + "º com a média: " + mediaFinal);
	}
}
