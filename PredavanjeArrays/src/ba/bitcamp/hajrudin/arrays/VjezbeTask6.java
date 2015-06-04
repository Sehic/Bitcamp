package ba.bitcamp.hajrudin.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class VjezbeTask6 {

	public static void main(String[] args) {
		int [] arr;
		Scanner input = new Scanner(System.in);
		while(true){
			try{
			
			System.out.println("Unesite velicinu niza");
			int lenght = input.nextInt();
			arr = new int [lenght];
			if(lenght>0)
				break;
			}catch(Exception e){
				System.out.println("Pogresan unos");
			}
			
		}
		int counter =0;
		while(true){
		int i=0;
			while(true){
				try{
				System.out.println("Unesite index od 0 do "+arr.length);
				 i= input.nextInt();
				if(i>-1 && i<arr.length)
					break;
				}catch(Exception e){
					System.out.println("Pogresan unos");
				}
			}
			boolean temp = true;
			while(temp==true){
				try{
					input.nextLine();
				System.out.println("Unesite broj za index "+i);
				int num = input.nextInt();
				arr[i]=num;
				temp = false;
				}catch(Exception e){
					System.out.println("Pogresan unos");
					temp = true;
					
				}
			}

		}
		
	}

}
