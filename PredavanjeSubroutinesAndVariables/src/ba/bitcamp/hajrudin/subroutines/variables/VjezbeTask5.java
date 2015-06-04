package ba.bitcamp.hajrudin.subroutines.variables;

public class VjezbeTask5 {

	public static void main(String[] args) {
		System.out.println(getType("false"));
	}

	public static String getType(String s) {
		try {
			int num = Integer.parseInt(s);
			return "Integer";
		} catch (NumberFormatException ex) {
			try {
				Double num = Double.parseDouble(s);
				return "Double";
			} catch (NumberFormatException e) {
				if (s.length() < 2)
					return "Char";
			}
		}

		if ((s.compareTo("true")) == 0 || (s.compareTo("false")) == 0)
			return "Boolean";
		return "String";

	}

}
