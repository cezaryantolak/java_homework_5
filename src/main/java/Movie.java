import java.util.List;

public class Movie {
    private String title;
    private int date;
    private String genre;
    private Director director;
    private List<Actor>actors;

    public Movie(String title, int date, String genre, Director director, List<Actor> actors) {
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public String getGenre() {
        return genre;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "title: " + title + " \n director: " + director + " \n date: " + date + " \n genre: " + genre + "  \n actors: " + actors;
    }
}
