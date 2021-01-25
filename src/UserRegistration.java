import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public String nameValidation(String name) {
        if(Pattern.matches("[A-Z]{1}[a-z]{2,}",name)) {
            return "VALID";
        } else {
            return "INVALID";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validation;

        UserRegistration userRegistration = new UserRegistration();
        System.out.println("ENTER FIRST NAME");
        String first_Name = scanner.next();

        validation = userRegistration.nameValidation(first_Name);
            System.out.println(validation + " FIRST NAME");
        
        System.out.println("ENTER LAST NAME");
        String last_Name = scanner.next();

        validation = userRegistration.nameValidation(last_Name);
        System.out.println(validation + " LAST NAME");
        }

}
