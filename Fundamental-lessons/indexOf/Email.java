public class Email {

    // add one attribue for the address

    private String address;

    // create a constructor that assigns an address to this address

    public Email(String address) {
        this.address = address;
    }

    // create the following empty methods with the correct return type (hint: none of them are void)
    // toString

    public String toString() {
        return address;
    }

    // getAtIndex
    //  Where is the @ ?    mharrell@hcvsd.org
    public int getAtIndex() {
        return address.indexOf("@");
    }

    // getUser will return everything to the LEFT of the @

    // method: substring -- cuts out part of a String.
     // String substring(int from, int to)   from index "from" up to, NOT including, "to"
      // String substring(int from)           from index "from" to the end

      // mharrell@hcvsd.org

    public String getUser() {
        return address.substring(0, address.indexOf("@"));
    }

    // getDomain
    // should return .com or .edu  or .net, everything after the @
    public String getDomain() {
       return address.substring(address.indexOf("@") + 1); // <-- incorrect. What needs to change?
    }

    // isSchool is a HELPER METHOD
    public boolean isSchool() {
        // use indexOf. return true if "hcvsd.org" is NOT in the email
        return address.indexOf("hcvsd.org") != -1;
    }
    public String getLabel(){
        if(this.isSchool()){
            return "School: " + this.getDomain();
        }
        else{ 
            return "Personal: " + this.getDomain();
        }
    }
    public boolean isStaffFormat(){
        return ((this.toString().indexOf("hcvsd.org") != -1) && (this.toString().indexOf(".")) != -1);
    }
    // Equals() method
    
    // ===== CHALLENGE 1 =====
// Method name: getFirstName
// School addresses are formatted first.last@cuny.edu
// Return the first name: the part of the user before the ".".
//     "ana.lee@hcvsd.org" -> "ana"
// Hint: call your helper method getUser() first and store it in a variable.
// Hint: find the "." in that variable, not in address.
// Tools: getUser, indexOf, substring



// ===== CHALLENGE 2 =====
// Method name: changeDomain
// Return a new address with the same user but a different domain.
//     "ana@hcvsd.org", "gmail.com" -> "ana@gmail.com"
// Reminder: this method must TAKE IN a parameter (the new domain).
//     What type is it? What will you name it?
// Hint: you don't need indexOf. getUser() already does the cutting.
// Hint: join Strings with +. Don't forget the "@".
// Tools: getUser, +

// ===== CHALLENGE 3 =====
// Method name: getLabel
// Label the address as "School" or "Personal", followed by the domain.
//     "ana.lee@hcvsd.org" -> "School: hcvsd.org"
//     "ana99@gmail.com"   -> "Personal: gmail.com"
// Hint: isSchool() already returns true or false, so use it as your condition.
// Hint: every path through the method needs a return.
// Tools: if/else, isSchool, getDomain

    
}
