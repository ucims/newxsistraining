package com.github.ucims.test;

import java.util.Scanner;

public class Pengembangan01 {

	public Pengembangan01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai n : ");
        int n = scan.nextInt();
        System.out.print("Masukkan nilai m : ");
        int m = scan.nextInt();
        
        
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
				if (i > n) {
					System.out.print(m);
				}
			}
		}
	}

}
