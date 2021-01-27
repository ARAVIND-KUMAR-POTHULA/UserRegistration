import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Before;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidateAllEmails {
    private String allEmails;
    private boolean resultExp;

    public ValidateAllEmails(String allEmails, boolean resultExp) {
        this.allEmails = allEmails;
        this.resultExp = resultExp;
    }
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList (new Object[][]  { { "abc", false },
                { "abc@.com.my", false },
                { "abc123@gmail.a", false },
                { "abc123@.com", false },
                { "abc123@.com.com", false },
                { ".abc@abc.com", false },
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                { "abc.@gmail.com", false },
                { "abc@abc@gmail.com", false },
                { "abc@gmail.com", true },
                { "abc111@abc.com",true},
                { "abc@1.com", true },
                { "abc+100@gmail.com", true },
                { "abc@gmail.com.com", true },
                {"abc100@abc.net", true },
                { "abc-100@yahoo.com",false } } );
    }
    @Test
    public void givenEmailAsVar_ShouldReturnAsPerParametrizedResult() {
        UserRegistration validator = new UserRegistration();
        boolean Result = validator.emailValidation(this.allEmails);
        Assert.assertEquals(this.resultExp, Result);
    }
}

