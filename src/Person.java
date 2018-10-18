public class Person {
	
	UserBasicData basicData;
	UserBankingDetails bankingDetails;
	
	public Person(UserBasicData basicData, UserBankingDetails bankingDetails) {
		this.basicData = basicData;
		this.bankingDetails = bankingDetails;
	}

	public UserBasicData getBasicData() {
		return basicData;
	}

	public UserBankingDetails getBankingDetails() {
		return bankingDetails;
	}

	public void setBasicData(UserBasicData basicData) {
		this.basicData = basicData;
	}

	public void setBankingDetails(UserBankingDetails bankingDetails) {
		this.bankingDetails = bankingDetails;
	}
}
