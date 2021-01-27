import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class UserRegistrationTest {
    @Test
    public void WhenProperFirstName_Should_PassTheTestCase() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        try {
            String validation = userRegistration.nameValidation("aravind");
            Assert.assertEquals("VALID", validation);
        }catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper firstName", exception.getMessage());
        }
    }
    @Test
    public void WhenProperLastName_Should_PassTheTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            String validation = userRegistration.nameValidation("Pothu");
            Assert.assertEquals("VALID", validation);
        }catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper lastName", exception.getMessage());
        }
    }
    @Test
    public void WhenProperEmail_Should_PassTheTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean validation = userRegistration.emailValidation("abc.bn@google.com");
            Assert.assertEquals(true, validation);
        }catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper email", exception.getMessage());
        }
    }
    @Test
    public void WhenProperMobileNumber_Should_PassTheTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            String validation = userRegistration.mobileNumberValidation("917891234560");
            Assert.assertEquals("VALID", validation);
        }catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper mobile number", exception.getMessage());
        }
    }
    @Test
    public void WhenProperPassword_Should_PassTheTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            String validation = userRegistration.passwordValidation("adc@A1bjhgihvjh");
            Assert.assertEquals("VALID", validation);
        }catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper password", exception.getMessage());
        }
    }


}
