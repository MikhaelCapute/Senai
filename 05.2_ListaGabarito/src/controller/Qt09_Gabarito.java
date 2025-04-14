package controller;

public class Qt09_Gabarito {
public static void main(String[] args) {
	
	int i = 1, a = 1, b = 1;
	int temp;
	
	do {
		System.out.print(a + "\t");
		temp = a + b;
		a = b;
		b = temp;
		i++;
	} while (i <= 15);
}
}
