package CrashCourse;

public class Series { 

    // Data // atributes 
String showName;
String genre;
int episodes; 
int seasons;
String actors;
String director;
Double imdbRating;
String qualityOption;
int numRatings;
int rate;
int episodeOn;
public Series(String director,String genre,String showName) { 
    this.showName = showName;
    this.director = director;
    this.genre = genre;
    imdbRating = 8.0;
    seasons = 3;
    episodes = 24; 
} 
    public void finish() {
         episodes = episodeOn ++;
    } 
        

    }