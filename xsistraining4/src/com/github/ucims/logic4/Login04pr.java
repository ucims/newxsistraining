package com.github.ucims.logic4;

import java.util.Scanner;

import com.github.ucims.utils.Tools;

public class Login04pr {
	
	int batasBawah;
	int batasAtas;
	int batasKanan;
	int batasKiri;
		
	static String [][] matrik = null;

	public Login04pr() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan jumlah matrik >>");
		int n = scan.nextInt();
		
		Tools.print(matrik);
	}
	

}
