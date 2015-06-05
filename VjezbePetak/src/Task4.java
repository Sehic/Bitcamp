import java.io.FileNotFoundException;


public class Task4 {

	public static void main(String[] args) {
		writeToFile("text.txt", "BitCamp <3");

	}
	public static void writeToFile(String filename, String msg){
		try{
		TextIO.writeFile(filename);
		TextIO.put(msg);
		}catch(IllegalArgumentException ex){
			System.out.println("File not found");
		}
		
	}

}
