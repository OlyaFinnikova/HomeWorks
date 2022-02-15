package part5.unit2;

public class TeaWithMilk implements IDrinkWithMilk{
    /**
     * @return Стоимость чая с молоком
     */
    @Override
    public int calculateCostDrink() {
        return 8+5;
    }
}
