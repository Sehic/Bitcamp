package ba.bitcamp.hajrudin.subroutines.variables;

public class VjezbeTask6 {

	public static void main(String[] args) {
		System.out.println(fixSentece("Hello"));

	}
	
	public static String fixSentece (String s){
		String newS = "";
		for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if(i==0 && c>96){
				c-=32;
			}
			
			newS+=c;
				newS.toUpperCase();
			
		}
		
	
		if(newS.indexOf('.')==-1){
			newS+=".";
		}
		
		return newS;
	}

}
