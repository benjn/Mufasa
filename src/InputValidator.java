import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class InputValidator {
	//F1-1, F3-1
	boolean validateStandardEngLetters(String toValidate) {
		if(!toValidate.matches("^[A-Za-z]+$")) {
			return false;
		}else {
			return true;
		}
	}
	
	//F1-2
	boolean validateUsername(String toValidate) {
		if(!toValidate.matches("^(?!.*(_).*\\1)[A-Za-z0-9_]+$")) {
			return false;
		}else {
			if(toValidate.length() > 15) {
				return false;
			}else {
				return true;
			}
		}
	}
	
	//F1-3, F3-2
	boolean validatePassword(String toValidate) {
		if(toValidate.length() < 8) {
			return false;
		}else {
			return true;
		}
	}
	
	//F1-3 (F3-2, but inverse)
	boolean validateMatches(String firstString, String secondString) {
		if(firstString.equals(secondString)) {
			return true;
		}else {
			return false;
		}
	}
	
	//F1-6
	boolean validateBirthdate(String toValidate) {
		//regex from https://stackoverflow.com/a/15504877
		//(edited to only accept forward slashes as separators)
		if(!toValidate.matches("^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
			return false;
		}else {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateToValidate = LocalDate.parse(toValidate, formatter);
			LocalDate currentDate = LocalDate.now();
			if(currentDate != null) {
				int age;
				age = Period.between(dateToValidate, currentDate).getYears();
				if(age < 18) {
					return false;
				}else {
					return true;
				}
			}else {
				return false;
			}
		}
	}
	
	//F3-1
	boolean validateEngAlphanumeric(String toValidate) {
		if(!toValidate.matches("^[A-Za-z0-9_]+$")) {
			return false;
		}else {
			return true;
		}
	}
	
	//F3-1
	boolean validateDigitsSingleDash(String toValidate) {
		if(!toValidate.matches("^(?!.*(-).*\\1)[0-9-]+$")) {
			return false;
		}else {
			return true;
		}
	}
}
