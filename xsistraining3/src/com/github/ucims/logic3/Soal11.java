package com.github.ucims.logic3;

import java.util.Scanner;

public class Soal11 {
	
	int jumlah, jumlah_array;

	public Soal11() {
		// TODO Auto-generated constructor stub
	}
	
	public void getJumlahArray(int jumlah) {
		int a = 1
				;
		
		for (int i = 1; i < jumlah; i++) {
			System.out.print(a + " ");			
			a += 2;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan jumlah angka >>");
		int n = scan.nextInt();
		
		Soal11 data = new Soal11();
		data.getJumlahArray(n);
		
	}

}
