package ba.bitcamp.hajrudin.md.arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PredavanjeTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] matrix=new int [1] [1];
		try{
		System.out.println("Unesite broj redova");
		int red = input.nextInt();
		System.out.println("Unesite broj kolona");
		int kolona = input.nextInt();
		 matrix = new int [red][kolona];
		}catch(Exception ex){
			System.out.println("Pogresan unos");
			System.exit(0);
		}
		try{
		for(int i = 0; i<matrix.length;i++){
			for(int j = 0; j<matrix[i].length;j++){
				System.out.println("Unesite element za red "+i+" kolonu "+j);
				int el = input.nextInt();
				matrix[i][j]=el;
			}
		}
		}catch(InputMismatchException ex){
			System.out.println("Pogresan unos");
			System.exit(0);
		}
		ispisMatrice(matrix);
		try{
		System.out.println("Unesite koju kolonu zelite");
		int index = input.nextInt();
		int arr [] = kolona(matrix, index);
		System.out.println(Arrays.toString(arr));
		}catch(Exception ex){
			System.out.println("Pogresan unos");
		}
		input.close();
	}
	
	public static void ispis(int matr []){
		System.out.println();
		System.out.println(Arrays.toString(matr));
	}
	
	public static int [] kolona(int matr[][], int j){
		int [] arr = new int [matr.length];
		for(int i = 0; i<matr.length;i++){
			arr[i]=matr[i][j];
		}
		return arr;
	}
	
	public static void ispisMatrice(int matrix[][]){
		for(int i = 0; i<matrix.length;i++){
		System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
