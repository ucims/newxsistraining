package com.github.ucims.preparationexample;
import java.util.Scanner;

public class Soal0401 {
	
	private static Scanner scanner;

	public Soal0401() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		System.out.print("Masukkan nilai n : ");
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int sizeArrayTotal = n*n;
        
        String[][] array = new String[sizeArrayTotal][sizeArrayTotal];
        
        //note: utk bangun luar
        for (int bLuar = 0; bLuar < n; bLuar++) {
            for (int kLuar = 0; kLuar < n; kLuar++) {
                if (bLuar == n-n || bLuar == n-1 || kLuar == n-1||kLuar==n-n) {
                    //note: utk bangun dalam
                    for (int bDalam = 0; bDalam < n; bDalam++) {
                        for (int kDalam = 0; kDalam < n; kDalam++) {
                            if(bDalam == n-n || bDalam == n-1 || kDalam == n-n||kDalam==n-1) {
                                array[n*bLuar+bDalam][n*kLuar+kDalam] = "* ";
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
                    System.out.print(array[i][j]);
                }
                //note: pembatas tiap bangun di bag. kanan
                if ((j+1)%n == 0) { 
                	System.out.print(" "); 
                }
            }
            System.out.println();
            //note: pembatas tiap bangun di bag. bawah
            if ((i+1)%n == 0) { System.out.println(); 
            }
        }  
        
    }

}


