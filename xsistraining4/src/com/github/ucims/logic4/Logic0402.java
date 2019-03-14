package com.github.ucims.logic4;

import java.util.Scanner;

import com.github.ucims.utils.Tools;

public class Logic0402 {

	int n, row, cols, angka = 0;
	static String[][] matrik = null;	

	public Logic0402() {
		// TODO Auto-generated constructor stub
	}
	
	public void buatMatrik(int n) {
		this.row = n;
		this.cols = n;
		this.matrik = new String[n][n];
		
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.cols; j++) {
				this.matrik[i][j] = Integer.toString(angka);
				angka++;
				
			}
		}
	}
		
	public static void main(String[] args) {
//		System.out.print("Masukan jumlah matrik >>");
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		Logic0402 data= new Logic0402();
//		data.buatMatrik(n);
//		
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				Tools.print(matrik);
//				System.out.print("\n");
//			}
//			System.out.print("\n");
//		}
		
		System.out.print("Masukkan nilai n : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int sizeArrayTotal = n*n;
		
		String[][] array = new String[sizeArrayTotal][sizeArrayTotal];
		

		//note: utk bangun luar
		for (int bLuar = 0; bLuar < n; bLuar++) {
			for (int kLuar = 0; kLuar < n; kLuar++) {
				if (bLuar+kLuar == n-1 || bLuar == n-1 || kLuar == n-1) {

					//note: utk bangun dalam
					for (int bDalam = 0; bDalam < n; bDalam++) {
						for (int kDalam = 0; kDalam < n; kDalam++) {
							if(bDalam+kDalam == n-1 || bDalam == n-1 || kDalam == n-1) {
								array[n*bLuar+bDalam][n*kLuar+kDalam] = "* ";
							}
						}
					}
					
				}
			}
		}

		
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == null) {
					System.out.print("  ");
				} else {
					System.out.print(array[i][j]);
				}
				//note: pembatas tiap bangun di bag. kanan
				if ((j+1)%n == 0) { System.out.print(" "); }
			}
			System.out.println();
			//note: pembatas tiap bangun di bag. bawah
			if ((i+1)%n == 0) { System.out.println(); }
		}
		
		
		
		
	
	}

}
