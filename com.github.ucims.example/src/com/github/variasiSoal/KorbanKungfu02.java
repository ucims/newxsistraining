package com.github.variasiSoal;

import java.util.Scanner;

public class KorbanKungfu02 {
	
	int baris;
	int kolom;
//	int n;
	String[][] larik = null; 

	public KorbanKungfu02() {
		// TODO Auto-generated constructor stub
	}
	
	public void buatSegitiga(int n) {
		this.baris = n;
		this.kolom = n;
		int total = n*n;
		this.larik = new String[total][total];
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				
				if (i == n-n && i % 2 == 0) {
					
					for (int i2 = 0; i2 < n; i2++) {
						for (int j2 = 0; j2 < n; j2++) {
							if (i2 >= n-1-j2) {
								larik[n*i+i2][n*j+j2] = "*";
							} else {
								larik[n*i+i2][n*j+j2] = " ";					
							}
						}
					}
					
				} 		
				
			}
		}
	}
	
	public void cetak(int n) {
		for (int i = 0; i < larik[0].length; i++) {
			for (int j = 0; j < larik[0].length; j++) {
				if (larik[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(larik[i][j] + "\t");
				}
				if((j+1) % n == 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
//			System.out.println(); 
			//pembatas bagian bawah
			if (i+1 % n == 0) {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Masukkan nilai n : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        KorbanKungfu02 data = new KorbanKungfu02();
        data.buatSegitiga(n);
        data.cetak(n);
        
	}

}
