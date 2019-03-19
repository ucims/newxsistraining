package com.github.ucims.example;

public class ExampleLogic0102 {

	public ExampleLogic0102() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =9;
		for (int i = 0; i < n; i++) {
			for (int j = n; j >= 0; j--) {
				if (i == j) {
					System.out.print("-");
				} else {
					System.out.print("+");
				}				
			}
			System.out.println();
		}

	}

}
