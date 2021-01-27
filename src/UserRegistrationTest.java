import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class UserRegistrationTest {
    @Test
    public void WhenProperFirstName_Should_PassTheTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        String validation = userRegistration.nameValidation("Aravind");
        Assert.assertEquals("VALID",validation);
    }
    @Test
    public void WhenProperLastName_Should_PassTheTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        String validation = userRegistration.nameValidation("Pothu");
        Assert.assertEquals("VALID",validation);
    }
    @Test
    public void WhenProperEmail_Should_PassTheTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        String validation = userRegistration.emailValidation("abc.bn@google.com");
        Assert.assertEquals("VALID",validation);
    }
    @Test
    public void WhenProperMobileNumber_Should_PassTheTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        String validation = userRegistration.mobileNumberValidation("91 7891234560");
        Assert.assertEquals("VALID",validation);
    }
    @Test
    public void WhenProperPassword_Should_PassTheTestCase() {
        UserRegistration userRegistration = new UserRegistration();
        String validation = userRegistration.passwordValidation("adc@A1bjhgihvjh");
        Assert.assertEquals("VALID",validation);
    }


}
