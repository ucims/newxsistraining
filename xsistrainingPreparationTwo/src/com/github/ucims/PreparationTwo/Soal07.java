package com.github.ucims.PreparationTwo;

import java.util.Scanner;

public class Soal07 {

	public Soal07() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukan angka > >");
		int n = scan.nextInt();	
		int bil = 0;
		
		for (int i = 2; i < n; i++)
		{
			int number = i;
			boolean found = false;			
			for (int j = 2; j < number; j++)
			{
				if (i%j == 0)
				{
					found = true;
				}
			}
			if (!found)
			{
				System.out.println(number);
			}
		}

	
	}

}
