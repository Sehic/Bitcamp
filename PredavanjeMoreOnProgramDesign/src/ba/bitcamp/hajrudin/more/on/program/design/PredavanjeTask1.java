package ba.bitcamp.hajrudin.more.on.program.design;

import java.util.Arrays;
import java.util.Scanner;

public class PredavanjeTask1 {

	public static void main(String[] args) {
		
		TextIO.readFile("src/ba/bitcamp/hajrudin/more/on/program/design/Valute.txt");
		String s = TextIO.getln();
		args = s.split(" ");
		while(true){
		try{
		System.out.println(convert(args));
		break;
		}catch (Exception ex){
			ex.getMessage();
			System.out.println("Pogresan unos. Pokusajte ponovo");
		}
		}
		
	}
	public static double convert(String [] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int inp = 0;
		int out = 0;
		double value = 0; 
		double newValue= 0;
		System.out.println("Izaberite valutu iz koje zelite pretvarati");
		System.out.println(Arrays.toString(args));
		inp = input.nextInt();
		if(inp>args.length-1 || inp<0){
			throw new Exception();
		}
		System.out.println("Unesite vrijednost");
		value = input.nextDouble();
		System.out.println("Izaberite valutu u koju zelite pretvarati");
		System.out.println(Arrays.toString(args));
		out = input.nextInt();
		if(out>args.length-1 || out<0){
			throw new Exception();
		}
		if(inp == out){
			System.out.println("Nema potrebe za pretvaranjem.");
		}
		else if(inp == 0){
			newValue = fromDollar(out, value);
			return newValue;
		}
		else if(out == 0){
			newValue=toDollar(inp, value);
			return newValue;
		}else{
			double a = toDollar(inp, value);
			newValue = fromDollar(out, a);
			return newValue;
		}
		return newValue;
	}
	
public static double fromDollar(int i, double value){
	TextIO.readFile("src/ba/bitcamp/hajrudin/more/on/program/design/fromDolar.txt");
    	String s1 = TextIO.getln();
    	String [] dollar = s1.split(" ");
    	double a = Double.parseDouble(dollar[i]);
    	return a * value;
    }
public static double toDollar (int index, double vrijednost){
	TextIO.readFile("src/ba/bitcamp/hajrudin/more/on/program/design/toDolar.txt");
	String s1 = TextIO.getln();
	String [] dollar = s1.split(" ");
	double a = Double.parseDouble(dollar[index]);
	return a *vrijednost;
	
	
	}

}
