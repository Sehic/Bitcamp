
public class Task3 {

	public static void main(String[] args) {
		System.out.println(getTheRest("Hajrudin", "d"));

	}
	
	// Try catch
	public static String getTheRest(String s1, String s2){
		int a=0;
		String s3 = "";
		try{
		 a = s1.indexOf(s2);
		 s3 = s1.substring(a);
		}catch(StringIndexOutOfBoundsException ex){
			System.out.println("String "+s2+" ne postoji u stringu "+s1);
		}
		return s3;
	}

}
