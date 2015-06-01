package ba.bitcamp.hajrudin.switchh.casee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

	public static int divide (int a, int b){
	if(b==0){
		throw new ArithmeticException("Not 0");
	}
	return a/b;
}
	
	
	public static void main(String[] args) {
		Scanner ulaz = new Scanner (System.in);
		int num=0;
		int num2=0;
		try{
			num = ulaz.nextInt();
			 System.out.println(divide(num,num2));
			
		}catch(InputMismatchException e){
			System.out.println(e.getMessage());
			System.out.println("Nije moguce");
		}catch(ArithmeticException e1){
			System.out.println(e1.getMessage());
			System.out.println("Dijeljenje nije proslo");
		}
		
		
		
	
	System.out.println("Ovo je kraj programa");
	
	
}
}