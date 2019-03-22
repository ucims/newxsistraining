package com.github.ucims.xsistrainingPreparationOne;

import java.util.Scanner;

public class Soal01 {
	
	int jumlah;
	int baris = 0;
	int kolom = 0;
	int nilai3 = 1;
	int nilai4 = 1;
	String [][] deret = null; 
	
	public Soal01() {
		// TODO Auto-generated constructor stub
	}
	
	public void hitungDeret(int jumlah) {
//		int nilai = 0;
//		int nilai2 = 1;
		
		this.baris = jumlah;
		this.kolom = jumlah;
		this.deret = new String[this.baris][this.kolom];
		
		for (int i = 0; i < this.baris; i++) { 	//before jumlah
			for (int j = 0; j < this.kolom; j++) {
				if (i == 0) {
					this.deret[i][j] = Integer.toString(this.nilai3+1);
					nilai3+=2;
				} else if(i == 1) {
					this.deret[i][j] = Integer.toString(this.nilai4);
					nilai4+=2;
				} else if (i == 2) {
					this.deret[i][j] = Integer.toString(this.nilai3-3);
					nilai3-=2;
				} else if(i == 3) {
					this.deret[i][j] = Integer.toString(this.nilai4-2);
					nilai4-=2;
				} else {
					this.deret[i][j] = Integer.toString(38);
				}				
			}
			this.nilai3++;
		}
	}
	
	public void cetakDeret() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if (this.deret[i][j] == null) {
					System.out.print("\t");
				} else {
					System.out.print(this.deret[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Masukan inputan >>");
		int n = scan.nextInt();
		
		Soal01 data = new Soal01();
		data.hitungDeret(n);
		data.cetakDeret();
	}

}
