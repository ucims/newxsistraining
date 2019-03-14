package com.github.ucims.logic02;

public class Logic0205 {
	
	int n = 9;
	int row = 0;
	int cols = 0;
	int angka = 1;
	String [][] duaDimensi = null;

	public Logic0205() {
		// TODO Auto-generated constructor stub
	}
	
	public void setColRow(int n) {
		this.row = n;
		this.cols = n;
		this.duaDimensi = new String[this.row][this.cols];
		
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.cols; j++) {
				if (j >= i) {
					this.duaDimensi[i][j] = Integer.toString(this.angka) + "\t";										
				}		
			}
			this.angka += 2;
		}
	}
	
	public void cetakDuaDimensi() {
		for (int i = 0; i < this.row; i++) {
			
			for (int j = 0; j <= i; j++) {	
				if (this.duaDimensi[i][j] == null) {
					System.out.print("\t");
				} else {
					System.out.print(this.duaDimensi[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		Logic0205 data5 = new Logic0205();
		data5.setColRow(9);
		data5.cetakDuaDimensi();
	}

}
