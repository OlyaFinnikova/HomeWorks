package part3.unit2;

import org.junit.Assert;
import org.junit.Test;

public class FieldTest {
    Field field = new Field();

    @Test
    public void checkCounterTest() {
        Assert.assertEquals(2, field.checkLive(getCellMatrix(), 1, 1));
    }

    @Test
    public void checkEndTest() {
        Assert.assertTrue(field.checkEnd(getEndCellMatrix()));
    }

    private Cell[][] getEndCellMatrix() {
        Cell[][] cell = new Cell[3][3];
        cell[0][0] = new Cell(false);
        cell[1][0] = new Cell(false);
        cell[2][0] = new Cell(false);
        cell[0][1] = new Cell(false);
        cell[1][1] = new Cell(false);
        cell[2][1] = new Cell(false);
        cell[0][2] = new Cell(false);
        cell[1][2] = new Cell(false);
        cell[2][2] = new Cell(false);
        return cell;
    }

    private Cell[][] getCellMatrix() {
        Cell[][] cell = new Cell[3][3];
        cell[0][0] = new Cell(false);
        cell[1][0] = new Cell(false);
        cell[2][0] = new Cell(false);
        cell[0][1] = new Cell(true);
        cell[1][1] = new Cell(false);
        cell[2][1] = new Cell(true);
        cell[0][2] = new Cell(false);
        cell[1][2] = new Cell(false);
        cell[2][2] = new Cell(false);
        return cell;
    }
}



