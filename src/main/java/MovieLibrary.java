import java.util.List;
import java.util.Random;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void movieByDate(int minYear, int maxYear) {
        for (Movie i : movies) {
            if (i.getDate() >= minYear && i.getDate() <= maxYear) {
                System.out.println(i.getTitle());
            }
        }
    }
    public void randomMovieInfo() {
        System.out.println(movies.get(new Random().nextInt(movies.size())));
    }

    public void movieByActor(Actor actor) {
        for (Movie i : movies) {
            if (i.getActors().get(0).equals(actor)) {
                System.out.println(i.getTitle());
            }
        }
    }
}
