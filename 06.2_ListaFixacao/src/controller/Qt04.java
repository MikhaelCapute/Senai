package controller;

public class Qt04 {
public static void main(String[] args) {
	int s = 0;
	
	for (int i = 0; i <= 50; i ++) {
		if (i % 2 == 0) {
			s += i;
		}
	}
	System.out.println("Somatório:" + s);
}
}
