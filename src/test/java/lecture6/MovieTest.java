package lecture6;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MovieTest {

//  Create movie object
    Movie movie = new Movie();

    public void printAll() {
//      Get all information from movies
        System.out.println("lecture6.Movie Name " + movie.getMovieName());
        System.out.println("lecture6.Movie Director " + movie.getMovieDirector());
        System.out.println("lecture6.Movie Genre " + movie.getMovieGenre());
        System.out.println("lecture6.Movie Year " + movie.getYear());
        System.out.println("lecture6.Movie Box Office " + movie.getBoxOffice());
        System.out.println("lecture6.Movie Budget " + movie.getBudget());
    }

    @Before
    public void setUp() {
        printAll();
//      Set Parameters
        movie.setMovieName("Rocketman");
        movie.setMovieDirector("Dexter Fletcher");
        movie.setMovieGenre("Musical/Drama");
        movie.setYear(2019);
        movie.setBoxOffice(195000000);
        movie.setBudget(41000000);
    }

    @After
    public void tearDown() {
        movie = null;
        printAll();
    }

    @Test
    public void firstTest() {
        printAll();
//      Adding assertions
        Assertions.assertThat(movie.getMovieName()).isEqualTo("Rocketman");
        Assertions.assertThat(movie.getMovieDirector()).isNotEmpty();
        Assertions.assertThat(movie.getMovieGenre()).contains("Musical");
        Assertions.assertThat(movie.getMovieGenre()).contains("Drama");
        Assertions.assertThat(movie.getYear()).isLessThan(2022);
        int expectedBoxOffice = movie.getBudget() * 2;
        Assertions.assertThat(movie.getBoxOffice()).isGreaterThan(expectedBoxOffice);
    }
}