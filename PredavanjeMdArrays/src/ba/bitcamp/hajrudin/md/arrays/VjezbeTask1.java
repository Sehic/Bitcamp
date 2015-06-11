package ba.bitcamp.hajrudin.md.arrays;

import java.util.Scanner;

public class VjezbeTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Unesite velicinu matrice");
		int vel = input.nextInt();
		int [][] matr = new int [vel][vel];
		unos(matr);
		ispis(matr);
		if(isSingular(matr, vel)==true){
			System.out.println("Matrica je singularna");
		} else {
			System.out.println("Matrica nije singularna");
		}
		
		
		
	}
	public static void unos (int matr [][]){
		Scanner input = new Scanner (System.in);
		for(int i =0; i<matr.length;i++){
			for(int j = 0; j< matr[i].length;j++){
				System.out.println("Unesite element za red "+i+" kolonu "+j);
				matr[i][j]=input.nextInt();
			}
		}
	}
	
	public static boolean isSingular(int matr [][], int vel){
		int det = 0;
		int a = 0, b= 0;
		int counter = 0;
		int [][] funnyMatr= new int [vel][vel+vel-1];
		for(int i =0; i<funnyMatr.length;i++){
			for(int j = 0; j< funnyMatr[i].length;j++){
				funnyMatr[i][j]=matr[i][counter];
				counter++;
				if(counter==vel){
					counter=0;
				}
			}
			counter=0;
			}
		for(int i = 0; i<vel;i++){
				a+=mnozenjeS(funnyMatr, i);
		}
		int temp=0;
		for(int i = 0; i<vel;i++){
				b-=mnozenjeO(funnyMatr, i);
			}
		det = a+b;
		if(det==0){
		return true;
		}
		else
			return false;
	}
	public static int mnozenjeO (int funnyMatr [][], int index){
		int b = 1;
		for(int i = funnyMatr.length-1; i>=0 ;i--){
			b*=funnyMatr[i][index];
			index++;
		}
		return b;
	}
	
	public static int mnozenjeS (int funnyMatr [][], int index){
		int a = 1;
		for(int i = 0; i < funnyMatr.length;i++){
			a*=funnyMatr[i][index];
			index++;
		}
		return a;
	}
	
	
	public static void ispis (int matr [][]){
		for(int i =0; i<matr.length;i++){
			for(int j = 0; j< matr[i].length;j++){
				System.out.print(matr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
