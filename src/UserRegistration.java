import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public String nameValidation(String name) {
        if(Pattern.matches("[A-Z]{1}[a-z]{2,}",name)) {
            return "VALID";
        } else {
            return "INVALID";
        }
    }

    public String emailValidation(String email) {
        if(Pattern.matches("^[a-zA-Z0-9_-]+[.]*[a-zA-Z0-9]*@[a-zA-Z0-9-]+\\.[a-zA-Z0-9_-]+[.]*[a-zA-Z0-9_-]*$",email)) {
            return "VALID";
        } else {
            return "INVALID";
        }
    }
    public String mobileNumberValidation(String mobile_Number) {

        if(Pattern.matches("^91[ ]\\d{10}$",mobile_Number)) {
            return "VALID";
        } else {
            return "INVALID";
        }
    }
    public String passwordValidation(String password) {

        if(Pattern.matches("^(?=.[a-z])(?=.[A-Z])(?=.\\\\\\\\d)(?=.[@$!%#?&])[A-Za-z\\\\\\\\d@#$!%?&]{8,}$",password)) {
            return "VALID";
        } else {
            return "INVALID";
        }
    }

}
