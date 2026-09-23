public class SeriesTester {
    public static void main(String[] args) {
        Series john = new Series("James", "humorous", "reacher");
        Series joel = new Series("Connor", "Sci-fi", "Planet Neptune");
        Series bob = new Series("Nate", "Drama", "adventures of joel");
        bob.rateSeries(4.0);
        john.finishEpisode();
        joel.toggleWatchState();




    }
}
