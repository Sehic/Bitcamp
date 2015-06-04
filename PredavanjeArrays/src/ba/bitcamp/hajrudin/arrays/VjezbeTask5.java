package ba.bitcamp.hajrudin.arrays;

import java.util.Arrays;

public class VjezbeTask5 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] newArr = new int [arr.length*2];
		newArr=Arrays.copyOf(arr, arr.length*2);
		System.out.println(Arrays.toString(newArr));

	}

}
