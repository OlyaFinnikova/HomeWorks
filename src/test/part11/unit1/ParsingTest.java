package part11.unit1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class ParsingTest {

    @Test
    public void executeParsingTest() {
        Parsing parsing = new Parsing();
        ReadingFromFile reading = new ReadingFromFile();

        String text = reading.readFile();
        List<Case> actual = parsing.executeParsing(text);
        Case actualCase = actual.get(0);

        Case expectedCase = new Case("Поздравить подругу","аню с днем рождения",Importance.CRITICAL,true);

        assertEquals(expectedCase.getNameCase(),actualCase.getNameCase());
        assertEquals(expectedCase.getDescriptionCase(),actualCase.getDescriptionCase());
        assertEquals(expectedCase.getImportanceCase(),actualCase.getImportanceCase());
        assertEquals(expectedCase.isStatusCompletionCase(),actualCase.isStatusCompletionCase());
    }
}
