package controller;

public class Qt12 {
	public static void main(String[] args) {
		int a[][] = new int [3][4];
		int num = 51;
		
		for(int i = 0 ; i < 3 ; i ++) {
			for (int j = 0 ; j < 4 ; j ++) {
				a[i][j] = num ++;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
