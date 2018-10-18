public class UserBankingDetails {
	public enum CardType {
		Mastercard, VISA, Discover
	}
	
	String streetAddress;
	String city;
	String postalCode;
	String country;
	String bankingPassword;
	String cardHolderName;
	CardType cardType;
	String cardNumber;
	String expiryDate;
	
	public UserBankingDetails(String streetAddress, String city, String postalCode, String country,
			String bankingPassword, String cardHolderName, CardType cardType, String cardNumber, String expiryDate) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
		this.bankingPassword = bankingPassword;
		this.cardHolderName = cardHolderName;
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCountry() {
		return country;
	}

	public String getBankingPassword() {
		return bankingPassword;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public CardType getCardType() {
		return cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setBankingPassword(String bankingPassword) {
		this.bankingPassword = bankingPassword;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
