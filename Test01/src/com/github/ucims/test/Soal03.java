package com.github.ucims.test;

import java.util.Scanner;

public class Soal03 {
	

	public Soal03() {
		// TODO Auto-generated constructor stub
	}
	
	public void deret(int jumlah) {
		int a = 1; 
		int b = 3;
		for (int i = 1; i <= jumlah; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(b + " ");
				b += 3;
			} else {
				System.out.print(a + " ");
				a += 2;
			}			
		}		
	}
	
	public void deretDua(int jumlah) {
		int a = jumlah; 
		int b = jumlah+2;
		for (int i = jumlah; i >=1; i--) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(b + " ");
				b -= 3;
			} else {
				System.out.print(a + " ");
				a -= 2;
			}			
		}		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jumlah angka ?");
		int n = scan.nextInt();
		
		Soal03 data = new Soal03();
		data.deret(n);
		System.out.println();
		data.deretDua(n);
	}

}
