import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public String nameValidation(String name) throws UserRegistrationException {
        if(Pattern.matches("[A-Z]{1}[a-z]{2,}",name)) {
            return "VALID";
        }
        throw new UserRegistrationException("Please Enter Proper Name");
        }

    public boolean emailValidation(String email) throws UserRegistrationException{
        if(Pattern.matches("^[0-9a-zA-Z]+([.\\\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$",email)) {
            return true;
        }
        throw new UserRegistrationException("Please Enter Proper email");
        }
    public String mobileNumberValidation(String mobile_Number) throws UserRegistrationException {

        if(Pattern.matches("^91[ ]\\d{10}$",mobile_Number)) {
            return "VALID";
        }
        throw new UserRegistrationException("Please Enter mobile number");
    }
    public String passwordValidation(String password) throws UserRegistrationException{

        if(Pattern.matches("^(?=.[a-z])(?=.[A-Z])(?=.\\\\\\\\d)(?=.[@$!%#?&])[A-Za-z\\\\\\\\d@#$!%?&]{8,}$",password)) {
            return "VALID";
        }
        throw new UserRegistrationException("Please Enter Proper password");
    }

}
