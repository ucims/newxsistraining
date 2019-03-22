package com.github.ucims.preparationexample;
import java.util.Scanner;

import com.github.ucims.tools.Tools;

public class Soal03 {
	
	static int n = 0; // inputan
	static int nilaiTengah = (n-1)/2; //faktorial segi empat
	static int nilaiPanjang = 0;
	static int nilaiLebar = 0;
	static int batasAtas = 0;
	static int batasBawah = 0;
	static int batasKanan = 0;
	static int batasKiri =0;
	static String[][] nilaiLarik = null;
	static int angka = 0;
	static int ctr = 0; //nilai counter
 
	public Soal03() {
		// TODO Auto-generated constructor stub
	}
	
	public static void setLarik(int loop, int ctr) {
		for (int i = batasAtas; i < batasBawah; i++) {
			for (int j = batasKiri; j < batasKanan; j++) {
				if (loop % 2 == 0) {
					nilaiLarik[i][j] = Integer.toString(ctr);
				} else {
					nilaiLarik[i][j] = "";
				}
			}
		}
	} 
	
	public static int setFibonaci(int m) {
		int a = 1; // nilai awal
		int b = 1; // nilai kedua
		int c = 1; // hasil
		for (int i = 0; i < m; i++) {
			if (i > 1) {
				c = a + b;
				a = b;
				b = c;
			}
		}
		return c;
	}
	
	public static int setBangunan(int jml) {
		int m = 1; 
		for (int i = 0; i < jml; i++) {
			if (i > 0) {
				m = m + 4 ;
			}
		}		
		return jml;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan angka ");
		int jml = scan.nextInt();
		
		n = setBangunan(jml);
		nilaiPanjang = n;
		nilaiLebar = n;
		nilaiLarik = new String[nilaiPanjang][nilaiLebar];
		batasBawah = n;
		batasKanan = n;
		
		for (int i = 0; i < n ;i++) {
			if (i % 2 == 0) {
				ctr++;
			}
			
			setLarik(i, ctr);
			batasAtas++;
			batasBawah--;
			batasKiri++;
			batasKanan--;
		}
		
		Tools.cetak2D(nilaiLarik);

	}

}
