package com.github.ucims.logic02;

import java.util.Scanner;

import com.github.ucims.logic02.utils.Tools;

public class Logic0211 {
	
	int n = 9;
	int row = 0;
	int cols = 0;
	int angka = 0;

	static String[][] duaDimensi = null;
	
	public Logic0211() {
		// TODO Auto-generated constructor stub
	}
	
	public void setColRow(int n) {
		this.row = n;
		this.cols = n;
		this.duaDimensi = new String[n][n];
		
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.cols; j++) {
				this.duaDimensi[i][j] = angka +"*"; //Integer.toString("*")
				this.angka++;
			}
			
			this.angka++;			
		}
	} 
	
	public static void main(String[] args) {
		System.out.print("Jumlah matrix >> ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println();
//		System.out.print("Jumlah baris matrix >> ");
//		int jml = scan.nextInt();
		
		System.out.println("Jumlah " + n);
		
		Logic0211 data = new Logic0211();
		
		data.setColRow(n);
		
		for (int j = 0; j < n; j++) { //baris
			for (int h = 0; h < n; h++) { //kolom //tadinya var jumlah
				Tools.print(duaDimensi);
				System.out.println();
			}
			System.out.print("\n");
		}
//		Tools.print(duaDimensi);//				}
		
	}

}
