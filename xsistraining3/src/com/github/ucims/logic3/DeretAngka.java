package com.github.ucims.logic3;
import java.util.Scanner;

public class DeretAngka {
	
	int jumlah;

	public DeretAngka() {
		// TODO Auto-generated constructor stub
	}
	
	public void deretSatu(int jumlah) {
		int deret[] = new int[jumlah];
		
		int a = 1;
		for(int i = 1; i < jumlah; i++) {
			if(i % 2 == 0) {
				System.out.print(a * -1 + " ");
			} else {				
				System.out.print(a + " ");
			}
			a +=2;
		}
	}
	
	public void deretDua(int jumlah) {
		int a = 1;
		for (int i = 1; i < jumlah; i++) {
			if(i % 3 == 0) {
				System.out.print(a * -1 + " ");
			} else {				
				System.out.print(a  + " ");
			}
			a +=2;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jumlah angka ?");
		int n = scan.nextInt();
		
		DeretAngka data = new DeretAngka();
		data.deretSatu(n);
		System.out.print("\n");
		data.deretDua(n);
	}

}
