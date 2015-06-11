package ba.bitcamp.hajrudin.klasa.kao.struktura;

public class Person {
	private String name;
	private String lastName;
	private Integer yearOfBirth;
	private String adress;
	private String personalID;
	private String email;
	private Integer height;
	private boolean isValid;
	private String favFood;
	private String favDrink;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getDayOfBirth() {
		return yearOfBirth;
	}
	public void setDayOfBirth(Integer dayOfBirth) {
		this.yearOfBirth = dayOfBirth;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPersonalID() {
		return personalID;
	}
	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public String getFavDrink() {
		return favDrink;
	}
	public void setFavDrink(String favDrink) {
		this.favDrink = favDrink;
	}
	public Person(String name, String lastName, Integer dayOfBirth,
			String adress, String personalID, String email, Integer height,
			boolean isValid, String favFood, String favDrink) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.yearOfBirth = dayOfBirth;
		this.adress = adress;
		this.personalID = personalID;
		this.email = email;
		this.height = height;
		this.isValid = isValid;
		this.favFood = favFood;
		this.favDrink = favDrink;
	}
	@Override
	public String toString() {
		return "Person \n Name=" + name + "\n Last Name=" + lastName
				+ "\n Year of Birth=" + yearOfBirth + "\n Adress=" + adress
				+ "\n Personal ID=" + personalID + "\n Email=" + email
				+ "\n Height=" + height + "\n Is Valid=" + isValid + "\n Favorite Food="
				+ favFood + "\n Favorite Drink=" + favDrink;
	}
	
	
	
	
	
	
}
