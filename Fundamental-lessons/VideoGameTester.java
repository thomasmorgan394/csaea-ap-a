public class VideoGameTester {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("Minecraft", 100, 9.0, true);
        VideoGame game2 = new VideoGame("Fortnite", 50, 10.0, true);
        VideoGame game3 = new VideoGame("Rocket League", 40, 7.5, false);
        
        System.out.println("Test TOSTRING");
        System.out.println("Expected: Game: Minecraft, Hours Played: 100, Rating 9.0, Multiplayer: true");
        System.out.println("Got: " + game1.toString());
    }
}
