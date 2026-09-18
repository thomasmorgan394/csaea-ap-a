package CrashCourse;

public class Series {
private String showName;
private String genre;
private int episodes; 
int seasons;
String actors;
String director;
private double imdbRating;
String qualityOption;
int numRatings;
private int rate;
int episodeOn;
private boolean isWatching;
boolean subtitlesEnabled; 
String dubbedLanguage;
public Series(String director,String genre,String showName) { 
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
            this.imdbRating = newRating;
            System.out.println(showName + "rating is now updated to" + imdbRating);
        }   else { 
            System.out.println("This is an invalid rating! Please make your rating between 0-10" );
        }
    }    


    public void finishEpisode() {
        episodeOn += 1;
         System.out.println("You are now watching " + showName + ", episode " + episodeOn);

         if (episodeOn > episodes) { 
            episodeOn = 1;
            seasons += 1;
            System.out.println("Advance to season" + seasons);
         }  else {
            System.out.println("Episodes remaining in season: " + (episodes - episodeOn));
         }
        }
    public void toggleWatchState() {
        this.isWatching = !this.isWatching;
    }
    public void updateGenre(String newGenre) {
        this.genre = newGenre;
    }
    } 