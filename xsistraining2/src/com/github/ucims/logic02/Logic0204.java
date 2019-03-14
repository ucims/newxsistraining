package com.github.ucims.logic02;

public class Logic0204 {
	
	int n = 9;
	int row = 0;
	int cols = 0;
	int angka = 1;
	int titikTengah = (n-1)/2;
	
	String[][] duaDimensi = null;

	public Logic0204() {
		// TODO Auto-generated constructor stub
	}
	
	public void setColRow(int n) {
		this.row = n;
		this.cols = n;
		this.duaDimensi = new String[this.row][this.cols];
		
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.cols; j++) {
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
