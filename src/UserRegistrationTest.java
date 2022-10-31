import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Srushti");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result =userRegistration.firstName("Srushti");
        Assertions.assertEquals(false, result);
    }

}
