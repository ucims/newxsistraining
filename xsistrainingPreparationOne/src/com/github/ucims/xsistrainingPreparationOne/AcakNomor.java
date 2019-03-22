package com.github.ucims.xsistrainingPreparationOne;
import java.util.ArrayList;
import java.util.Random;

public class AcakNomor {

	public AcakNomor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Membuat Instance/Objek dari ArrayList dengan Tipe Data Integer
        ArrayList data = new ArrayList<>();
        AcakNomor myclass= new AcakNomor();
        
        //Menambahkan Bebrapa Data pada objek ArrayList
//        data.add(1); //Posisi/No Index 0
//        data.add(2); //Posisi/No Index 1
//        data.add(3); //Posisi/No Index 2
//        data.add(4); //Posisi/No Index 3
//        data.add(5); //Posisi/No Index 4
        
        for (int i = 1; i <= 12; i++) {
			data.add(i);
		}
        
        //Memanggil Method getClass
        myclass.getData(data);

	}
	
	public void getData(ArrayList data){
        int getAngka = (int) (Math.random()*data.size());
        System.out.println("Angka Yang Didapat: "+data.get(getAngka));
    }
	
	

}
