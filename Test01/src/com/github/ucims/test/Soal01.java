package com.github.ucims.test;

import java.util.Scanner;

public class Soal01 {
	int angka = 0;
	String[][] larik = null;
	int baris = 0;
	int kolom = 0;

	public Soal01() {
		// TODO Auto-generated constructor stub
	}
	

	public void setSegitiga(int n, int m) {
		this.baris = n;
		this.kolom = n;
		this.larik = new String[this.baris][this.kolom];
		
		
		int index = m;
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(+i +j == this.baris - 1 || i == n-1 || j == n-1) {
					if (i % 2 == 0 && j % 2 == 0 ) {
						this.larik[i][j] = "*";
					}else {
						this.larik[j][i] = index + "";

					}
					index += 2;
				}
			}
			
		}
		
	}
	
	//show matrix
		public void showSegitiga() {
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
		System.out.print("Masukan jumlah angka n ?");
		int n = scan.nextInt();
		
		System.out.print("Masukan jumlah angka m ?");
		int m = scan.nextInt();
		
		Soal01 data = new Soal01();
		data.setSegitiga(n,m);
		
		data.showSegitiga();
	}

}
