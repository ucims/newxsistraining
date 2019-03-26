package com.github.variasiSoal;

import java.util.Scanner;

public class Soal01 {

	public Soal01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int angka = 0;
		int deret = 0;
		
		System.out.print("Masukkan nilai n : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			deret += 2;
			angka += deret;
			System.out.print(deret + " ");
		}
		
		System.out.println(" = "+ angka);

	}

}
