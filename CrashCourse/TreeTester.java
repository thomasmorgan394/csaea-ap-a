public class TreeTester{

    public static void main(String[] args){
        Tree one = new Tree(true, 5, "Green", "Fall", false );
        Tree two = new Tree(false, 50, "none", "November", false);
        one.raining();
        two.snowing();
        one.branchBreaks();
        one.age();
        two.grow();
        one.yearPassed();




    }

}