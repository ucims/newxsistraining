package com.github.ucims.test;

import java.util.Scanner;

public class Pengembangan03 {

	public Pengembangan03() {
		// TODO Auto-generated constructor stub
	}
	
	public void deret(int n) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(a);
			a++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan nilai y : ");
        int y = scan.nextInt();
        
        Pengembangan03 data = new Pengembangan03();
        data.deret(y);

	}

}
