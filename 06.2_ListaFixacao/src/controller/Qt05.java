package controller;

public class Qt05 {
public static void main(String[] args) {
	int s = 0;
	
	for (int i = 0; i <= 50; i ++ ) {
		if (i % 5 == 0) {
			s += i;
		}
	}
	System.out.println("Somatório:" + s);
}
}
