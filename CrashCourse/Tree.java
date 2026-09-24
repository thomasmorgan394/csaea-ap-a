public class Tree{
    private boolean isAlive;
    private String treeWriting;
    private int numBranches;
    private int numLeaves;
    private double longitudeNum;
    private double latitudeNum;
    private String leafColor;
    private int yearsLived;
    private boolean isSnowy;
    private boolean isWet;
    private boolean isDry;
    private boolean hasFruit;
    private String season;
    private String fruit;
    private String type;

    public Tree(boolean isAlive, int yearsLived, String leafColor, String season, boolean hasFruit) {
        this.isAlive = isAlive;
        this.yearsLived = yearsLived;
        this.leafColor = leafColor;
        isSnowy = false;
        isWet = false;
        isDry = false;
        treeWriting = ("There is no writing on this tree so far");
        hasFruit = false;
        this.numBranches = 200;
        this.numLeaves = 1000;
    }

    public void raining() {
        isWet = true;
        System.out.println("This tree is now wet");
        if (isSnowy && isWet); {
            isSnowy = false;
    }} 
    public void snowing() {
        isSnowy = true;
        System.out.println("This tree is now snowy"); 
        if (isSnowy && isWet); {
            isSnowy = false;
    } 
    }
    public void branchBreaks() { 
        numBranches --;
        System.out.println("There are now " + numBranches + " branches left on the tree");
    }
    public void grow() {
        numBranches ++;
        numLeaves ++;
        System.out.println("This tree has grown! ");
    }
    public void yearPassed() {
        yearsLived ++;
        System.out.println("This tree is now " + yearsLived + " years old");
    }
    public void age() {
        System.out.println("This tree is " + yearsLived + " old"); 
    }

    }
