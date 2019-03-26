package com.github.ucims.amunisi;
import java.util.*;
public class Soal10 {

	public Soal10() {
		// TODO Auto-generated constructor stub
	}
	
	public static Scanner scanner;



	public static void main(String[] args) {

	

		System.out.print("Masukkan nilai n : ");

		scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		

		int sizeArrayTotal = n*n;

		

		String[][] array = new String[sizeArrayTotal][sizeArrayTotal];

		



		//note: utk bangun luar

		for (int bLuar = 0; bLuar < n; bLuar++) {

			for (int kLuar = 0; kLuar < n; kLuar++) {

				if (bLuar+kLuar == n-1 ||bLuar == kLuar) {



					//note: utk bangun dalam

					for (int bDalam = 0; bDalam < n; bDalam++) {

						for (int kDalam = 0; kDalam < n; kDalam++) {

//							if(bDalam+kDalam == n-1 || bDalam == n-1 || kDalam == n-1) {

								array[n*bLuar+bDalam][n*kLuar+kDalam] = "* ";

//							}

						}

					}

					

				}

			}

		}



		

		for (int i = 0; i < array[0].length; i++) {

			for (int j = 0; j < array[0].length; j++) {

				if (array[i][j] == null) {

					System.out.print("  ");

				} else {

					System.out.print(array[i][j]);

				}

				//note: pembatas tiap bangun di bag. kanan

				if ((j+1)%n == 0) { System.out.print(" "); }

			}

			System.out.println();

			//note: pembatas tiap bangun di bag. bawah

			if ((i+1)%n == 0) { System.out.println(); }

		}

		

		

		

		

	}

	

}
