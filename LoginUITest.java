import java.util.*;
import org.junit.Test;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class LoginUITest {

    @Test
    public static void LoginUITest (String password, String username) {

        String Username;
        String Password;

        Username = "newaccount@gmail.com";
        Password = "Graduation2022#";

        if ( username.equals(Username) && password.equals(Password))
        {
            System.out.println("Login Successful");
        }
        else if (username.equals(Username)) {
            System.out.println("Password is invalid");
        }
        else if (password.equals(Password)) {
            System.out.println("Username is invalid");
        }
        else
        {
            System.out.println("Username and Password are invalid");
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Username: ");
        String username = s.next();
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your Password: ");
        String password = s1.next();

        LoginUITest (username,password);
    }
}

