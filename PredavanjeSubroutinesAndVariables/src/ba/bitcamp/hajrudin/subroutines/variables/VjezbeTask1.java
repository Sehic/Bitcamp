package ba.bitcamp.hajrudin.subroutines.variables;

public class VjezbeTask1 {

	public static void main(String[] args) {
		System.out.println(getMax(2,2));

	}
	
	public static int getMax(int num1, int num2){
		if(num1>=num2)
			return num1;
		else 
			return num2;
	}

}
