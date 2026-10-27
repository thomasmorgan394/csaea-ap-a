public class SongTester {

    public static void main(String[] args) {

        Song a = new Song("Enter Sandman","Metallica");

        a.play();
        a.play();
        a.play();
        
        System.out.println(a.toString());
        System.out.println(a);

        a.getPlays();

    }
    
}
