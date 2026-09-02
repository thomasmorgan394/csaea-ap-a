package CrashCourse;

public class CrashCourse { // class header 
    public static void main(String[] args) {
        // comments 
        /*comments for multiple lines 
        really good */

        System.out.print("hello");
        System.out.println("World"); //auto prints on a new line (almost always use this)
        System.out.println("Hello World");



        int a; // integer
        double b; // decimal, or float
        boolean c; // true or false


        a = 4 ;
        b = 5.5;
        c = false; // make sure false is lowercase
        // arithmetic Operators 
        // + - / *
        // += =- =/ =%

        int d = 3;
        d += 7; // adds 7 to d's value 

        System.out.println("d = " + d);

        // Increment and decrement by one: 
        // -- ++ 
        d --; // subtracts 1 from d's value 
        d ++;
        d ++; // adds 1 to d's value
        System.out.println("d is now = " + d);

        //Comparisons (always return true or false)
        // < >  <= >= == !=
        System.out.println(4 < 5);
        System.out.println(4 > 5);
        System.out.println(4 != 5);

        // logical operators
        // In order of precedence NOT: ! AND: && OR: ||

        boolean e  = false; boolean f = true;
        System.out.println(!e);
        System.out.println(e && f);
        System.out.println(e || f && !e);
        // short circuits after checking e -- java does not need to check f.



    }
}
