package com.github.ucims.test;

import java.util.Scanner;

public class Soal10 {

	public Soal10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai k : ");
        int n = scan.nextInt();
        
        for (int i = 0; i < n*2; i++) {
        	for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
        	System.out.println();			
		}

	}

}
