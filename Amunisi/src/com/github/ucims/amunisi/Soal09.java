package com.github.ucims.amunisi;
import java.util.*;
public class Soal09 {

	public Soal09() {
		// TODO Auto-generated constructor stub
	}
	
	private static Scanner scanner;



	public static void main(String[] args) {

	

		System.out.print("Masukkan nilai n : ");

		scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a = 0;
		int b = 2;

		int sizeArrayTotal = n*n;

		

		String[][] array = new String[n][n];

		



		//note: utk bangun luar

//		for (int bLuar = 0; bLuar < n; bLuar++) {
//
//			for (int kLuar = 0; kLuar < n; kLuar++) {

//				if (bLuar+kLuar == n-1 || bLuar == n-1 || kLuar == n-1) {



					//note: utk bangun dalam

					for (int bDalam = 0; bDalam < 2 ; bDalam+=1) {

						for (int kDalam = a; kDalam <  n ; kDalam+=1) {

//							if(bDalam >= 0    ) {

								array[bDalam][kDalam] = "* ";

//							}
//							if(bDalam== 1&& kDalam == 2|| bDalam== 1 && kDalam == 3) {
//
//		 						array[bDalam][kDalam] = "* ";
//								a+=2;
//							}	
						}
						a+=2;
						n-=2;
					
			
//						else {
//
//			}
					}

					

//				}

//			}
//
//		}



		

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
