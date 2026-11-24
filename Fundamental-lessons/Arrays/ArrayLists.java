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

}