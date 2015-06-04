package ba.bitcamp.hajrudin.arrays;

import java.util.Scanner;

public class PredavanjeTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri broja");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int max=0;
		if(num1>num2)
			max=num1;
		else
			max=num2;
		if(num3>max)
			max=num3;
		System.out.println(max);
	}

}
