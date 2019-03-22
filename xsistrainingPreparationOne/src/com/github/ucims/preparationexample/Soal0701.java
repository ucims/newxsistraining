package com.github.ucims.preparationexample;
import java.util.Scanner;
import com.github.ucims.tools.Tools;

public class Soal0701 {
	
	static int n = 0;
	static int nT = 0;
	static int nP = 0;
	static int nL = 0;
	static int bA = 0;
	static int bB = 0;
	static int bK = 0;
	static int bKa = 0;

	static String[][] array2 = null;
	static int angka = 0;
	static int ctr = 0;
	static int angGanjil = 0;
	static int angGenap = 0;

	public Soal0701() {
		// TODO Auto-generated constructor stub
	}
	
	public static void setArray() {
		int ganjil = 1;
		for (int i = bA; i < bB; i++) {
			for (int j = bK; j < bKa; j++) {
				array2[i][j] = Integer.toString(angGanjil);
			}
		}
	}
	
	public static void setArrayGenap(int angka) {
			
		for (int i = bA; i < bB; i++) {
			if (i<nT) {
				angGenap=angGenap+2;
			} else {
				angGenap=angGenap-2;
			}
			for (int j = bK; j < bKa; j++) {		
				array2[i][j] = Integer.toString(angGenap);
			}
		}
	}
	
	public static int setTambah4(int tkp) {
		
		int m = 1;
		for (int i = 0; i < tkp; i++) {
			if (i > 0) {
				m = m + 4;
			}
		}
		return m;
	}

	public static int setRsSgTiga(int m) {
		int angka = 1;
		for (int i = 0; i < m; i++) {
			if (i > 0) {
				angka+=2;	
			}
			
		}
		return angka;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		int tkp = inp.nextInt();
		Scanner inp2 = new Scanner(System.in);
		int tkp2 = inp.nextInt();
		
		
		
		n =  tkp;
		
		nP = setTambah4(n);
		nT = (nP - 1)/2;
		nL = setRsSgTiga(n) ;

		array2 = new String[50][50];
		bA = 0;
		bB = 1;
		bK = 1;
		bKa = 2;
		angGenap = 2;
		for (int i = 0; i < nP; i++) {
			setArrayGenap(angGenap);
			if (i<nT-1) {
				bK++;
				bKa++;
				bB++;	
			} else {
				
					bK--;
					bKa++;
					bB--;	
				
				
			}
			
			
		}
		bA = 1;
		bB = nL;
		bK = 0;
		bKa = 1;
		angGanjil = 1;
		for (int i = 0; i <= nP; i++) {
			setArray();
			if (i<nT-1) {
				bK++;
				bKa++;
				bA++;	
			} 
			 if (i== nT) {
				 	bK = nT+1;
				 	bKa = nT+2;
				
			}
			 if (i>nT+1) {

					bK++;
					bKa++;
					bA--;
			}
			
			
		}
				
		
		Tools.cetak2D(array2);
		
	}

	}

