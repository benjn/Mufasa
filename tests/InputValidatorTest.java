import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InputValidatorTest {
	InputValidator validator;
	
	
	@Before
	public void setUp() throws Exception {
		validator = new InputValidator();
	}

	@Test
	public void standardEngLettersValid() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateStandardEngLetters("Some");
										
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void standardEngLettersInvalidSpace() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateStandardEngLetters("Some Guy");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void standardEngLettersInvalidNumber() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateStandardEngLetters("Some1");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validateUsernameValid() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateUsername("some_guy2");
										
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void validateUsernameInvalidDoubleUnderscore() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateUsername("some_guy_2");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validateUsernameInvalidTooLong() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateUsername("someguysomeguysomeguysomeguysomeguy");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validatePasswordValid() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validatePassword("hunter22");
										
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void validatePasswordInvalidTooShort() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validatePassword("hunter2");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validateMatchesValid() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateMatches("hunter22", "hunter22");
										
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void validateMatchesInvalidCase() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateMatches("huNter22", "hunter22");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validateBirthdateValid() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateBirthdate("10/10/1994");
										
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void validateBirthdateInvalidWrongFormat() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateBirthdate("1994/10/10");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validateBirthdateInvalidTooYoung() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateBirthdate("10/10/2004");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validateBirthdateInvalidImproperDate() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateBirthdate("42/20/1994");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validateEngAlphanumericValid() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateEngAlphanumeric("Somestreet2");
										
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void validateEngAlphanumericInvalidSpace() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateEngAlphanumeric("Somestreet 2");
										
		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void validateDigitsSingleDashValid() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateDigitsSingleDash("22-22");
										
		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void validateDigitsSingleDashInvalidLetter() {
		// Arrange
		boolean result;
										
		// Act
		result = validator.validateDigitsSingleDash("S22-22");
										
		// Assert
		assertEquals(false, result);
	}

}
