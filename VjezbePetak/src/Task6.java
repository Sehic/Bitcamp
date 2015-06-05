import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		try {
			arr = getArray(5, 5);
			System.out.println(Arrays.toString(arr));
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("IndexOutOfBounds");
		}

	}

	// Try catch
	public static int[] getArray(int n, int m) {
		int[] arr1 = new int[10];
		if (n > 9) {
			throw new IndexOutOfBoundsException();
		} else {
			for (int i = n; i < 10; i++) {
				arr1[i] = m;
			}
		}
		return arr1;
	}
}
