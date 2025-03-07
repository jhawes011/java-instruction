package model;

public class Actor {

    	private String firstName;
	private String lastName;
	private String gender;
	private String birthDate;
	
	
	public Actor(String firstName, String lastName, String gender, String birthDate) 
	{
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.gender = gender;
	        this.birthDate = birthDate;
	}
	 @Override
	    public String toString()
	 {
	        return "First name: " + firstName + ", Last name: " + lastName + ", Gender: " + gender + ", Birthdate: " + birthDate;
	 }
}
