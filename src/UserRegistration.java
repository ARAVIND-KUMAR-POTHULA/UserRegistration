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

        if(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$",password)) {
            return "VALID";
        } else {
            return "INVALID";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validation;
        System.out.println("ENTER CHOICE \n1:FIRST NAME VALIDATION\n2:LAST NAME VALIDATION\n3:EMAIL VALIDATION\n4:MOBILE NUMBER VALIDATION\n5:PASSWORD VALIDATION ");
        int choice = scanner.nextInt();
        UserRegistration userRegistration = new UserRegistration();
        switch(choice) {
            case 1:
                System.out.println("ENTER FIRST NAME");
                String first_Name = scanner.next();
                validation = userRegistration.nameValidation(first_Name);
                System.out.println(validation + " FIRST NAME");
                break;
            case 2:
                System.out.println("ENTER LAST NAME");
                String last_Name = scanner.next();
                validation = userRegistration.nameValidation(last_Name);
                System.out.println(validation + " LAST NAME");
                break;
            case 3:
                System.out.println("ENTER EMAIL ID");
                String email_Id = scanner.next();
                validation = userRegistration.emailValidation(email_Id);
                System.out.println(validation + " EMAIL ID");
                break;
            case 4:
                System.out.println("ENTER MOBILE NUMBER");
                String mobile_Number = scanner.next();
                validation = userRegistration.mobileNumberValidation(mobile_Number);
                System.out.println(validation + " MOBILE NUMBER");
                break;
            case 5:
                System.out.println("ENTER PASSWORD WITH MINIMUM 8 CHARARCTERS");
                String password = scanner.next();
                validation = userRegistration.passwordValidation(password);
                System.out.println(validation + " PASSWORD");
                break;
        }
        }

}
