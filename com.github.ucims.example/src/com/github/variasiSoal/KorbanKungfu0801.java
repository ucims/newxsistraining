package com.github.variasiSoal;

import java.util.Scanner;

public class KorbanKungfu0801 {
	
	static int a;
	static int a1;
	static int n;
	static int b;
	static int c;
	static int d;
	static int e;
	static int f;
	static int g;
	
	public KorbanKungfu0801() {
		// TODO Auto-generated constructor stub
	}
	
	public static int segitigaSatu(int n) {
		int angka = 0;
		for (int i = 1; i < n; i++) {
			angka += 2;
		}
		return angka; 
	}
	
	public static int segitigaDua(int n) {
		int angka = 0;
		for (int i = 1; i < n; i++) {
			angka += 2;
		}
		return angka;
	}
	
	public static int manipulasiBarisSatu(int n) {
		int angka = 0;
		for (int i = 1; i < n; i++) {
			angka += 1;
		}
		return angka;
	}
	
	public static int manipulasiBarisanDua(int n) {
		int angka = n+1;
		for (int i = 0; i < n; i++) {
			angka -= 2;
		}
		return angka;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Masukkan nilai n : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        a = segitigaSatu(n);
        a1 = segitigaDua(n);
        b = manipulasiBarisSatu(n);
        c = manipulasiBarisanDua(n);
        d = n;
        e = n;
        f = n;
        g = n;
        
        int jmlLarik = n*n;
        String[][] larik = new String[jmlLarik][jmlLarik];
        
        for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 2; j++) {
				if (j % 2 == 0 && i == 0) {
					for (int i2 = 1; i2 <= b ; i2++) {
						for (int j2 = 1; j2 <= a; j2++) {
							if (i2 != 0) {
								larik[n*i+i2-1][n*j+j2-1] = ("\t" +-d);
							} else {
								larik[n*i+i2-1][n*j+j2-1] = ("\t" +d);								
							}
						}
						a -= 2;
						d += 4;
					}
				}
				if (j % 2 != 0 && i == 0 ) {
					d = d;
					for (int i2 = n; i2 >= b+c; i2--) {
						for (int j2 = 1; j2 <= a1; j2++) {
							if (f == g) {
								larik[n*i+i2+(n-1)][n*j+j2 -(n+1)] = (" \t" + e);
							} else {
								larik[n*i+i2+(n-1)][n*j+j2 -(n+1)] = (" \t" + -e);
							}
						}
						a1 -= 2;
						e += 4;
						if (f == g) {
							f -= 2;
						} else {
							
						}
						g -= 1;
					}
				}
			}
		}
        
        for (int i = 0; i < larik[0].length; i++) {
			for (int j = 0; j < larik[0].length; j++) {
				if (larik[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(larik[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	

}
