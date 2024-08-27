package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("user1", "password1");
        users.addUser("user2", "password2");
        users.addUser("user3", "password3");


        // TODO: find one of them
        User user = users.findUserByUsername("user1");

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        String expected = "user1";
        // String actual = user.getUsername();
        String actual = user.getUsername();
        // assertEquals(expected, actual);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("user1", "password1");
        users.addUser("user2", "password2");
        users.addUser("user3", "password3");

        // TODO: change password of one user
        boolean actual = users.changePassword("user1", "password1","p1");
        // TODO: assert that user can change password
        // assertTrue(actual);
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("user1", "password1");
        users.addUser("user2", "password2");
        users.addUser("user3", "password3");

        // TODO: call login() with correct username and password
        User expected = users.findUserByUsername("user1");
        User actual = users.login("user1", "password1");

        // TODO: assert that User object is found
         assertEquals(expected, actual);

    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("user1", "password1");
        users.addUser("user2", "password2");
        users.addUser("user3", "password3");

        // TODO: call login() with incorrect username or incorrect password
        User actual = users.login("user1","password2");

        // TODO: assert that the method return null
         assertNull(actual);
    }

}