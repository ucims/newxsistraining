package com.github.ucims.preparationexample;

import java.util.Scanner;

public class Soal08 {

	public Soal08() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
        scan = new Scanner(System.in);
        int nBaris = scan.nextInt();
		System.out.print("Masukkan nilai n2 : ");
        int nKolom = scan.nextInt();
		for (int i = 0; i < nBaris; i++) {
			for (int j = 0; j < nKolom; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
