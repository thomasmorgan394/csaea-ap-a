// ArrayLists are dynamic lists that store multiple objects (not primitives like int, double, or boolean)
// Unlike arrays, they can grow and shrink while the program runs
// AP CS A only uses: size(), add(obj), add(index, obj), get(index), set(index, obj), remove(index)


import java.util.ArrayList;

// import java.util.*;

public class ArrayLists {

    public static ArrayList<String> createList() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("donkey");
        animals.add("pangolin");
        animals.add("blobfish");   
        animals.add("cat");

        return animals;
    }

    public static void showIndex(ArrayList<String> animals) {
        System.out.println("First element: " + animals.get(0));
        System.out.println("Second element: " + animals.get(1));
        System.out.println("Last element: " + animals.get(animals.size() - 1));
    }

    // linear search: returns the index of target, or -1 if not found
    // -1 is a signal value meaning "not found," never a real index

    public static int findIndex(ArrayList<String> list, String target) 
    {
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(target)) {
                return i;
            }

        }

        return -1;
    }

    public static void modifyAnimals(ArrayList<String> animals){
    // set(index, obj) REPLACES an element; size stays the same
    animals.set(0, "babirusa");

    animals.add("glass frog"); // appends to the end
    // add(index, obj) INSERTS; everything at that index and after shifts right
    animals.add(3, "aye-aye");
    animals.add(1, "camel");

    // remove(index) deletes, shifts everything after it LEFT, and returns the removed element
    String removed = animals.remove(0);
    System.out.println("Removed animal:" + removed);

    System.out.println("Modified animal ArrayList" + animals);

    } 

// * ===== CHALLENGE 1: Searching and Modifying =====

//      * Write replaceAll(ArrayList<String> animals, String oldVal, String newVal) that replaces
//      * EVERY match, not just the first.
//      * Example: ["cat", "dog", "cat"], replace "cat" with "fox"  ->  [fox, dog, fox]
//      * Tools:   for loop with index i, size(), get(i), set(i, obj), .equals()
//      Test it to make sure it works!

    public static void replaceAll(ArrayList<String> animals, String oldVal, String newVal){

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).equals(oldVal)){
                    animals.set(i, newVal);
            }
        }
    }

    public static void numberUtilities() {

        //native array list
        int[] values = {3, 7, 1, 9, 4, 2, 5, 8, 6, 0};
        // ArrayList:
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int v : values) {
            nums.add(v);  // autoboxing: Java converts int -> Integer automatically
        }

        System.out.println("Original Numbers: " + nums);
        System.out.println("Length of list: " + nums.size());

        int min = nums.get(0);
        int max = nums.get(0);
        int sum = 0;

        // enhanced for loop: visits every element; good for reading, NOT for adding/removing
        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n; // accumulator pattern
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);

        // how to print average of nums as a double

        System.out.println("Average: " + (double) sum / nums.size());

    }

    /* ===== CHECKPOINT 2: Traversal Algorithms =====
     * CHALLENGE:
     * Find the INDEX of the max, not just its value. (Why can't you use an enhanced for loop?)
     * Example: [3, 7, 1, 9, 4]  ->  3   (the 9 is at index 3)
     * Tools:   for loop with index i, size(), get(i), a variable to remember the best index
     * */

    // An enhanced for loop gives you values, not indices.
    
    public static void membershipCheck(ArrayList<String> animals) {

        boolean found = false; 
        String target = "cat";

        for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).equals(target)) {
                    found = true;
                }
        }

        // if (found = true) {
        //     System.out.println("There's a cat in your Array!");
        // } else {
        //     System.out.println("No cat.");
        // }

        if (found) System.out.println("There's a cat in your Array!");
        else System.out.println("No cat.");

    }

     // copying: build a new list element by element

     public static void copyList() {

        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);

        ArrayList<Integer> copied = new ArrayList<>();

        // Iterate over the original list, add the value of each element to the new list
        for (int i = 0; i < original.size(); i++){
            copied.add(original.get(i));
        }

        copied.add(5);

        System.out.println("Original List: " + original);
        System.out.println("Copied List: " + copied);

     }

     public static void removeShortNames(ArrayList<String> animals) {
        
        for (int i = animals.size() - 1; i >= 0; i--) {
            if (animals.get(i).length() <= 5) {
                animals.remove(i);
            }
        }

        System.out.println("Without short names: " + animals);
     }

     /* ===== CHECKPOINT 3: Removing While Traversing =====
     * CHALLENGE:
     * Write removeAll(ArrayList<String> animals, String target) that removes EVERY copy of target.
     * Use the same backward loop as removeShortNames, but match with .equals like findIndex.
     * Example: [cat, dog, cat, emu], remove "cat"  ->  [dog, emu]
     * Tools:   backward for loop, size(), get(i), remove(i), .equals()
     *
  */

     public static void removeAll(ArrayList<String> animals,String target) { 
        for (int i = animals.size() - 1; i >= 0; i--){ 
            if (animals.get(i).equals(target)) {
                animals.remove(i);
            }
        }
     }
     
//Write longNames(ArrayList<String> animals) that RETURNS A NEW list of every name longer than the average name length. Along the way, print the longest name and whether "glass frog" is in the list. Use ONLY enhanced for loops.

// Example:
// [cat, pangolin, emu, glass frog] → average 6.0, returns [pangolin, glass frog]
// Prints:
// Longest: glass frog            
// Has glass frog?: true

// Tools: enhanced for, accumulator, min/max tracking, boolean flag, .equals(), (double) cast, building a new list with add(obj)

// Steps:
// 1. Set up: total = 0, longest = animals.get(0), hasFrog = false
// 2. Loop #1 -- over every name in animals:    
//    a. add its length to total    
//    b. if it's longer than longest, update longest    
//    c. if it .equals("glass frog"), set hasFrog = true
// 3. AFTER the loop, compute avg = (double) total / animals.size()
// 4. Make an empty ArrayList<String> result
// 5. Loop #2 over every name: if its length > avg, add it to result
// 6. Print "Longest: " + longest and "Has glass frog: " + hasFrog
// 7. Return result
      
public static ArrayList<String> longNames(ArrayList<String> animals) {
        int total = 0;
        String longest = animals.get(0);
        boolean hasFrog = false;

        for (String name : animals) {
            total += name.length();
            if (name.length() > longest.length()) {
                longest = name;
            }
            if (name.equals("glass frog")) {
                hasFrog = true;
            }
        }

        double average = (double) total / animals.size();
        ArrayList<String> result = new ArrayList<>();

        for (String name : animals) {
            if (name.length() > average) {
                result.add(name);
            }
        }

        System.out.println("Longest: " + longest);
        System.out.println("Has glass frog?: " + hasFrog);
        return result;
     }
} 