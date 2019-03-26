package com.github.variasiSoal;
import java.util.*;

public class KorbanKungfuCoba {

	public KorbanKungfuCoba() {
		// TODO Auto-generated constructor stub
	}
	
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.print("Masukkan nilai n : ");
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sizeArrayTotal = n * n;
		String[][] array = new String[sizeArrayTotal+1][sizeArrayTotal+1];
		int a = 2;
		int b = 1;
		int c = 0;// buat baris
		int d = 0;// nuat kolom
		int e = n;
		// note: utk bangun luar
		for (int bLuar = 0; bLuar < 1; bLuar++) { // jumlah duplikasi kotak pada bagian baris
			for (int kLuar = 0; kLuar < n; kLuar++) { // jumlah duplikasi kotak pada bagian kolom
				// note: utk bangun dalam
				for (int bDalam = c; bDalam >= 0; bDalam--) { // jumlah baris dalam yang diinginkan 
					for (int kDalam = d; kDalam >= 0; kDalam--) { // jumlah kolom dalam yang diinginkan 
						if (bDalam == 0 || kDalam == 0 || bDalam == c || kDalam == c) { //Kondisi bentuk kotak yang diinginkan
							array[n * bLuar + bDalam + (n - b)][n * kLuar + kDalam] = ("* ");// koordinat penggambaran 
						}
					}
				}
				c++;
				d++;
				b++;
			}
		}
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == null) {
					System.out.print("  ");
				} else {
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
	}

}
