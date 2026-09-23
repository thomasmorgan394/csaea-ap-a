import module java.base;
public class Series {
    private String showName;
    private String genre;
    private int episodes; 
    private int seasons;
    private String actors;
    private String director;
    private double imdbRating;
    private String qualityOption;
    private int numRatings;
    private int rate;
    private int episodeOn;
    private boolean isWatching;
    private boolean subtitlesEnabled; 
    private String dubbedLanguage;

    public Series(String director, String genre, String showName) { 
        this.showName = showName;
        this.director = director;
        this.genre = genre;
        this.imdbRating = 8.0;
        this.seasons = 3;
        this.episodes = 24; 
        this.episodeOn = 0;
        this.isWatching = false;
    }

    public void rateSeries(double newRating) { 
        if (newRating >= 0 && newRating <= 10) { 
            imdbRating = newRating;
            System.out.println(showName + " rating is now updated to " + imdbRating);
        } else { 
            System.out.println("This is an invalid rating! Please make your rating between 0-10");
        }
    }    

    public void finishEpisode() {
        episodeOn += 1;
        System.out.println("You are now watching " + showName + ", episode " + episodeOn);

        if (episodeOn > episodes) { 
            episodeOn = 1;
            seasons += 1;
            System.out.println("Advance to season " + seasons);
        } else {
            System.out.println("Episodes remaining in season: " + (episodes - episodeOn));
        }
    }

    public void toggleWatchState() {
        isWatching = !isWatching;
    }

    public void updateGenre(String newGenre) {
        genre = newGenre;
    }
}
Series s1 = new Series("Christopher Nolan", "Sci-fi", "Inception series");
Series s3 = new Series("Michael Schur", "Comedy", "The good place");
Series s4 = new Series("Duffer Brothers", "fiction", "Stranger things");
Series s5 = new Series('Greg Daniels", "Comedy", "The office");
Series s5 = new Series("Greg Daniels", "Comedy", "The office");
s1.showName;
s1.genre;
s1.seasons;
s1.actors;
s1.director;
s1.imdbRating;
s1.qualityOption;
s1.rate;
s1.episodeOn;
s1.isWatching;
s1.subtitlesEnabled;
s1.dubbedlanguage;
s1.dubbedLanguage;
s1.rateSeries(9.2);
s2.finishEpisode();
s2.finishEpisode();
s2.finishEpisode();
s3.toggleWatchState();
s4.updateGenre("Sci-Fi / Drama");