package ba.bitcamp.hajrudin.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PredavanjaTask3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int[] numbers = new int[10];
		while (true) {
			System.out.println("Unesite broj (-1 za izlaz) :");
			int num = input.nextInt();
			if (num == -1)
				break;
			else {
				if (counter == 10) {
					for (int i = 1; i < 10; i++) {
						numbers[i - 1] = numbers[i];
					}
					counter -= 1;
				}
				numbers[counter] = num;
				counter++;
			}
		}
		int max = numbers[0];
		for (int i = 1; i < 10; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		System.out.println(Arrays.toString(numbers));
		Arrays.copyOf(numbers, 11);
		
		//for (int i = 0; i < 10; i++)
		//	System.out.println(numbers[i]);
		System.out.println("Najveci broj je: " + max);

	}

}
