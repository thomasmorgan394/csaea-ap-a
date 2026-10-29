// create a class header for this class
//one String attribute: 'secret'
// constructor that lets user enter a secret password
// two methods
// boolean called "checkBroken"
// boolean called "check"
public class Password
{
 //  Attribute are data
    private String secret;

    //  Constructor
    public Password(String secret)
    {
        this.secret = secret;
    }

    //BROKEN method: compares objects, not characters
    public boolean checkBroken(String attempt){
        return secret == attempt; // this is incorrect! it returns false even if the attempt is correct.
    }

    //write another method called 'check' that correctly compares the attempt with the secret
    public boolean check(String attempt){
        return attempt.equals(secret);
    }
  // ===== CHALLENGE 1  =====
    // create a method called sameAs which takes in a string 'other'. 
    // Return true if THIS Password and other have the same secret.
    // (Inside the class you can reach other.secret.)
    // to test, create a new object with a new password
    public boolean sameAs(String attempt){
        return secret.equals(attempt); // this is incorrect! it returns false even if the attempt is correct.
    }
    public boolean change(String password1, String password2){ 
        if (password1.equals(password2) && !password1.equals(secret)) { 
            secret = password1;
            return true;
        }
        else {
            return false;
    }
    }
}
