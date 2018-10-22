import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class MufasaTest {
	Mufasa mufasa;
	Bank bank;
	UserBasicData validBasicData;
	UserBankingDetails validBankingDetails;
	UserBasicData invalidBasicData;
	UserBankingDetails invalidBankingDetails;
	Person person;
	
	
	@Before
	public void setup() throws Exception {
		mufasa = new Mufasa();
		validBasicData = new UserBasicData("Some", "Guy", "some_guy2", "hunter22", "hunter22", "United States", "10/10/1994", 0400400400, "someguy@aol.com", "someguy@aol.com");
		validBankingDetails = new UserBankingDetails("Somestreet2", "Somewhere", "22-22", "United States", "hunter222", "hunter222", "Some Guy", CardType.Mastercard, "0000000000", "10/2020");
		invalidBasicData = new UserBasicData("Some", "Guy", "some__guy2", "hunter2", "hunter22", "United States", "10/10/1994", 0, "someguy@aol.com", "");
		invalidBankingDetails = new UserBankingDetails("Somestreet 2", "Somewhere", "22-22", "United States", "hunter2", "hunter22", "Some Guy", CardType.Mastercard, "", "10/2020");
	}
	
	@Test
	public void validateBasicDataSuccess() {
		// Arrange
		boolean result;
								
		// Act
		result = mufasa.validateBasicData(validBasicData);
								
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void validateBasicDataFailure() {
		// Arrange
		boolean result;
								
		// Act
		result = mufasa.validateBasicData(invalidBasicData);
								
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validateBankingDetailsSuccess() {
		// Arrange
		boolean result;
								
		// Act
		result = mufasa.validateBankingDetails(validBasicData, validBankingDetails);
								
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void validateBankingDetailsFailure() {
		// Arrange
		boolean result;
								
		// Act
		result = mufasa.validateBankingDetails(validBasicData, invalidBankingDetails);
								
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void createAccountAndAttachBankDetailsSuccesful() throws Exception {
		// Arrange
		String result;
		person = mufasa.createAccount(validBasicData);
		person = mufasa.attachBankAccount(person, validBankingDetails);
										
		// Act
		result = person.bankingDetails.country;
										
		// Assert
		assertEquals("United States", result);
	}
	
	@Test (expected = MufasaException.class)
	public void createAccountAndAttachBankDetailsInvalidDetails() throws MufasaException {
		person = mufasa.createAccount(validBasicData);
		person = mufasa.attachBankAccount(person, invalidBankingDetails);
	}
	
	@Test (expected = MufasaException.class)
	public void attachBankDetailsNullPerson() throws MufasaException {
		person = mufasa.attachBankAccount(person, validBankingDetails);
	}
	
	@Test
	public void testBankAccountAttachmentSuccess() {
		// Arrange
		person = new Person(validBasicData, validBankingDetails);
		
		// Mock create
		bank = EasyMock.createMock(Bank.class);
										
		// Mock set expectations
		EasyMock.expect(bank.deductFromAccount(validBankingDetails)).andReturn(true);
		
		// Mock ready
		EasyMock.replay(bank);
										
		// Assert
		assertEquals(true, mufasa.testBankAccountAttachment(bank, person));
	}
	
	@Test
	public void testBankAccountAttachmentFailure() {
		// Arrange
		person = new Person(validBasicData, validBankingDetails);
		
		// Mock create
		bank = EasyMock.createMock(Bank.class);
										
		// Mock set expectations
		EasyMock.expect(bank.deductFromAccount(validBankingDetails)).andReturn(false);
		
		// Mock ready
		EasyMock.replay(bank);
										
		// Assert
		assertEquals(false, mufasa.testBankAccountAttachment(bank, person));
	}
	
	@Test
	public void refundSuccess() {
		// Arrange
		person = new Person(validBasicData, validBankingDetails);
		
		// Mock create
		bank = EasyMock.createMock(Bank.class);
										
		// Mock set expectations
		EasyMock.expect(bank.refundToAccount(validBankingDetails)).andReturn(true);
		
		// Mock ready
		EasyMock.replay(bank);
										
		// Assert
		assertEquals(true, mufasa.refund(bank, person));
	}
	
	@Test
	public void refundFailure() {
		// Arrange
		person = new Person(validBasicData, validBankingDetails);
		
		// Mock create
		bank = EasyMock.createMock(Bank.class);
										
		// Mock set expectations
		EasyMock.expect(bank.refundToAccount(validBankingDetails)).andReturn(false);
		
		// Mock ready
		EasyMock.replay(bank);
										
		// Assert
		assertEquals(false, mufasa.refund(bank, person));
	}

}
