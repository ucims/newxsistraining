package com.github.ucims.amunisi;
import java.util.*;

public class Soal05 {

	public Soal05() {
		// TODO Auto-generated constructor stub
	}

	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.print("Masukkan nilai n : ");

		scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int sizeArrayTotal = n * n;

		String[][] array = new String[sizeArrayTotal][sizeArrayTotal];

		// note: utk bangun luar

		for (int bLuar = 0; bLuar < n - n + 1; bLuar++) {

			for (int kLuar = 0; kLuar < n-n+1; kLuar++) {

//				if (kLuar== 0 && bLuar == 0 ) {

					// note: utk bangun dalam

					for (int bDalam = 1; bDalam <=n; bDalam++) {

						for (int kDalam = 1 ; kDalam <= n ; kDalam++) {

							if (bDalam==1||kDalam==1||bDalam==n||kDalam==n) {

								array[n * bLuar + bDalam][n * kLuar + kDalam] = "* ";

							}
							if (bDalam==1&&kDalam==1||bDalam==n&&kDalam==n||bDalam==1&&kDalam==n||bDalam==n&&kDalam==1) {

								array[n * bLuar + bDalam][n * kLuar + kDalam] = "O ";

							}


						}

					}

//				}
				
//				if (kLuar % 2 != 0 && bLuar == 0 )
//				{	for (int bDalam = 1; bDalam <= n; bDalam++) {
//
//					for (int kDalam = 1 ; kDalam <= n ; kDalam++) {
//
//						if (bDalam <= n- kDalam+1)  {
//
//							array[n * bLuar + bDalam+(n-2)][n * kLuar + kDalam-1] = "* ";
//
//						}
//
//					}
//
//				}
//					
//				}

			}

		}

		for (int i = 0; i < array[0].length; i++) {

			for (int j = 0; j < array[0].length; j++) {

				if (array[i][j] == null) {

					System.out.print("  ");

				} else {

					System.out.print(array[i][j]);

				}

				// note: pembatas tiap bangun di bag. kanan

//				if ((j + 1) % n == 0) {
//					System.out.print(" ");
//				}

			}

			System.out.println();

			// note: pembatas tiap bangun di bag. bawah

//			if ((i + 1) % n == 0) {
//				System.out.println();
//			}

		}

	}

}
