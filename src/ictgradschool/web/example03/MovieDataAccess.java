package ictgradschool.web.example03;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to return a list of Movie objects.
 * Typically data would come from a database.
 * */
public class MovieDataAccess {

    public static List<Movie> getMovies(){

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("The Intouchables",2011,112,"Olivier Nakache and Eric Toledano"));
        movies.add(new Movie("From Russia With Love",1963,110,"Terence Young"));
        movies.add(new Movie("The Long Voyage Home",1940,105,"John Ford"));
        movies.add(new Movie("Easy Rider",1969,94,"Dennis Hopper"));
        movies.add(new Movie("Dark Shadows",2012,113,"Tim Burton"));
        movies.add(new Movie("Walk the Line",2005,136,"James Mangold"));
        movies.add(new Movie("The Help",2011,137,"Tate Taylor"));
        movies.add(new Movie("Meet the Parents",2000,107,"Jay Roach"));
        movies.add(new Movie("The King's Speech",2011,118,"Tom Hooper"));
        movies.add(new Movie("Charlie and the Chocolate Factory",2005,115,"Tim Burton"));
        movies.add(new Movie("Alice In Wonderland",2009,109,"Tim Burton"));
        movies.add(new Movie("The Iron Lady",2011,105,"Phylliday Lloyd"));
        movies.add(new Movie("Kaikohe Demolition",2004,52,"Florian Habicht"));
        movies.add(new Movie("Brokeback Mountain",2005,134,"Ang Lee"));
        movies.add(new Movie("Gladiator",2000,154,"Ridley Scott"));
        movies.add(new Movie("The Parent Trap",1961,129,"David Swift"));
        movies.add(new Movie("Happy-Go-Lucky",2008,118,"Mike Leigh"));
        movies.add(new Movie("The Big Wedding",2013,89,"Justin Zackham"));
        movies.add(new Movie("Searching for Sugar Man",2012,86,"Malik Bendjelloul"));

        return movies;
    }

}
