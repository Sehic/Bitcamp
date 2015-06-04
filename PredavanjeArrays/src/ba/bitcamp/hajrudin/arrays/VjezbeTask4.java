package ba.bitcamp.hajrudin.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class VjezbeTask4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string");
		String s = input.nextLine();
		int lenght = s.length();
		char [] arr = new char [lenght];
		
		for(int i = 0; i<lenght;i++){
			char c=s.charAt(i);
			arr[i]=c;
		}
		
		char [] arrNew = new char [lenght];
		int counter = lenght-1;
		for(int i = 0; i<lenght;i++){
			arrNew[counter]=arr[i];
			counter--;
		}
		
		System.out.println(Arrays.toString(arrNew));

	}

}
