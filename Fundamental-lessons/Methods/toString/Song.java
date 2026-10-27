/*
 * Song: blueprint for Song objects.
 * New method: toString()
 *
 * toString() returns a String that describes an object.
 * Header -- copy it exactly:   public String toString()
 * It RETURNS text. It does not print.
 */

public class Song {

    // ATTRIBUTES. intance variables . . . . hold DATA for each song instance

    private String title;
    private String artist;
    private int plays;

    // Constructor 

    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;
        plays = 0;

    }
    
    // Methods. Behaviors 

    public void play() {
        plays++;
    }

    public int getPlays() {
        System.out.println(plays);
        return plays;
    }

    public String toString()
    {
        
        return title + " by " + artist + " - " + plays + "plays";
    }

    if (plays != 1){
        return title + " by " + artist + " 1 play";
    }
    else {
        return title + "by " + artist + " - " + plays + "play";

    }
    public void getStars() {
        String stars = "";
        for (int = 0; i < plays; i++ ) {
            stars += "*";
        }
    }
}
}