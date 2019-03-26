package com.github.ucims.test;

import java.util.Scanner;

public class Soal07 {
	
	int baris;
	int kolom;
	String[][] larik = null;

	public Soal07() {
		// TODO Auto-generated constructor stub
	}
	
	public void buatSegitiga(int k, int l, int m) {
		this.baris = m;
		this.kolom = m;
		int total = m*m;
		this.larik = new String[total][total];
		int angka = 0;
		
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if (i < j) {
					this.larik[m-j][i] = angka + " ";
					angka ++;
				}
				
			}
		}		
		
	}
	
	public void cetak() {
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if (this.larik[i][j] == null) {
					System.out.print("\t");
				}else {
					System.out.print(this.larik[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai k : ");
        int k = scan.nextInt();
        System.out.print("Masukkan nilai l : "); //jml
        int l = scan.nextInt();
        System.out.print("Masukkan nilai m : ");  //nxn
        int m = scan.nextInt();
        
        Soal07 data = new Soal07();
        data.buatSegitiga(k,l,m);
        data.cetak();

	}

}
