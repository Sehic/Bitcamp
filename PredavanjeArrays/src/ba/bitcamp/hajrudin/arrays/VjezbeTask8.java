package ba.bitcamp.hajrudin.arrays;

import java.util.Arrays;

public class VjezbeTask8 {

	public static void main(String[] args) {
		int[] arr = { 9, 5, 2, 2 };
		int[] arr2 = { 4, 8, 7 };
		int sum = 0;
		int lenght1 = arr.length;
		int lenght2 = arr2.length;
		int[] sumArrs;
		if (lenght1 > lenght2)
			sumArrs = new int[lenght1 + 1];
		else
			sumArrs = new int[lenght2 + 1];
		int counter = sumArrs.length - 1;
		int counter1 = arr.length - 1;
		int counter2 = arr2.length - 1;
		for (int i = 0; i < sumArrs.length; i++) {
			if (counter == 0) {
				if (sum != 0)
					sumArrs[counter] = sum;
				break;
			}
			if (counter1 < 0)
				sum += arr2[counter2];
			else if (counter2 < 0)
				sum += arr[counter1];
			else
				sum += arr[counter1] + arr2[counter2];
			if (sum > 9) {
				sumArrs[counter] = sum % 10;
				sum /= 10;
			} else {
				sumArrs[counter] = sum;
				sum = 0;
			}
			counter--;
			counter1--;
			counter2--;
		}

		System.out.println(Arrays.toString(sumArrs));
	}

}
