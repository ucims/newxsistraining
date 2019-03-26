package com.github.variasiSoal;

import java.util.Scanner;

public class SoalDeretHuruf {
	
	char[] karakter = new char[26];

	public SoalDeretHuruf() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKarakter(int jumlah) {
		int a = 0;
		for (char c = 'A'; c <= 'Z'; ++c) {
			karakter[c - 'A'] = c;
		}
		
		for (int i = 0; i < jumlah; i++) {
			for (int j = 0; j < jumlah; j++) {
				System.out.print(karakter[a] + " ");
			}
			a++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan jumlah angka >>");
		int n = scan.nextInt();
		
		SoalDeretHuruf data = new SoalDeretHuruf();
		data.setKarakter(n);

	}

}
