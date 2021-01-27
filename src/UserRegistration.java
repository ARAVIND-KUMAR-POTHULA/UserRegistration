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

    public boolean emailValidation(String email) {
        if(Pattern.matches("^[0-9a-zA-Z]+([.\\\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$",email)) {
            return true;
        } else {
            return false;
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
