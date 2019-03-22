package com.github.ucims.preparationexample;

import java.util.Scanner;

import com.github.ucims.tools.Tools;

public class Soal07 {
	
	static int n = 0;
	static int nilaiTengah = 0;
	static int nilaiPanjang = 0;
	static int nilaiLebar = 0;
	static int batasBawah = 0;
	static int batasAtas = 0;
	static int batasKiri = 0;
	static int batasKanan = 0;
	
	static String[][] larik = null;
	static int angka = 0;
	static int ctr = 0;
	static int angkaGanjil = 0;
	static int angkaGenap = 0;

	public Soal07() {
		// TODO Auto-generated constructor stub
	}
	
	public static void setArray() {
		int ganjil = 1;
		for (int i = batasAtas; i < batasBawah; i++) {
			for (int j = batasKiri; j < batasKanan; j++) {
				larik[i][j] = Integer.toString(angkaGanjil);
			}
			
		}
	}
	
	public static void setLarikGenap(int angka) {
		for (int i = batasAtas; i < batasBawah; i++) {
			if (i < nilaiTengah) {
				angkaGenap = angkaGenap + 2;
			} else {
				angkaGenap = angkaGenap - 2;
			}
			
			for (int j = batasKiri; j < batasKanan; j++) {
				larik[i][j] = Integer.toString(angkaGenap);
			}
		}
	}
	
	public static int setTambah4(int tkp) {
		int m = 1;
		for (int i = 0; i < tkp; i++) {
			if (i > 0) {
				m = m + 4;
			}
		}
		return m;
	}
	
	public static int setSegitiga(int m) {
		int angka = 1;
		for (int i = 0; i < m; i++) {
			if (i > 0) {
				angka += 2;
			}
		}
		return angka;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan angka 1 >>");
		int tkp = scan.nextInt();  // inputan satu
		
		System.out.print("Masukan angka 2 >>");
		int tkp2 = scan.nextInt(); // inputan dua
		
		n = tkp;
		nilaiPanjang = setTambah4(n);
		nilaiLebar = setSegitiga(n);
		nilaiTengah = (nilaiPanjang - 1) / 2;
		larik = new String[50][50];
		batasAtas = 0;
		batasBawah = 1;
		batasKiri = 1;
		batasKanan = 2;
		angkaGenap = 2;
		
		for (int i = 0; i < nilaiPanjang; i++) {
			setLarikGenap(angkaGenap);
			if (i < nilaiTengah -1) {
				batasKiri++;
				batasKanan++;
				batasBawah++;
			} else {
				batasKiri--;
				batasKanan++;
				batasBawah--;
			}
		}
		
		batasAtas = 1;
		batasBawah = nilaiLebar;
		batasKiri = 0;
		batasKanan = 1;
		angkaGanjil = 1;
		
		for (int i = 0; i <= nilaiPanjang; i++) { 
			setArray();
			if (i < nilaiTengah - 1) { // kondisi kurang dari nilai tengah
				batasKanan++;
				batasKiri++;
				batasBawah++;
			}
			if (i ==  nilaiTengah) { // kondisi sama dengan koordinat
				batasKiri = nilaiTengah + 1;
				batasKanan = nilaiTengah + 2; 
			}
			if (i > nilaiTengah + 1) { //kondisi lebih dari titik tengah
				batasKiri++;
				batasKanan++;
				batasAtas--;
			}
			
		}
		
		Tools.cetak2D(larik);

	}

}
