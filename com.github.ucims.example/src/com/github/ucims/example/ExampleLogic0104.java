package com.github.ucims.example;

public class ExampleLogic0104 {

	public ExampleLogic0104() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int n = 9;
		int tengah = (n-1)/2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i == j-j || i == n-1 || i == tengah || j == tengah || i == n-1-j) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
	}

}
