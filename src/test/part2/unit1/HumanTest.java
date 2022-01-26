package part2.unit1;

import org.junit.Test;
import part2.unit1.Human;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    @Test
    public void toStringTest() {
        String expected = "Human{name='Oleg', surname='Oleg', patronymic='Oleg', age=15}";
        Human human = new Human("Oleg", "Oleg","Oleg",15);
        assertEquals(expected, human.toString());
    }
}
