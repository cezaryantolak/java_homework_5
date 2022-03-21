import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static MovieLibrary movieLibrary = new MovieLibrary();
    static File path = new File("./src/main/resources/movies.json");


    public static void main(String[] args) throws IOException {

        movieLibrary = DataInput.getMoviesToList(path);
        menu();
    }

    public static void menu() {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nPick a menu option:" + "\n1 – Print all films between chosen years" + "\n2 – Print information about random movie" + "\n3 – Enter the name and surname of the actor to display the names of the movies he starred in");
        int optionNumber = scan.nextInt();
        scan.nextLine();

        switch (optionNumber) {

            case 1:
                System.out.println("Enter the year which is the beginning of the range");
                int minYear = scan.nextInt();
                System.out.println("Enter the year which is the end of the range");
                int maxYear = scan.nextInt();
                movieLibrary.movieByDate(minYear, maxYear);
                break;

            case 2:
                movieLibrary.randomMovieInfo();
                break;

            case 3:
                System.out.println("Enter the name of the actor");
                String name = scan.nextLine();
                System.out.println("Enter the last name of the actor");
                String surname = scan.nextLine();
                Actor chosenActor = new Actor(name, surname);
                movieLibrary.movieByActor(chosenActor);
                break;
        }
    }
}
