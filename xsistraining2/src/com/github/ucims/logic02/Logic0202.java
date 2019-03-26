package com.github.ucims.logic02;

public class Logic0202 {
	
	int n = 9;
	int row = 0;
	int cols = 0;
	int angka = n*2-2;
	
	String[][] duaDimensi = null;

	public Logic0202() {
		// TODO Auto-generated constructor stub
	}
	
	public void setColRow(int n) {
		
		this.row = n;
		this.cols = n;
		this.duaDimensi = new String[this.row][this.cols];
		
		for (int i = 0; i < this.row; i++) {
			
			for (int j = 0; j < this.row; j++) {
				if (i  == n-1-j) {					
					this.duaDimensi[i][j] = Integer.toString(this.angka); 
				} 						
			}
			this.angka -= 2;
		}
	}
	
	public void cetakDuaDimensi() {
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.row; j++) {
				if (this.duaDimensi[i][j] == null) {
					System.out.print("*");
				} else {
					System.out.print(this.duaDimensi[i][j]);
				}	
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic0202 data2 = new Logic0202();
		data2.setColRow(9);
		data2.cetakDuaDimensi();
		
	}

}
