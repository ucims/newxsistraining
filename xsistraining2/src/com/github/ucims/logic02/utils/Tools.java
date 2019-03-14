package com.github.ucims.logic02.utils;

public class Tools {

	public Tools() {
		// TODO Auto-generated constructor stub
	}
	
	public static void print(String[][] args) {
		for (int i = 0; i < args[0].length; i++) {
			for (int j = 0; j < args.length; j++) {
				if (args[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(args[i][j] + "\t");
				}
			}
			System.out.print("\t");
		}
	}

}
