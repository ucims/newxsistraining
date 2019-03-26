package com.github.variasiSoal;
import java.util.*;

public class KorbanKunfuCoba2 {

	public KorbanKunfuCoba2() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
        int a = 1;
        
        KorbanKungfu02 jawab = new KorbanKungfu02();
        System.out.print("Masukan nilai n1 : ? ");
        Scanner isi1st = new Scanner(System.in);
        int n1 = isi1st.nextInt();
        System.out.print("Masukan nilai n2 : ? ");
        Scanner isi2nd = new Scanner(System.in);
        int n2 = isi2nd.nextInt();
        int n = (n2*2)-1;
        int jk = 1;
        int jka = n1+1;
        int [][] array = new int[n2*2][n2*2];
        
        for (int i = 1; i <= n2; i++) {
            for (int j = jk; j < jka; j++) {
                array[i][j]=a;
                a+=2;
            }
            jk++; jka++;
        }
        
        //Print output
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n2; j++) {
                if (array[j][i]==0) {
                    System.out.print("# \t");
                }else {
                    System.out.print(array[j][i]+"\t");
                }        
            }
            System.out.println();
        }
    }


}
