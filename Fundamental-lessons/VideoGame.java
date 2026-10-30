public class VideoGame { 
    private String name;
    private int hoursPlayed;
    private double rating;
    private boolean multiplayer;

    public VideoGame(String name, int hoursPlayed, double rating, boolean multiplayer) { 
        this.name = name;
        this.hoursPlayed = hoursPlayed;
        this.rating = rating;
        this.multiplayer = multiplayer;
    }
    public String toString() { 
        return "Game: " + name + ", Hours Played: " + hoursPlayed + ", Rating: " + rating + ", Multiplayer: " + multiplayer;
    }
    public boolean containsWord(String word) {
        return name.indexOf(word) != -1;
    }
    public boolean hasFirstWord(String word) { 
        int space = name.indexOf(" ");
        if (space == -1) {
            return name.equals(word);
        } 
        return name.substring(0, space).equals(word);
        }
        public boolean isSameGame(String otherName) {
            return name.equals(otherName);
        } 
        public double averageRatingPerHour() {
            return rating / hoursPlayed;
        } 
        public boolean canPlayWithFriends() { 
            return multiplayer;
        } 
        public void addHours(int hours) {
            hoursPlayed += hours;
        } 
}