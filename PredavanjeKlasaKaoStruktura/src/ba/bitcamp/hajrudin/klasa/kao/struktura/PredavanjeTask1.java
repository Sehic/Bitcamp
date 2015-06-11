package ba.bitcamp.hajrudin.klasa.kao.struktura;

public class PredavanjeTask1 {

	public static void main(String[] args) {
		Person p1 = new Person("Hajrudin", "Sehic", 1992, "Sabu", "12345",
				"hajrudin@bit.ba", 180, true, "Hagras", "Sirutka");
		Person p2 = new Person("Mujo", "Mujic", 1987, "ASd", "1234567",
				"mujo@bit.ba", 188, false, "Nest", "Voda");
		getYoungerPerson(p1, p2);
		
		Person[] persons = {p1, p2};
		

	}
	
	public static void getYoungerPerson(Person p1, Person p2){
		if (p1.getDayOfBirth() < p2.getDayOfBirth()) {
			System.out.println(p2.toString());
		} else {
			System.out.println(p1.toString());
		}
	}
	
	

}
