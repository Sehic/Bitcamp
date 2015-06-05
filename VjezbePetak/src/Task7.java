import java.util.Arrays;


public class Task7 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray2(-2, 1)));

	}
	
	// try catch
	public static int[] getArray2(int n, int k){
		int[] arr = new int[n];
		int counter = 1;
		for(int i = 0; i < n; i++){
			arr [i]=counter;
			counter++;
			if(counter>k) {
				counter=1;
			}
		}
		return arr;
	}

}
