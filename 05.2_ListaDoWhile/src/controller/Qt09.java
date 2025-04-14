package controller;

public class Qt09 {
public static void main(String[] args) {
	int i = 0, a = 1, b = 1 ,temp = 1;
	
	do {
		System.out.println(b + "\t");
		temp = a + b;
		a = b;
		b = temp;
	 i ++ ;
	} while (i <= 15);
	
}
}
