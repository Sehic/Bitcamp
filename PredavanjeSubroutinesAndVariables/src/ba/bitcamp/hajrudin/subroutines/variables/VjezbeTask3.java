package ba.bitcamp.hajrudin.subroutines.variables;

public class VjezbeTask3 {

	public static void main(String[] args) {
		System.out.println(canBeBinary(0));

	}
	
	public static boolean canBeBinary(int num){
		if(num<0)
			return false;
		while(num>0){
			int temp = 0;
			temp = num % 10;
			if(temp != 0 && temp != 1){
				return false;
			}
			num/=10;
			
		}
		return true;
		
			
		}
	}

