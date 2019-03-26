package com.github.ucims.amunisi;

import java.util.*;

public class Soal01 {

	public Soal01() {
		// TODO Auto-generated constructor stub
	}
	
	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.print("Masukkan nilai n : ");

		scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int sizeArrayTotal = n * n;
		int jmlhBaris = n * 3;
		int jmlhKolom = n * 3;
		String[][] array = new String[jmlhBaris][jmlhKolom];

		// note: utk bangun luar
// untuk membuat dimensi luar m x n
		for (int bLuar = 0; bLuar < 3; bLuar++) { // Membuat jumlah baris kotak luar

			for (int kLuar = 0; kLuar < 3; kLuar++) { // Membuat jumlah kolom kotak luar

				if (bLuar == n - n + 1 || kLuar == n - n + 1) { // Membuat kondisi bentuk luar yang diinginkan

					// note: utk bangun dalam
					int bDalam = bLuar * n;
					int kDalam = kLuar * n;
					int eb = bDalam + n - 1;
					int ek = kDalam + n - 1;

					for (int b = bDalam; b <= eb; b++) { // Membuat jumlah baris kotak dalam

						for (int k = kDalam; k <= ek; k++) { // Membuat jumlah kolom kotak dalam

							if (b == 2 * bDalam || k == 2 * kDalam || (k - kDalam) == ek || (b - bDalam) == eb) {

								array[b][k] = "* "; // pembuat bintang atas dan kiri
								array[jmlhBaris - b - 1][k] = "* "; // pembuat bintang  kiri bawah
								array[k][jmlhBaris - b - 1] = "* "; // pembuat atas kanan
							}

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

					System.out.print(array[i][j] + "");

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
