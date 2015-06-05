import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		TextIO.writeFile("newFile.txt");
		TextIO.putln(1);
		TextIO.putln(1);
		TextIO.putln(1);
		TextIO.putln(0);
		TextIO.putln(0);
		TextIO.putln(0);
		System.out.println(Arrays.toString(getArray3("newFile.txt")));

	}

	// try catch
	public static int[] getArray3(String filename) {
		try {
			TextIO.readFile(filename);
		} catch (Exception ex) {
			System.out.println("Fajl ne postoji");
		}
		String s = "";
		while (!TextIO.eof()) {
			s += TextIO.getln();
		}
		int[] arr = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			int a = Integer.parseInt(s.charAt(i) + "");
			arr[i] = a;
		}
		return arr;
	}

}
