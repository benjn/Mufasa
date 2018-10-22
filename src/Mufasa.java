
public class Mufasa {
	InputValidator validator = new InputValidator();
	
	public boolean validateBasicData(UserBasicData basicData) {
		if(!validator.validateStandardEngLetters(basicData.firstName)) {
			return false;
		}
		if(!validator.validateStandardEngLetters(basicData.lastName)) {
			return false;
		}
		if(!validator.validateUsername(basicData.username)) {
			return false;
		}
		if(!validator.validatePassword(basicData.basicPassword)) {
			return false;
		}
		if(!validator.validatePassword(basicData.basicPasswordRe)) {
			return false;
		}
		if(!validator.validateMatches(basicData.basicPassword, basicData.basicPasswordRe)) {
			return false;
		}
		if(basicData.country.equals(null)) {
			return false;
		}
		if(!validator.validateBirthdate(basicData.birthdate)) {
			return false;
		}
		if(basicData.phoneNumber == 0) {
			return false;
		}
		if(basicData.email.equals(null)) {
			return false;
		}
		if(!validator.validateMatches(basicData.email, basicData.emailRe)) {
			return false;
		}
		
		return true;
	}
	
	public boolean validateBankingDetails(UserBasicData basicData, UserBankingDetails bankingDetails) {
		if(!validator.validateEngAlphanumeric(bankingDetails.streetAddress)) {
			return false;
		}
		if(!validator.validateStandardEngLetters(bankingDetails.city)) {
			return false;
		}
		if(!validator.validateDigitsSingleDash(bankingDetails.postalCode)) {
			return false;
		}
		if(bankingDetails.country.equals(null)) {
			return false;
		}
		if(!validator.validatePassword(bankingDetails.bankingPassword)) {
			return false;
		}
		if(!validator.validatePassword(bankingDetails.bankingPasswordRe)) {
			return false;
		}
		if(!validator.validateMatches(bankingDetails.bankingPassword, bankingDetails.bankingPasswordRe)) {
			return false;
		}
		if(validator.validateMatches(basicData.basicPassword, bankingDetails.bankingPassword)) {
			return false;
		}
		if(bankingDetails.cardHolderName.equals(null)) {
			return false;
		}
		if(bankingDetails.cardType.equals(null)) {
			return false;
		}
		if(bankingDetails.cardNumber.equals(null)) {
			return false;
		}
		if(bankingDetails.expiryDate.equals(null)) {
			return false;
		}
		
		return true;
	}
	
	public Person createAccount(UserBasicData basicData) throws MufasaException{
		if(!validateBasicData(basicData)) {
			throw new MufasaException();
		}
		
		Person newAccount = new Person(basicData, null);
		return newAccount;
	}
	
	public Person attachBankAccount(Person person, UserBankingDetails bankingDetails) throws MufasaException {
		if(person == null) {
			throw new MufasaException();
		}
		if(!validateBasicData(person.basicData)) {
			throw new MufasaException();
		}
		if(!validateBankingDetails(person.basicData, bankingDetails)) {
			throw new MufasaException();
		}
		
		person.bankingDetails = bankingDetails;
		return person;
	}
	
	public boolean testBankAccountAttachment(Bank bank, Person person) {
		if(!bank.deductFromAccount(person.bankingDetails)) {
			//display Failed
			return false;
		}
		
		//display Pass
		return true;
	}
	
	public boolean refund(Bank bank, Person person) {
		if(!bank.refundToAccount(person.bankingDetails)) {
			//display Refund Failed
			return false;
		}
		
		//display Refund Success
		return true;
	}
}
