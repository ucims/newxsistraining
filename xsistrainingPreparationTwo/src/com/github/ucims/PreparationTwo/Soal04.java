package com.github.ucims.PreparationTwo;

import java.util.Scanner;

public class Soal04 {

	public Soal04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan angka n > >");
		int n = scan.nextInt();

		int total = n * n; 
		String[][] array = new String[total][total];
		
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) { 
				
				if (i == n-n || i == n-1 || j == n-n || j == n-1) {
					
					for (int j2 = 0; j2 < n; j2++) {  
						for (int k = 0; k < n; k++) { 
							
							if (j2 == n-1|| j2 == n-n || k == n-n || k == n-1) { 
								array[n*i+j2][n*j+k] = "*";								
							}
							
						}						
					}
				}		
				
			}
		}  
		
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(array[i][j]);
				}
				if((j+1) % n == 0) {
					System.out.print(" ");
				}				
			}
			
			System.out.println(); 
			if (i+1 % n == 0) {
				System.out.println();
			}
		}
	}

}
