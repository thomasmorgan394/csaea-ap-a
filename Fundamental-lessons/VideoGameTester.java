public class VideoGameTester {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("Minecraft", 100, 9.0, true);
        VideoGame game2 = new VideoGame("Fortnite", 50, 10.0, true);
        VideoGame game3 = new VideoGame("Rocket League", 40, 7.5, false);
        
        System.out.println("Test TOSTRING");
        System.out.println("Expected: Game: Minecraft, Hours Played: 100, Rating 9.0, Multiplayer: true");
        System.out.println("Got: " + game1.toString());
        System.out.println("Test: Contains Word");
        System.out.println("Expected: true");
        System.out.println("Got: " + game1.containsWord("craft"));
        System.out.println("Expected: false");
        System.out.println("Got: " + game1.containsWord("Fortnite"));
        System.out.println("Test: HAS FIRST WORD");
        System.out.println("Expected: true");
        System.out.println("Got: " + game3.hasFirstWord("Rocket"));
        System.out.println("Expected: false");
        System.out.println("Got: " + game3.hasFirstWord("League"));
        System.out.println("TEST SAME GAME");
        System.out.println("Expected: true");
        System.out.println("Got: " + game1.isSameGame("Minecraft"));
        System.out.println("Expected: false");
        System.out.println("Got: " + game1.isSameGame("Fornite"));
        System.out.println("TEST: AVERAGE RATING PER HOUR");
        System.out.println("Expected: 0.09:");
        System.out.println("Got: " + game1.averageRatingPerHour());
        System.out.println("TEST: MULTIPLAYER");
        System.out.println("Expected: true");
        System.out.println("Got: " + game1.canPlayWithFriends());
        System.out.println("TEST: ADD HOURS");
        game2.addHours(10);
        System.out.println("Expected: 60");
        System.out.println("Got: " + game2.toString());
    }

}
