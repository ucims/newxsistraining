package com.github.ucims.amunisi;

import java.util.*;

public class Soal04 {

	public Soal04() {
		// TODO Auto-generated constructor stub
	}
	
	private static Scanner scanner;



	public static void main(String[] args) {

	

		System.out.print("Masukkan nilai n : ");

		scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		System.out.print("Masukkan nilai m : ");

		scanner = new Scanner(System.in);

		int m = scanner.nextInt();
		

		int sizeArrayTotal = n*n;
		  int a =1 ; 
		int b = (m+n)/2;
		int c = b;

		String[][] array = new String[sizeArrayTotal][sizeArrayTotal];

		



		//note: utk bangun luar

		for (int bLuar = 0; bLuar < n-1; bLuar++) {

			for (int kLuar = 0; kLuar < n; kLuar++) {

				if (bLuar-kLuar == 0 || bLuar == 0 ) {



					//note: utk bangun dalam

					for (int bDalam = 0; bDalam < 1; bDalam++) {

						for (int kDalam = 0; kDalam < 1; kDalam++) {

							if(kLuar%2 == 0 &&  bLuar == 0|| kLuar %2 != 0 && bLuar >=1) {

								array[n*bLuar+bDalam][n*kLuar+kDalam] = (" *"  );

							
							}
								else if (kLuar == bLuar) { 
								array[n*bLuar+bDalam][n*kLuar+kDalam] = (" " + b );
							}
							else {
								array[n*bLuar+bDalam][n*kLuar+kDalam] = (" " + b  );
							}
							
						}

					}

					a++;
					b += c ;
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
