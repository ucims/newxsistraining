package com.github.ucims.xsistrainingPreparationOne;

import java.util.Scanner;

public class Soal09 {
	
	int jumlah = 0;
	char [] karakter = new char[26];

	public Soal09() {
		// TODO Auto-generated constructor stub
	}
	
	public void buatDeret(int jumlah) {
		int nilai = 1;
		int nilai2 = 1;
		
		for (char c = 'A'; c <= 'Z'; ++c) {
			karakter[c - 'A'] = c;
		}
		
		for (int i = 0; i <= jumlah; i++) {
			if (i % 3 == 0 && i != 0 && i != 2)  {
				System.out.print(karakter[nilai-1] + "\t");
				nilai++;
			} else if(i % 2 == 0) {
				System.out.print(nilai2 + "\t");
				nilai2 -= 4 ;
			} 			
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Masukan inputan >>");
		int n = scan.nextInt();
		
		Soal09 data = new Soal09();
		data.buatDeret(n);
		
	}
}
