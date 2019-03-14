package com.github.ucims.logic3;

import java.util.Scanner;

public class Soal09 {
	
	int jumlah;
	int jumlah_array;

	public Soal09() {
		// TODO Auto-generated constructor stub
	}
	
	public void deretJumlah(int jumlah) {
		int a = 0;
		for (int i = 0; i < jumlah; i++) {			
			for (int j2 = 0; j2 < i; j2++) {			
				
				System.out.print(a + " ");	
								
			}				
			a++;			
		}
	}
	
	//jumlah belum ditentukan
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan jumlah angka >>");
		int n = scan.nextInt();
		
		Soal09 data = new Soal09();
		data.deretJumlah(n);
		
	}

}
