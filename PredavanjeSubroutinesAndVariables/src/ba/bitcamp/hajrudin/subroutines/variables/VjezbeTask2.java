package ba.bitcamp.hajrudin.subroutines.variables;

import java.util.Scanner;

public class VjezbeTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime nekog fajla sa exenzijom");
		String s = input.nextLine();
		System.out.println(getExtension(s));
		input.close();
	}
	
	public static String getExtension(String s){
		String newS = ""; 
		int i = s.indexOf('.');
		if(i>0){
			newS=s.substring(i);
			return newS;
		}
		return null;

}
}
