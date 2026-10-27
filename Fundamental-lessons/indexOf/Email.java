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

    // getUser will return everything to the left of the @ 
    // method: substring -- cuts out part of a String. (any sub part of a string)
    // String substring(int from, int to) from index "From" up to, NOT including, "to"
    // String substring(int from) from index, "from" to the end
    //mharrell@hcvsd.org
    public String getUser() {
        return address.substring(0,address.indexOf("@"));
    }

    // getDomain

    public String getDomain() {
        return address.substring(address.indexOf("@", -1));
    }

    // isSchool
    public boolean isSchool() {
        return false;
    }
    
}
