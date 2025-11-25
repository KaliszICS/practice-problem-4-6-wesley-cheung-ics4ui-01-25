/**
	* Definition of the Person class
	* @author Wesley Cheung
	* @version 17.0.1
	*/
class Person {

    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings = new Person[0];

	/**
	 * This class can be configured with 8 variables, firstname, lastname, birthDay, birthMonth, birthYear, ssn, numberofsiblings, and siblings
	 * @param firstname String that is the first name of the person
	 * @param lastname String that is the last name of the person
     * @param birthDay integer that is the birth day of the person
	 * @param birthMonth integer that is the birth month of the person
	 * @param birthYear integer that is the birth year of the person
	 * @param ssn String that is the SSN of the person
	 * @param numberofsiblings integer that is the number of siblings of the person
	 * @param siblings Array of persons that are siblings of the person
	 */
    /** 
    * Class constructor specifying firstname, lastname, birthDay, birthMonth, birthYear, and ssn
    */
	public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.ssn = ssn;
	}

	/**
	 * @return the value of firstname
	 *
	 */

	public String getFirstname() {
		return this.firstname;
	}

	/**
	 * @return the value of lastname
	 *
	 */

	public String getLastname() {
		return this.lastname;
	}

	/**
	 * setFirstname sets the firstname of the person
	 *
	 */

	public void setFirstname(String newFirstname) {
		this.firstname = newFirstname;
	}

	/**
	 * setLastname sets the lastname of the person
	 *
	 */

	public void setLastname(String newLastname) {
		this.lastname = newLastname;
	}

	/**
	 * @return the Birthday of the person in the form (day/month/year)
	 *
	 */

	public String getBirthday() {
		return birthDay+"/"+birthMonth+"/"+birthYear;
	}

	/**
	 * Method adds a sibling to the person array
	 *
	 */
	public void addSibling(Person person) {
		Person[] newSiblings = new Person[numberOfSiblings+1];
		for (int i = 0;i<numberOfSiblings;i++) {
			newSiblings[i] = siblings[i];
		}
		newSiblings[numberOfSiblings] = person;
		this.siblings = newSiblings;
		this.numberOfSiblings = this.numberOfSiblings+1;
	}

	/**
	 * @return the array of siblings
	 *
	 */
	public Person[] getSiblings() {
		return this.siblings;
	}
}