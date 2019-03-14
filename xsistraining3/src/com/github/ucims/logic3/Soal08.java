package com.github.ucims.logic3;

import java.util.Scanner;

public class Soal08 {
	
	int jumlah;

	public Soal08() {
		// TODO Auto-generated constructor stub
	}
	
	public void deretMinusPlus(int jumlah) {
		int a = jumlah;
		
		for (int i = jumlah; i >= 0; i--) {
			if (i % 2 == 0) {
				a -= 4;
			} else {
				a += 2;
			}
			System.out.print(a + " ");	
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan jumlah angka >>");
		int n = scan.nextInt();
		
		Soal08 data = new Soal08();
		data.deretMinusPlus(n);
		
	}

}
