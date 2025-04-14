package controller;

public class Qt02 {
public static void main(String[] args) {
	int i = 0, soma = 0;
	
	do {
		if (i % 2 == 0) {
			soma += i;
		}
	i ++ ;
	} while (i <= 500); 
	System.out.println("O somatório final: " + soma);
}
}
