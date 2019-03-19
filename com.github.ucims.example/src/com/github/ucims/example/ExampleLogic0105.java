package com.github.ucims.example;

public class ExampleLogic0105 {

	public ExampleLogic0105() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j-1 || i == n-n || i == n-1 || i == n-1-j || j == n-n || j == n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
