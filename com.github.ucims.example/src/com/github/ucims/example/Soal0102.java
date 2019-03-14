package com.github.ucims.example;

public class Soal0102 {
	
	int jumlah, kolom, baris;
	String [][] matrik = null;

	public Soal0102() {
		// TODO Auto-generated constructor stub
	}
	
	public void buatMatrik(int jumlah) {
		this.baris = jumlah;
		this.kolom = jumlah;
		this.matrik =  new String[this.baris][this.kolom];
		
		int index = jumlah * 2 -2;
		
		for (int i = 0; i < this.baris; i++) {
			int lokal = 1;
			for (int j = 0; j < this.kolom; j++) {
				if (+i +j == this.baris -1) { // 
					this.matrik[i][j] = index + " ";
				}
				lokal  += 2;
			}	
			index -=2;
		}
		

	}
	
	public void cetakMatrik() {
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.baris; j++) {
				System.out.print(matrik[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal0102 data = new Soal0102();
		data.buatMatrik(9);
		data.cetakMatrik();
	}

}
