package com.github.ucims.amunisi;
import java.util.Scanner;

public class Soal08 {

	public Soal08() {
		// TODO Auto-generated constructor stub
	}
	
	static int a = 0;
	static int a1 = 0;
	static int n = 0;
	static int b = 0;
	static int c = 0;
	static int d = n ;
	static int e = n ;
	static int f = n ;
	static int g = n ;
	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.print("Masukkan nilai n : ");

		scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		a = rSgTiga(n);
		a1 = rSgTiga1(n);
		b = manipulasibaris(n);
		c = manipulasibaris1(n);
		d = 1 ;
		e = 1 ;
		f = n ;
		g = n ;
		int sizeArrayTotal = n * n;

		String[][] array = new String[sizeArrayTotal][sizeArrayTotal];

		// note: utk bangun luar

		for (int bLuar = 0; bLuar < 1; bLuar++) {

			for (int kLuar = 0; kLuar < 2; kLuar++) {

				if (kLuar % 2 == 0 && bLuar == 0) {

					// note: utk bangun dalam

					for (int bDalam = 1; bDalam <= b; bDalam++) {

						for (int kDalam = 1; kDalam <= a; kDalam++) {

							if (bDalam %2 != 0) {

							array[n * bLuar + bDalam - 1][n * kLuar + kDalam - 1] = (" \t" + d );

							}
							else {

							array[n * bLuar + bDalam - 1][n * kLuar + kDalam - 1] = (" \t" + d);

							}

						}
						a -= 2;
						d++;
					}

				}

				if (kLuar % 2 != 0 && bLuar == 0) { 
					
					d=d;
					
					for (int bDalam = n; bDalam >= b + c; bDalam--) {

						for (int kDalam = 1; kDalam <= a1; kDalam++) {

							if ( f == g)  {

								array[n * bLuar + bDalam + (n - 1)][n * kLuar + kDalam - (n + 1)] = (" \t"  +e );
								
							}else  { 

								array[n * bLuar + bDalam + (n - 1)][n * kLuar + kDalam - (n + 1)] = (" \t"  + e );
							}

					
						}
						
						a1 -= 2;
						e++;
						
						if ( f == g) { 
							f-=2 ;
							
						} else { }
						g-=1;
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

	public static int rSgTiga(int n) {

		int angka = 0;

		for (int i = 1; i < n; i++) {

			angka += 2;

		}

		return angka;
	}

	public static int manipulasibaris(int n) {

		int angka = 0;

		for (int i = 1; i < n; i++) {

			angka += 1;

		}

		return angka;
	}

	public static int rSgTiga1(int n) {

		int angka = 0;

		for (int i = 1; i < n; i++) {

			angka += 2;

		}

		return angka;
	}

	public static int manipulasibaris1(int n) {

		int angka = (n + 1);

		for (int i = 1; i < n; i++) {

			angka -= 2;

		}

		return angka;
	}

}
