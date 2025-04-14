package controller;

public class Qt04 {
public static void main(String[] args) {
	int soma = 0;
	
	for (int i = 3; i <= 21; i ++) {
		if (i % 2 == 1) {
			soma += i;
		}
	}
	System.out.println("Somatório: " + soma);
}
}
