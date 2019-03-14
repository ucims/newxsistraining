package com.github.ucims.logic02;

public class Logic0201 {

	int n = 9;
	int row = 0;
	int cols = 0;
	int angka = 1;
	String[][] duaDimensi= null;
	
			
	public Logic0201() {
		// TODO Auto-generated constructor stub
	}
	
	public void setColRow(int n) {
		
		this.row = n;
		this.cols = n;
		this.duaDimensi = new String[this.row][this.cols];
		
		for (int i = 0; i < this.row; i++) {
			
			for (int j = 0; j < this.cols; j++) {
				if (i == j) {
					this.duaDimensi[i][j] = Integer.toString(this.angka); 
				} 				
			}
			this.angka += 2;
		}
	}
	
	public void cetakDuaDimensi() {
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.cols; j++) {
				if (this.duaDimensi[i][j] == null) {
					System.out.print("\t");
				} else {
					System.out.print(this.duaDimensi[i][j]+"\t");
				}
			}
			
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		
		Logic0201 data = new Logic0201();
		data.setColRow(9);
		data.cetakDuaDimensi();
		
	}

}
