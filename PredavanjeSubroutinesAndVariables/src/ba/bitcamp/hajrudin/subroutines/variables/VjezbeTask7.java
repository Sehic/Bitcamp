package ba.bitcamp.hajrudin.subroutines.variables;

import static ba.bitcamp.hajrudin.subroutines.variables.VjezbeTask1.getMax;
import static ba.bitcamp.hajrudin.subroutines.variables.VjezbeTask2.getExtension;
import static ba.bitcamp.hajrudin.subroutines.variables.VjezbeTask3.canBeBinary;
import static ba.bitcamp.hajrudin.subroutines.variables.VjezbeTask4.getRandomNumber;
import static ba.bitcamp.hajrudin.subroutines.variables.VjezbeTask5.getType;
import static ba.bitcamp.hajrudin.subroutines.variables.VjezbeTask6.fixSentece;

import java.util.Scanner;


public class VjezbeTask7 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Unesite recenicu:");
	String recenica = input.nextLine();
	System.out.println("Unesite ime file-a:");
	String file = input.nextLine();
	System.out.println("Unesite proizboljan string:");
	String s = input.nextLine();
	System.out.println("Unesite broj:");
	int B = input.nextInt();
	
	System.out.println(fixSentece(recenica));
	
	if((getExtension(file))==null)
		file+=".txt";
	
	if(getType(s)=="Boolean"){
		TextIO.writeFile(file);
		if(canBeBinary(B)==true)
			TextIO.putln(B);
		else
			TextIO.putln(getRandomNumber(B/2, B));
	}
	
	if(getType(s)=="Int"){
		TextIO.writeFile(file);
		if(canBeBinary(B)==true)
			TextIO.putln(B);
		else{
			int a = Integer.parseInt(s);
			TextIO.putln(getMax(B, a));
		}
			
	}
	if(getType(s)=="String"){
		TextIO.writeFile(file);
		int P = (getRandomNumber(1, B));
		for(int i =0;i<P;i++){
			TextIO.putln(s);
		}
	
	}
	
	TextIO.writeFile(s+=".txt");
	TextIO.put(recenica);
	
	
	}

}
