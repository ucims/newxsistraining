package com.github.ucims.example;

public class ExampleLogic0101 {

	public ExampleLogic0101() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int n = 9;
		
		for (int i = 0; i < n; i++) { //for baris
			for (int j = 0; j < n; j++) { // for kolom
				if (i == j) {
					System.out.print("+");
				} else {
					System.out.print("-");
				}				
			}
			System.out.println();
		} 
		
	}

}
