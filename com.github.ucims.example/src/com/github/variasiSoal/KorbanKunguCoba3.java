package com.github.variasiSoal;

import java.util.*;

import com.github.variasiSoal.*;

public class KorbanKunguCoba3 {

	public KorbanKunguCoba3() {
		// TODO Auto-generated constructor stub
	}

	 static int n = 0;
	   static int nT = (n-1)/2;
	   static int nP = 0;
	   static int nL = 0;
	   static int bA = 0;
	   static int bB = 0;
	   static int bK = 0;
	   static int bKa = 0;
	   static String[][] array2 = null;
	   static int angka = 0;

	   public static void setArray() {
	       angka = 1;
	       for (int i = bA; i < bB; i++) { //bangun dalam
	               //i = 0 ; i < 3
	           for (int j = bK; j < bKa; j++) {
	                   //j=0  ; j < 3
	               array2[n-1-i][j] = "*";
	               //angka++;
	           }
	       }
	   }

	   public static int setSgEmpat(int tkp) { //jumlah faktorial bangun looping 1,4,dst
	       int angka = 0;
	       for (int i = 1; i <= tkp; i++) {
	           angka = angka + i;
	       }
	       return angka;
	   }

	   public static void main(String[] args) {
	       System.out.print("Masukkan n (misal n=4) : ");
	       Scanner inp = new Scanner(System.in);
	       int tkp = inp.nextInt();
	       //  3
	       n = setSgEmpat(tkp);
	       // 6
	       nP = n;
	       //6
	       nL = n;
	       //6
	       array2 = new String[nP][nL];
	       //[6][6]

	       for (int i = 0; i <= tkp; i++) { //urutan bangun loop dari terkecil ke terbesar
	           //  i=3
	           // i = 2
	           bB = bB + i;
	           //0 = 0 + 3
	           //3 = 3 + 2
	           bKa = bKa + i;
	           //0 = 0 + 3
	           //3 = 3 + 2
	           setArray();
	           bB = bA;
	           //0 = 3
	           //3 = 5
	           bK = bKa;
	           //0 = 3
	           //3 = 5
	       }
	       Tools.cetak2D(array2);
	   }
}
