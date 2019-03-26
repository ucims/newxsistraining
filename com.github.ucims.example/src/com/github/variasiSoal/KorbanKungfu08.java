package com.github.variasiSoal;

import java.util.Scanner;

public class KorbanKungfu08 {
	
	int a;
	int b ;
	int row;
	int cols;
	
	String[][] larik = null; 

	public KorbanKungfu08() {
		// TODO Auto-generated constructor stub
	}
	
	public void segitiga(int n) {
		this.row = n;
		this.cols = n;
		this.a = n;
		int tt = (n-1)/2;
		this.larik = new String[this.row][this.cols];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= n-1-j && j <= n) {
					larik[i][j] = Integer.toString(this.a);					
				}				
			}
			a = a * 2;
			
		}
	}
	
	public void cetakDuaDimensi() {
		for (int i = 0; i < this.row -1; i++) {
			for (int j = 0; j < this.cols; j++) {
				if (this.larik[i][j] == null) {
					System.out.print(" ");
				} else {
//					if (i % 2 == 0) {
//						System.out.print("-"+this.larik[i][j] + " ");

//					}else {
						System.out.print(this.larik[i][j] + "\t");
//					}
				}	
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("Masukkan nilai n : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
        KorbanKungfu08 data = new KorbanKungfu08();
        data.segitiga(n);
        data.cetakDuaDimensi();
	}

}
