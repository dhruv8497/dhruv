package library;

/**
 * @author pateld2
 * The class Author creates a author with attributes of their first name, last name, age and the number of awards they have
 * 
 */
public class Author {

	private String firstName;  //the first name of the author
	private String lastName;   //the last name of the author
	private int age;           //the age of the author  
	private int numAwards;     //the number of awards the author has
	
	// Constructor
	
	/**
	 * Creates a author 
	 * 
	 * @param firstName String The first name of the author
	 * @param lastName String The last name of the author
	 * @param age int The age of the author
	 * @param numAwards int The number of awards that auhtor has
	 */
	public Author(String firstName, String lastName, int age, int numAwards) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.numAwards = numAwards;
	}

	// Getters and setters
	/**
	 * gets the first name of the author
	 * @return String the author's first name
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * sets the author's first name
	 * @param firstName String the first name of the author
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * gets the author's last name
	 * @return String the author's last name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * sets the author's last name
	 * @param lastName String the last name of the author
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * retrieves the author's age
	 * @return int gets the age of the author
	 */
	public int getAge() {
		return age;
	}
	/**
	 * sets the age of the author
	 * @param age int The age of the author
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * retrieves the number of awards the author has
	 * @return int gets the number of awards the author has
	 */
	public int getNumAwards() {
		return numAwards;
	}
	/**
	 * sets the number of awards the author has
	 * @param numAwards int The number of awards the author has
	 */
	public void setNumAwards(int numAwards) {
		this.numAwards = numAwards;
	}
	/**
	 * formats the author's whole name
	 * @return String the author's formatted whole name
	 */
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
	
}