public class UserBasicData {
	String firstName;
	String lastName;
	String username;
	String basicPassword;
	String basicPasswordRe;
	String country;
	String birthdate;
	int phoneNumber;
	String email;
	String emailRe;
	
	public UserBasicData(String firstName, String lastName, String username, String basicPassword,
			String basicPasswordRe, String country, String birthdate, int phoneNumber, String email, String emailRe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.basicPassword = basicPassword;
		this.basicPasswordRe = basicPasswordRe;
		this.country = country;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.emailRe = emailRe;
	}
}
