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


}