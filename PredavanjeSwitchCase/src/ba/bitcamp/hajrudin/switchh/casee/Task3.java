package ba.bitcamp.hajrudin.switchh.casee;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner (System.in);
		System.out.println("Unesite broj pa operator pa broj");
		String a = ulaz.nextLine();
		int counter = 0;
		char c='a';
		String b="";
		String f="";
		for(int i =0; i<a.length(); i++){
			char d = a.charAt(i);
			if(d=='+' || d== '-'){
				c=a.charAt(i);
				counter++;
			}
			else if (counter == 0)
				b+=d;
			else if (counter == 1)
				f+=d;
		}
		int num1=0;
		int num2=0;
		try{
		num1 = Integer.parseInt(b);
		num2 = Integer.parseInt(f);
		}catch(NumberFormatException e){
			System.out.println("PISALO JE DA UNESES BROJ PA OPERATOR PA BROJ A NE SLOVA!!!!!");
			System.exit(0);
		}
		
		int rez = 0;
		switch(c){
		case '+' :
					rez = num1+num2;
					break;
		case '-' :
			rez=num1-num2;
			break;
		}
		String novi = String.valueOf(rez);
		System.out.println(rez);
				}

	}


