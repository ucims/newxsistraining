package com.github.ucims.test;

import java.util.Scanner;

public class Soal05 {

	public Soal05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jumlah m ?"); //jumlah kotak
		int n = scan.nextInt();
		System.out.print("Masukan nilai n ?"); // nilai awal
		int angka = scan.nextInt();
		
		
		int total = n*n;
		String[][] larik = new String[total][total];
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				if (i+j == n-1 || i == j) {
					int a = angka;
					for (int i2 = 0; i2 < n; i2++) {
						for (int j2 = 0; j2 < n; j2++) {
							
							larik[n*i+i2][n*j+j2] = a + " ";
							a+= 4;
						}
						
					}
				}
			}
		}
		
		for (int i = 0; i < larik[0].length; i++) {
			for (int j = 0; j < larik[0].length; j++) {
				if (larik[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(larik[i][j]);
				}
				if ((j+1)%n == 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
			if ((i+1) % n == 0) {
				System.out.println();
			}
		}
	}

}
