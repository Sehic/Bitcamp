package ba.bitcamp.hajrudin.arrays;

import java.util.Scanner;

public class VjezbeTask9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite velicinu niza");
		int lenght = input.nextInt();
		int [] arr = new int [lenght];
		int counter=0;
		while(counter<lenght){
			System.out.println("Unesite jednocifren broj za index "+counter);
			int num=input.nextInt();
			if(num<10){
				arr[counter]=num;
				counter++;
			}
			else
				System.out.println("POGRESAN UNOS");
		}
		int cifra0=0, cifra1=0, cifra2=0,cifra3=0,cifra4=0,cifra5=0,cifra6=0,cifra7=0,cifra8=0,cifra9=0;
		for(int i=0;i<arr.length;i++){
			switch(arr[i]){
			case 0:
				cifra0++;
				break;
			case 1:
				cifra1++;
				break;
			case 2:
				cifra2++;
				break;
			case 3:
				cifra3++;
				break;
			case 4:
				cifra4++;
				break;
			case 5:
				cifra5++;
				break;
			case 6:
				cifra6++;
				break;
			case 7:
				cifra7++;
				break;
			case 8:
				cifra8++;
				break;
			case 9:
				cifra9++;
				break;
			}
		}
		System.out.println("Cifra 0 se pojavila "+cifra0+" puta");
		System.out.println("Cifra 1 se pojavila "+cifra1+" puta");
		System.out.println("Cifra 2 se pojavila "+cifra2+" puta");
		System.out.println("Cifra 3 se pojavila "+cifra3+" puta");
		System.out.println("Cifra 4 se pojavila "+cifra4+" puta");
		System.out.println("Cifra 5 se pojavila "+cifra5+" puta");
		System.out.println("Cifra 6 se pojavila "+cifra6+" puta");
		System.out.println("Cifra 7 se pojavila "+cifra7+" puta");
		System.out.println("Cifra 8 se pojavila "+cifra8+" puta");
		System.out.println("Cifra 9 se pojavila "+cifra9+" puta");

}
}