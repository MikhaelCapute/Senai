package controller;

public class Qt02_Gabarito {
	public static void main(String[] args) {

		int i = 0, soma = 0;

		do {
			soma += i;
			i += 2;
		} while (i <= 500);
		System.out.println("Soma: " + soma);
	}
}
