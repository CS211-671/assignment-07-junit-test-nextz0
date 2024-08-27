package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    @DisplayName("testusername")
    public void TestIsUsername(){
        User users = new User("next");
        assertEquals("next",users.getUsername());
    }

    @Test
    @DisplayName("testsetpassword")
    public void TestSetPassword(){
        User users = new User("next");
        users.setPassword("1111");
        assertNotNull(users.getPassword());
        assertEquals("1111", users.getPassword());
    }




}