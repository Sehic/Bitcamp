package ba.bitcamp.hajrudin.arrays;

import java.util.Arrays;

public class VjezbeTask1 {

	public static void main(String[] args) {
		int [] array = new int [10];
		for(int i = 0; i<array.length;i++){
			array[i]=(int) (Math.random()*9+1);
		}
		
		for(int i = 0; i< array.length;i++){
			System.out.println(array[i]);
		}

	}

}
