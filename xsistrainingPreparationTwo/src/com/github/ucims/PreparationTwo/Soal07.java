package com.github.ucims.PreparationTwo;

import java.util.Scanner;

public class Soal07 {

	public Soal07() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukan angka > >");
		int n = scan.nextInt();	
		int bil = 0;
		
		int bilangan = n / n;
		int bilangan2 = n / 1;
		
		if (bilangan == 0  || bilangan2 == n) {
			System.out.println("Prima");
		} else {
			System.out.println("Bukan Prima");
		}
	
	}

}
