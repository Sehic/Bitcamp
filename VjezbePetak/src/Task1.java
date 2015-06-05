
public class Task1 {

	public static void main(String[] args) {
		System.out.println(merge("", "hfg"));

	}
	public static String merge(String s1, String s2){
		int a = s2.length()/2;
		String s3 = s2.substring(0,a);
		s3+=s1;
		s3+=s2.substring(a);
		return s3;
	}

}
