package ba.bitcamp.hajrudin.klasa.kao.struktura;

import java.util.Arrays;

public class VjezbeTask3 {

	public static void main(String[] args) {
		String [] names = getNames();
		String [] courses = getCourses();
		String [] grades = getGrades();
		for(int i = 0; i<names.length; i++){
			String s = grades[i];
			System.out.println(s);
			String [] arr = s.split(" ");
			int [] grades1 = new int [arr.length];
			for(int temp = 0; temp<grades1.length;temp++){
			grades1[temp]=Integer.parseInt(arr[i]); 	
			}
			
			int index = names[i].indexOf(" ");
			String filename = names[i].substring(0, index);
			filename.toUpperCase();
			TextIO.writeFile(filename);
			TextIO.putln("Ime: "+names[i]);
			for(int j=0;j<courses.length;j++){
				TextIO.put("(");
				TextIO.put(grades1[j]);
				TextIO.put(")");
				TextIO.put(" ");
				TextIO.put(courses[j]);
				TextIO.putln();
			}
			TextIO.putln("Prosjek: "+prosjek(grades, i));
		}
	}
	
	public static double prosjek(String [] grades, int index){
		double prosjek = 0;
		int sum=0;
		String []  s = grades[index].split(" ");
		for(int i = 0; i<s.length; i++){
			sum+=Integer.parseInt(s[i]);
		}
		prosjek=sum/s.length;
		return prosjek;
	}
	
	public static String [] getNames(){
		TextIO.readFile("src/ba/bitcamp/hajrudin/klasa/kao/struktura/names.in/");
		int counter = 0;
		while(!TextIO.eof()){
			TextIO.getln();
			counter++;
		}
		
		TextIO.readFile("src/ba/bitcamp/hajrudin/klasa/kao/struktura/names.in/");
		String [] arr = new String [counter];
		int i = 0;
		while(!TextIO.eof()){
			arr[i]=TextIO.getln();
			i++;
		}
		
		return arr;
		
	}
	
	public static String [] getCourses(){
		TextIO.readFile("src/ba/bitcamp/hajrudin/klasa/kao/struktura/courses.in/");
		int counter = 0;
		while(!TextIO.eof()){
			TextIO.getln();
			counter++;
		}
		
		TextIO.readFile("src/ba/bitcamp/hajrudin/klasa/kao/struktura/courses.in/");
		String [] arr = new String [counter];
		int i = 0;
		while(!TextIO.eof()){
			arr[i]=TextIO.getln();
			i++;
		}
		
		return arr;
		
	}
	
	public static String [] getGrades(){
		TextIO.readFile("src/ba/bitcamp/hajrudin/klasa/kao/struktura/grades.in/");
		int counter = 0;
		while(!TextIO.eof()){
			TextIO.getln();
			counter++;
			
		}
		TextIO.readFile("src/ba/bitcamp/hajrudin/klasa/kao/struktura/grades.in/");
		int i = 0;
		String [] newArr = new String [counter];
		while(!TextIO.eof()){
			String s = TextIO.getln();
			String [] arr=s.split(" ");
			System.out.println(Arrays.toString(arr));//U ovom whie/u ima greska
			for(int j = 0; j<arr.length;j++){        //cita fajl samo do 11 linije
			newArr[i] +=arr[j];  
					}
			i++;
			System.out.println(arr[i]);
		}
		
		return newArr;
		
	}

}
