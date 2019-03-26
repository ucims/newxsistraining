package com.github.ucims.logic3;

import java.util.Scanner;

public class Logic0301 {
	
	int jumlah;
	int nilaiA = 1;
	int nilaiB = 1;
	int nilaiC = 1;
	int hasil = 1;
	long fib[];
	
	String [] nilaiFibo = null;

	public Logic0301() {
		// TODO Auto-generated constructor stub
	}
	
	public void fibonaciDuaJumlah(int jumlah) {		
		
		System.out.println("Jumlah angka " + jumlah);
		for (int i = 0; i < jumlah; i++) {
			hasil = nilaiA + nilaiB;
			nilaiA = nilaiB;
			nilaiB = hasil;				
		}	
		System.out.print(" " + hasil + "\t");
	}
	
	public void fibonaciDua(int jumlah) {
		
		long fib[] = new long[jumlah];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i = 2; i < jumlah; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		for (int i = 0; i < jumlah; i++) {
			System.out.print(fib[i] +  " ");
		}
	}
	
	public void fiboJumlahTiga(int jumlah) {
		nilaiA = 0;
		nilaiB = 0;
		nilaiC = 0;
//		System.out.println("\nJumlah angka " + jumlah);
		for (int i = 0; i < jumlah; i++) {
			hasil = nilaiA + nilaiB + nilaiC;
			nilaiA = nilaiB;
			nilaiB = nilaiC;
			nilaiC = hasil;			
		}
		
		System.out.print("Hasil :" + hasil);
	}
	
	
		
	public static void main(String[] args) {
		Logic0301 data = new Logic0301();
		Scanner scan = new Scanner(System.in);		
		System.out.print("Masukan jumlah nilai >> ");
		int n = scan.nextInt();
		
		data.fibonaciDuaJumlah(n);
//		data.fiboJumlahTiga(n);
		data.fibonaciDua(n);
	}

}
