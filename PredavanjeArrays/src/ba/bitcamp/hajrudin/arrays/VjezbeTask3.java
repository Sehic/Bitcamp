package ba.bitcamp.hajrudin.arrays;

import java.util.Scanner;

public class VjezbeTask3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite unijeti?");
		int lenght=input.nextInt();
		int [] array = new int [lenght];
		
		for(int i = 0; i<array.length;i++){
			System.out.println("Unesite broj");
			array[i]=input.nextInt();
		}
		
		System.out.println("Unesite broj koji zelite prebrojati");
		int find = input.nextInt();
		int counter = 0;
		
		for(int i = 0; i<array.length;i++){
			if(array[i]==find)
				counter++;
		}
		
		System.out.println("Broj "+find+" se ponavlja "+counter+" puta.");

	}

}
