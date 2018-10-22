public class UserBankingDetails {
	String streetAddress;
	String city;
	String postalCode;
	String country;
	String bankingPassword;
	String bankingPasswordRe;
	String cardHolderName;
	CardType cardType;
	String cardNumber;
	String expiryDate;
	
	public UserBankingDetails(String streetAddress, String city, String postalCode, String country,
			String bankingPassword, String bankingPasswordRe, String cardHolderName, CardType cardType, String cardNumber, String expiryDate) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
		this.bankingPassword = bankingPassword;
		this.bankingPasswordRe = bankingPasswordRe;
		this.cardHolderName = cardHolderName;
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
}
