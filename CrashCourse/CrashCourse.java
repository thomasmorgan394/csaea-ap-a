package CrashCourse;

import javax.print.DocFlavor.STRING;

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

        boolean t  = true; boolean f = false;
        System.out.println(!t);
        System.out.println(t && f);
        System.out.println(t || f && !t); //short circuits after checking the first truth
        // short circuits after checking e -- java does not need to check f.
        // CASTING (converting)

        int g = (int)5.5; //CASTING
        System.out.println(g);

        double h = (double)5/6; //CASTING (the 2nd double is the caster)
        System.out.println(h);

        // STRINGS
        String s1 = "Goodnight";
        String s2 = " and";
        String s3 = " Goodbye";
        String result = s1 + s2 + s3;
        result += ", Cowboy. ";
        System.out.println(result + "\n");

        // 
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);
        arry1[0] = 11;
        arry1[1] = 2;

        System.out.println("Remainder: " + arry1[0] % arry1[1]);
        int[] arry2 = {34, 52, 3, 64, 32};
        System.out.println("arry2: " + arry2);
        // 2D arrays (grid or a table)

        int[][] arryGrid1 = new int[4][3]; //[rows][columns]
        // 0 0 0
        // 0 0 0
        // 0 0 0
        // 0 0 0 

        
        System.out.println("Rows:" + arryGrid1.length);
        System.out.println("Columns:" + arryGrid1[0].length);

    }
}
