package com.github.ucims.example;

import javax.swing.JOptionPane;

public class example1 {

	Integer x = new Integer(10);
	int i = x.intValue();
	
	public example1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void Test() {
		
		int [] data = new int[2];
		data[0] = 1;
		data[1] = 2;
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String no = JOptionPane.showInputDialog("Pilih 1 Input Nama, Pilih 2 Untuk Cetak Nama");
		example1 x = new example1();		
		
		if(no.equals("1")) {
			System.out.println("Silahkan masukan nama");
			System.out.println("Anda Memilih " + x.x);
		}
		
		Test();

	}

}
