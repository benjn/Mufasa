public class UserBasicData {
	String firstName;
	String lastName;
	String username;
	String basicPassword;
	String country;
	String birthdate;
	int phoneNumber;
	String email;
	
	public UserBasicData(String firstName, String lastName, String username, String basicPassword,
			String country, String birthdate, int phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.basicPassword = basicPassword;
		this.country = country;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUsername() {
		return username;
	}

	public String getBasicPassword() {
		return basicPassword;
	}

	public String getCountry() {
		return country;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setBasicPassword(String basicPassword) {
		this.basicPassword = basicPassword;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
