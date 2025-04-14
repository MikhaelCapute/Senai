package controller;

public class Qt15 {
	public static void main(String[] args) {
		int a[][]= new int [3][4];
		int num = 30;
		
		for (int i = 0 ; i < 3 ; i ++) {
			for (int j = 0 ; j < 4 ; j ++) {
				a[i][j] = num ++;
				System.out.print(a[i][j] + "\t");
			}
			num += 10;
			num -= 4;
			System.out.println("");
		}
	}
}
