package com.github.ucims.xsistrainingPreparationOne;

import java.util.Scanner;

public class Soal04 {
	
	int angka = 0;
	int kolom = 0;
	int baris = 0;
	String[][] bangun = null;
	
	public Soal04() {
		// TODO Auto-generated constructor stub
	}

	public void setBangunan(int n) {
		this.baris = n;
		this.kolom = n;
		this.bangun = new String[n][n];
		
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				this.bangun[i][j] = "*"; 
			}
			this.angka++;
		}
	}
	
	public void cetakBangun() {
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if (this.bangun[i][j] == null) {
					System.out.print("\t");
				} else {
					System.out.print(this.bangun[i][j] + "\t");
//					System.out.println(this.baris);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Jumlah matrix >> ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println();
		
		Soal04 data = new Soal04();
		data.setBangunan(n);
//		data.cetakBangun();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				data.cetakBangun();
				System.out.println();
			}
		}
	}
}
