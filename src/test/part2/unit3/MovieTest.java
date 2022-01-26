package part2.unit3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void getTest() {
        Movie movie = new Movie("Котик", 236, "Я");
        assertEquals("Котик", movie.getTitle());
        assertEquals(236, movie.getDurationSecond());
        assertEquals("Я", movie.getRegisseur());
    }
}