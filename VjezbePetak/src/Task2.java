public class Task2 {

	public static void main(String[] args) {
		System.out.println(getFirst("AA", "AB", "AC"));
	}

	public static String getFirst(String s1, String s2, String s3) {
		String s = "";
		int a = s1.compareToIgnoreCase(s2);
		if (a < 0) {
			s = s1;
		} else {
			s = s2;
		}
		a = s.compareToIgnoreCase(s3);
		if (a < 0) {
			return s;
		} else {
			return s3;
		}
	}

}
