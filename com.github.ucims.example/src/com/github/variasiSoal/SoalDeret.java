package com.github.variasiSoal;

import java.util.Scanner;

public class SoalDeret {

	public SoalDeret() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Masukkan nilai n : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int a = 1;
        int b = 999;
        
        for (int i = 1; i < n; i++) {
			if (i % 3 == 0) {
				System.out.print(b + " ");
			} else if(a % 3 == 0) {
				System.out.print("-" + a + " ");
			} else {
				System.out.print(a + " ");
			}
			
			a +=2;
		}

	}

}
