package ba.bitcamp.hajrudin.subroutines.variables;

public class VjezbeTask4 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(getRandomNumber(-2, -1));
		}

	}
	
	public static int getRandomNumber(int min, int max){
		if(min>=max)
			return -1;
		else{
			return  ((int)(Math.random()*(max-min+1))+(min));		
		}
			
	}

}
