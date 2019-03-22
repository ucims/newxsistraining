package com.github.ucims.preparationexample;

import java.util.Scanner;

public class Soal04 {

	public Soal04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan angka > >");
		int n = scan.nextInt();
		int bil = 0;
		
		int total = n * n; //jumlah total array
		String[][] array = new String[total][total];
		//perulangan bangunan luar
		for (int i = 0; i < n; i++) { // i sebagai baris luar bangunan
			for (int j = 0; j < n; j++) { // j sebagi kolom luar
				
				if (i == n-n || i == n-1 || j == n-n || j == n-1) {
					
					for (int j2 = 0; j2 < n; j2++) { //sebagai baris untuk bangunan kecil / didalam
						for (int k = 0; k < n; k++) { //sebagai kolom untuk bagian dalam
							
							if (j2 == n-1|| j2 == k || k == 0) { // bangun dalam
								array[n*i+j2][n*j+k] = Integer.toString(bil);								
							}
							
						}						
					}
					bil++;
				}		
				
			}
		} // end of for statement 
		
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(array[i][j]);
				}
				//pembatas bangunan bagian kanan
				if((j+1) % n == 0) {
					System.out.print(" ");
				}				
			}
			
			System.out.println(); //pembatas bagian bawah
			if (i+1 % n == 0) {
				System.out.println();
			}
		}
	}

}
