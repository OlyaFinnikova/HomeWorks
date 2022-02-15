package part5.unit2;

import org.junit.Assert;
import org.junit.Test;

public class CreatingDrinkTest {
    @Test
    public void start(){
        CreatingDrink creatingDrink = new CreatingDrink();
        int expected = 13;
        int actual = creatingDrink.calculateCostDesiredDrink(creatingDrink.createCoffeeOrTea("чай с молоком"),"чай с молоком");
        Assert.assertEquals(expected,actual);
    }
}
