/*
 * EmailTester: uses indexOf on Strings and Email objects.
 * Predict each line BEFORE you run.
 *
 * Run:  javac Email.java EmailTester.java
 *       java EmailTester
 */

public class EmailTester {
    public static void main(String[] args) {

        String word = "banana";
        System.out.println(word.indexOf("b")); // what do you think will be returned?
        System.out.println(word.indexOf("a"));
        System.out.println(word.indexOf("nan"));
        System.out.println(word.indexOf("z"));
        System.out.println(word.indexOf("B"));
        
        Email michael = new Email("mharrell@nhvweb.net");
        Email jojo = new Email("jojo@nhvweb.net");

        System.out.println(michael.toString());

        System.out.println(michael.getAtIndex());
        System.out.println(jojo.getAtIndex());
        System.out.println(michael.getUser());
        System.out.println(jojo.getUser());


    }
}