import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterAccountUITest {

    /**
     * In this test case we are going to test the register method by passing a short User ID.
     * It should return us a message that USER ID not long enough.
     */
    @Test
    public void test_RegisterMethod_Case1() {
        String response = RegisterAccountUI.register("1", "argPwd1checkingPassword", "argPwd2checkingPassword");
        assertEquals("User ID not long enough", response);
    }

    /**
     * In this test case we are going to test the register method by passing an existing User ID.
     * It should return us a message that Login id exists !!!.
     */
    @Test
    public void test_RegisterMethod_Case2() {
        String response = RegisterAccountUI.register("keksdarl95@yahoo.com", "argPwd1checkingPassword", "argPwd2checkingPassword");
        assertEquals("Login id exists !!!", response);
    }

    /**
     * In this test case we are going to test the register method by passing an invalid User ID having bad characters.
     * It should return us a message that User ID is invalid.
     */
    @Test
    public void test_RegisterMethod_Case3() {
        String response = RegisterAccountUI.register("my-email@=gmail&.com", "argPwd1checkingPassword", "argPwd2checkingPassword");
        assertEquals("User ID is invalid", response);
    }

    /**
     * In this test case we are going to test the register method by passing a password with short length (length less than 6).
     * It should return us a message that Password too short.
     */
    @Test
    public void test_RegisterMethod_Case4() {
        String response = RegisterAccountUI.register("testingemail@gmail.com", "args1", "argPwd2checkingPassword");
        assertEquals("Password too short", response);
    }

    /**
     * In this test case we are going to test the register method by passing different password for the repeat password.
     * As we know our both passwords should match before registration, so let's test it.
     * It should return us a message that Retyped password does not match.
     */
    @Test
    public void test_RegisterMethod_Case5() {
        String response = RegisterAccountUI.register("testingemail@gmail.com", "my-new-password", "second-wrong-password");
        assertEquals("Retyped password does not match", response);
    }

    /**
     * In this test case we are going to test the register method by passing everything correct.
     * It should return us a message that New Registration Successful.
     */
    @Test
    public void test_RegisterMethod_Case6() {
        String response = RegisterAccountUI.register("testingemail@gmail.com", "my-new-password", "my-new-password");
        assertEquals("New Registration Successful", response);
    }
}
