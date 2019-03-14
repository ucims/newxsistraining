
package com.github.ucims.example;

public class Soal0101 {
	
	int baris, kolom;
	String [][] matrik = null;

	public Soal0101() {
		// TODO Auto-generated constructor stub
	}
	
	public void buatMatrik(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrik = new String[this.baris][this.kolom];
		
		int index = 1;
				
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) { //kolom
				int lokal = 0;
				if (i -j == 0) {
					this.matrik[i][j] = index + "";
				}
				lokal += 2;
			}
			index += 2;
		}
	}
	
	public void cetakMatrik() {
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) { //kolom
				System.out.print(matrik[j][i] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Soal0101 data = new Soal0101();
		data.buatMatrik(9);
		data.cetakMatrik();
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println(" i = " + i + " j = " + j);
//			}
//			System.out.println();
//		}
	}

}
