package ba.bitcamp.hajrudin.arrays;

import java.util.Arrays;

public class VjezbeTask7 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int [] arr2 = {6,7,8,9,10};
		int counter=5;
		int [] arr3 = new int [arr.length+arr2.length];
		for(int i = 0; i <arr.length;i++){
			arr3[i]=arr[i];
			arr3[counter]=arr2[i];
			counter++;
		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
