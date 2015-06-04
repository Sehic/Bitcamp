package ba.bitcamp.hajrudin.arrays;

import java.util.Scanner;

public class PredavanjaTask2 {

	public static void main(String[] args) {
		int [] brojevi = new int [50];
		Scanner input = new Scanner(System.in);
		for(int i =0; i<brojevi.length;i++){
			System.out.println("Unesite broj (-1 za izlaz) :");
		brojevi[i]=input.nextInt();
		if(brojevi[i]==-1)
			break;
		}
		for(int i=0;i<brojevi.length;i++){
			if(brojevi[i]==-1)
				break;
			System.out.println(brojevi[i]);
		}

	}

}
