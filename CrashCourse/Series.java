package CrashCourse;

public class Series {
private String showName;
private String genre;
int episodes; 
int seasons;
String actors;
String director;
private Double imdbRating;
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
    imdbRating = 8.0;
    seasons = 3;
    episodes = 24; 
    episodeOn = 0;

}
    public void finishEpisode() {
        episodeOn = episodeOn ++;
         System.out.println("You are on episode " + episodeOn);
        if (episodeOn > episodes) { 
            episodeOn = 0;
            seasons ++;
        }
            

    } 
    public void isWatching() {
        


    }
    } 