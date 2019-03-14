package com.github.ucims.logic02;

public class Logic0203 {	

	int n = 9;
	int row = 0;
	int cols = 0;
	int angka = n*2-2;
	
	String[][] duaDimensi = null;

	public Logic0203() {
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
				} else if (i == n-1-j) {
					this.duaDimensi[i][j] = Integer.toString(this.angka);
				}					
			}
			this.angka -= 2;
		}
	}
	
	public void cetakDuaDimensi() {
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.cols; j++) {
				if (this.duaDimensi[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(this.duaDimensi[i][j]);
				}	
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logic0203 data = new Logic0203();
		data.setColRow(9);
		data.cetakDuaDimensi();

	}
	
	// Scanner scan = new scanner();

}
