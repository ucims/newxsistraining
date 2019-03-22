package com.github.ucims.preparationexample;

import java.util.Scanner;

public class Soal0801 {

	public Soal0801() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan n1 >>");
		int n1 = scan.nextInt();
		System.out.print("Masukan n2 >>");
		int n2 = scan.nextInt();
		
		int n = (n2 * 2) - 1;
		int jk = 1;
		int jka = n1 + 1;
		int[][] larik =  new int[n2*2][n2*2];
		
		for (int i = 1; i <= n2; i++) {
			for (int j = jk; j < jka; j++) {
				larik[i][j] = a;
				a+=2;
			}
			jk++;
			jka++;
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n2; j++) {
				if (larik[i][j] == 0) {
					System.out.print("#\t");
				} else {
					System.out.print(larik[j][i]+"\t");
				}
			}
			System.out.println();
		}
//		
//		int a = 1;
//        
//        Soal08 jawab = new Soal08();
//        System.out.print("Masukan nilai n1 : ? ");
//        Scanner isi1st = new Scanner(System.in);
//        int n1 = isi1st.nextInt();
//        System.out.print("Masukan nilai n2 : ? ");
//        Scanner isi2nd = new Scanner(System.in);
//        int n2 = isi2nd.nextInt();
//        int n = (n2*2)-1;
//        int jk = 1;
//        int jka = n1+1;
//        int [][] array = new int[n2*2][n2*2];
//        
//        for (int i = 1; i <= n2; i++) {
//            for (int j = jk; j < jka; j++) {
//                array[i][j]=a;
//                a+=2;
//            }
//            jk++; jka++;
//        }
//        
//        //Print output
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j <= n2; j++) {
//                if (array[j][i]==0) {
//                    System.out.print("# \t");
//                }else {
//                    System.out.print(array[j][i]+"\t");
//                }        
//            }
//            System.out.println();
//        }
    
		
	}

}
