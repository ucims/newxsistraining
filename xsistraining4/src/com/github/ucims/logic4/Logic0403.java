package com.github.ucims.logic4;

import java.util.Scanner;

public class Logic0403 {

	int jumlah;
	int baris;
	int kolom;
	int jumlah_barkom ; //= jumlah + (jumlah + jumlah-1) + jumlah
	int titikTengah ;
	String[][] matrik = null;
	
	public Logic0403() {
		// TODO Auto-generated constructor stub
	}
	
	public void bangunMatrik(int jumlah) {
		jumlah_barkom = jumlah + (jumlah + jumlah-1) + jumlah;
		titikTengah = (jumlah_barkom / 2)+1;
		this.kolom = jumlah;
		this.baris = jumlah;
		this.matrik = new String[this.kolom][this.baris]; 
		
		
		for (int i = 0; i < this.baris; i++) { // i sebagai baris luar
			for (int j = 0; j < this.kolom; j++) { // j sebagai kolom luar
				this.matrik[i][j] = "*";
			}
		}
	}
	
	public void cetakMatrik() {
		System.out.println(titikTengah);
		for (int i = 0; i < jumlah_barkom; i++) {
			for (int j = 0; j < jumlah_barkom; j++) {
				if (i == titikTengah && j == titikTengah) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jumlah matrik >> ");
		int n = scan.nextInt();
		
		Logic0403 data = new Logic0403();
		data.bangunMatrik(n);
		data.cetakMatrik();
		
	}

}
