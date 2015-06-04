package ba.bitcamp.hajrudin.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class VjezbeTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koliki niz zelite");
		int lenght=input.nextInt();
		int [] array = new int [lenght];
		
		for(int i = 0; i<array.length;i++){
			System.out.println("Unesite broj");
			array[i]=input.nextInt();
		}
		
		System.out.println(Arrays.toString(array));

	}

}
