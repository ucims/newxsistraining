package com.github.ucims.logic3;

import java.util.Scanner;

public class Soal10 {
	
	char [] karakter = new char[26];

	public Soal10() {
		// TODO Auto-generated constructor stub
	}
	
	public void deretJumlah(int jumlah) {
		int a = 0;
		
		for (char c = 'A'; c <= 'Z'; ++c) {
			karakter [c - 'A'] = c;
		}
		
//		for (int i = 0; i < 26; i++) {
//			System.out.println(karakter[i] + " ");
//		} menampilkan seluruh char
		
		for (int i = 0; i < jumlah; i++) {
			
			for (int j2 = 0; j2 < i; j2++) {				
				System.out.print(karakter[a] + " ");
			}				
			a++;						
		}
	}
	
	// belum menampilkan jumlah diakhir
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan jumlah angka >>");
		int n = scan.nextInt();
		
		Soal10 data = new Soal10();
		data.deretJumlah(n);
	}

}
