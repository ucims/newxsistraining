package com.github.ucims.PreparationTwo;

import java.util.Scanner;

public class Soal09 {
	
	public Soal09() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Masukkan nilai n : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Masukan nilai m : ");
        int m = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
				System.out.print(m + " ");
				m += 2;
			}
        	System.out.println();
        	
		}
        
	}

}
