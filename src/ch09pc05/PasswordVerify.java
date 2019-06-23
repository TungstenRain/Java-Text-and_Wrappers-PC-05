package ch09pc05;

/**
 *
 * @author frank.olson
 */
public class PasswordVerify {
    //fields
    private String password;
        
    //constructors
    public PasswordVerify(String pw)
    {
        password = pw;
    }
    
    //methods
    public boolean isValid()
    {
        //password has to be 6 or more characters
        //password has to have one uppercase and one lowercase letter
        //password has to have one digit
        
        //variables
        char c;
        int upper = 0, lower = 0, digit = 0;
        
        
        if (password.length() < 5)
            return false;
        else
        {
            for (int i = 0; i < password.length(); i++)
            {
                c = password.charAt(i);
                if (Character.isUpperCase(c))
                    upper++;
                if (Character.isLowerCase(c))
                    lower++;
                if (Character.isDigit(c))
                    digit++;
            
            }
            if (upper < 1 || lower < 1 || digit < 1)
                return false;
        }
        return true;
    }
}
