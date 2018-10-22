
public interface Bank {
	//external dependency
	
	//returns true if successful in deduction
	public boolean deductFromAccount(UserBankingDetails bankingDetails);
	
	//returns true if successful in refund
	public boolean refundToAccount(UserBankingDetails bankingDetails);
}
