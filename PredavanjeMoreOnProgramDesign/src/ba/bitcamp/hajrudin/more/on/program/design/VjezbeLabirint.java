package ba.bitcamp.hajrudin.more.on.program.design;

import java.util.Arrays;
import java.util.Scanner;

public class VjezbeLabirint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int loki = 0;
		int lokj = 0;
		TextIO.readFile("src/ba/bitcamp/hajrudin/more/on/program/design/map.txt");
		int counter = 0;
		String s = TextIO.getln();
		while(!TextIO.eof()){
			TextIO.getln();
		counter++;
		}
		int a = s.length();
		TextIO.readStandardInput();
		TextIO.readFile("src/ba/bitcamp/hajrudin/more/on/program/design/map.txt");
		char [][] matr = new char [11][12];
		String s1 = TextIO.getln();
		while(!TextIO.eof()){
		for(int i = 0; i < 11; i++){
				for(int j = 0; j< 12; j++){
					matr[i][j]=s1.charAt(j);
					if(matr[i][j]=='S'){
						loki=i;
						lokj=j;
					}
				}
				s1 = TextIO.getln();
			}
		
		}
		while(true){
		System.out.println("Za pomjeranje koristite w-gore, s-dole, d-desno, a-lijevo.");
		ispis(matr);
		String c = input.nextLine();
		switch(c){
		case "w":
			if(matr[loki-1][lokj]==' '){
				matr[loki-1][lokj]='S';
				matr[loki][lokj]=' ';
				loki-=1;
				ispis(matr);
			}
			else{
				ispis(matr);
			}
			break;
		case "s":
			if(matr[loki+1][lokj]==' '){
				matr[loki+1][lokj]='S';
				matr[loki][lokj]=' ';
				loki+=1;
				ispis(matr);
			}
			else{
				ispis(matr);
			}
			break;
		case "d":
			if(matr[loki][lokj+1]==' '){
				matr[loki][lokj+1]='S';
				matr[loki][lokj]=' ';
				lokj+=1;
				ispis(matr);
			}
			else{
				ispis(matr);
			}
			break;
		case "a":
			if(matr[loki][lokj-1]==' '){
				matr[loki][lokj-1]='S';
				matr[loki][lokj]=' ';
				lokj-=1;
				ispis(matr);
			}
			else{
				ispis(matr);
			}
			break;
		}
		if(matr[7][11]=='S'){
			System.out.println("Prosao!!!!!");
			break;
		}
	}
	}
	public static void ispis(char matr [][]){
		for(int i = 0; i < 11; i++){
			for(int j = 0; j< 12; j++){
				System.out.print(matr[i][j]);
			}
			System.out.println();
		}
	}
}
