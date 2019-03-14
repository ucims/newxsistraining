package com.github.ucims.logic3;

import java.util.Scanner;

public class Soal12 {
	
	int jumlah, index, hasil;

	public Soal12() {
		// TODO Auto-generated constructor stub
	}
	
	public void kebalikanDeret(int jumlah) {
		int a = 1;
		int [] angkaA = new int[jumlah];
		
		for (int i = 0; i < jumlah; i++) {		// isi angkaA[i[ dengan nilai a yg ditambah 2	
			angkaA[i] = a;			
			a += 2;			
//			System.out.print(angkaA[i]);
		}
		
		index = angkaA.length - 1; // atau angkaA.length // - 1 
		hasil = 0;
		hasil = angkaA[index];
		
		System.out.print(angkaA[index]);
		
		for (int i = index; i >= 0; i--) {
			System.out.print(angkaA[i] + " ");
			hasil = hasil - angkaA[i];
		}
		
		System.out.print(hasil);	
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan jumlah angka >>");
		int n = scan.nextInt();
		
		Soal12 data = new Soal12();
		data.kebalikanDeret(n);		
	}

}

//int[] array = new int[10];
//int jum = 0;
//System.out.println("Masukan 10 Nilai Array:");
//for (int i=0; i<10; i++)
//{
//array[i] = scanner.nextInt();
//}
//for( int num : array) {
//    jum = jum+num;
//}
//System.out.println("Jumlah Dari Nilai Array adalah :"+jum);
//for(int i : array) {
// 
// System.out.println("Jumlah Dari Nilai Array adalah :" + array[i]);
//
//}
