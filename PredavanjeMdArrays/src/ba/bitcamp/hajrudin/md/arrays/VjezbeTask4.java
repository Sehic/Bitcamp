package ba.bitcamp.hajrudin.md.arrays;

import java.util.Scanner;

public class VjezbeTask4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite velicinu matrice");
		int vel = input.nextInt();
		int matr[][] = new int [vel][vel];
		inicijalizacijaMatrice(matr, vel);
		ispis(matr);
		numb(matr, vel);
		
	}
	
	public static void inicijalizacijaMatrice(int matr [][], int vel){
		for(int i =0; i<matr.length;i++){
				matr[(int)((Math.random())*vel)][(int)((Math.random())*vel)]=-1;
		}
	}
	
	public static void ispis (int matr [][]){
		for(int i =0; i<matr.length;i++){
			for(int j = 0; j< matr[i].length;j++){
				System.out.print(matr[i][j]+"	");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void  numb(int matr [][], int vel){
		int[][] newMatr = new int[vel][vel];
	      for (int i = 1; i < vel; i++)
	         for (int j = 1; j < vel; j++)
	            for (int ii = i - 1; ii < i + 1; ii++){
	               for (int jj = j - 1; jj < j + 1; jj++){
	                  if (matr[ii][jj]!=-1) {
	                	  newMatr[i][j]++;
	                  }
	                 }
	              }
	      
	      for(int i =0; i<matr.length;i++){
				for(int j = 0; j< matr[i].length;j++){
					if(matr[i][j]==-1){
						System.out.print("*	");
					} else
						System.out.print(newMatr[i][j]+ "	");
				}
				System.out.println();
			}
		
	}
		
}
