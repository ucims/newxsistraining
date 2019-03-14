package com.github.ucims.logic3;

import java.util.Scanner;

public class Soal07 {
	
	int jumlah;

	public Soal07() {
		// TODO Auto-generated constructor stub
	}
	
	public void deretMinusDuaKali(int jumlah) {
		
		int a = 1;
		int b = -2;
		
		for (int i = 0; i < jumlah; i++) {
			System.out.print(a + " ");
			a += b;
			b -= 2;
		}
	
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jumlah angka >>");
		int n = scan.nextInt();
		
		Soal07 data = new Soal07();
		data.deretMinusDuaKali(n);
		
	}
	

}
