import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER FIRST NAME");
        String first_Name = scanner.next();
        if(Pattern.matches("[A-Z]{1}[a-z]{2,}",first_Name)) {
            System.out.println("VALID FIRST NAME");
        } else {
            System.out.println("INVALID FIRST NAME");
        }
    }
}
