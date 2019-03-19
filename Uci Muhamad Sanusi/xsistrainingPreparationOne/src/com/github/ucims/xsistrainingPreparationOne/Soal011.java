package com.github.ucims.xsistrainingPreparationOne;

import java.util.Scanner;

public class Soal011 {
	
	int jumlah;
	int nilai = 44;

	public Soal011() {
		// TODO Auto-generated constructor stub
	}
	
	public void cetakDeret(int jumlah) {
		for (int i = 0; i < jumlah; i++) {
			if (i == 0) {
				nilai = nilai;
			} else 
				if (i % 2 == 0) {
				nilai += 6;
			} else {
				nilai -= 3;
			}
			System.out.print(nilai + " ");			
		}
		nilai++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		System.out.print("Masukan inputan >>");
		int n = scan.nextInt();
		
		Soal011 data = new Soal011();
		data.cetakDeret(n);

	}

}
