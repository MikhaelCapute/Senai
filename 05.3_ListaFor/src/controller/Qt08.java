package controller;

public class Qt08 {
public static void main(String[] args) {
	
	for (int n = 1; n <= 10; n ++) {	
		for (int i = 1; i <= 10; i ++ ) {
			if (n <= i) {
				System.out.print("x-x\t");		
				} else {
					System.out.print(i + " - " + n + "\t");
				}
			
			}
			System.out.println("");
		}
	
	}
}
