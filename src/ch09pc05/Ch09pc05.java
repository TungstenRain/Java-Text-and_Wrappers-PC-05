package ch09pc05;
import java.util.Scanner;

/**
 *
 * @author frank.olson
 * date 11/21/2017
 * purpose: to verify passwords
 */
public class Ch09pc05 {

    public static void main(String[] args) {
        // variables
        String password;
        
        //create keyboard Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //request input
        System.out.print("Please enter a password to verify if it is valid: ");
        password = keyboard.nextLine();
        
        //instantiate PasswordVerify class
        PasswordVerify pw = new PasswordVerify(password);
        
        if (pw.isValid())
            System.out.println("Your passowrd is valid.");
        else
            System.out.println("Your password is not valid.");
    }
    
}
