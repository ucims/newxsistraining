package com.github.variasiSoal;

public class Tools {

	public Tools() {
		// TODO Auto-generated constructor stub
	}

	public static void cetak2D(String[][] array2D) {
		for (int i = 0; i < array2D[0].length; i++) {
			for (int j = 0; j < array2D[1].length; j++) {
				if (array2D[i][j]==null) {
					System.out.print("\t");
				}else {
					System.out.print(array2D[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
	public static void cetakbangun(String[][] array2D) {
		for (int i = 0; i < array2D[0].length; i++) {
			for (int j = 0; j < array2D[1].length; j++) {
				if (array2D[i][j]==null) {
					System.out.print("\t");
				}else {
					System.out.print(array2D[i][j]+"\t");
				}
			}
			System.out.println();
		}
		
	}
}
