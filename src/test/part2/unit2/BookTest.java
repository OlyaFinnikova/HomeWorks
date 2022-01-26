package part2.unit2;
import org.junit.Test;
import static org.junit.Assert.*;
public class BookTest {
    @Test
    public void testGet(){
        Book book = new Book("Песнь льда и пламени", 213, 1999, "Джордж Мартин");
        assertEquals("Песнь льда и пламени", book.getTitle());
        assertEquals(213, book.getNumberOfPages());
        assertEquals(1999, book.getYearOfRelease());
        assertEquals("Джордж Мартин", book.getAuthor());
    }
}