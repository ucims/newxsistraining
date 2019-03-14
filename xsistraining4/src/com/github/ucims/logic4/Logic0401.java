package com.github.ucims.logic4;

import java.util.Scanner;

public class Logic0401 {
	
	int jumlah, baris, kolom;
	String[][] matrik = null; 

	public Logic0401() {
		// TODO Auto-generated constructor stub
	}
	
	public void deretBangun(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrik = new String[this.baris][this.kolom];
				
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				
				for (int j2 = 0; j2 < this.baris; j2++) {
					for (int k = 0; k < this.kolom; k++) {
						System.out.print("*");
					}
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Masukan jumlah matrik >> ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Logic0401 data = new Logic0401();
		data.deretBangun(n);
		
		
	}

}
