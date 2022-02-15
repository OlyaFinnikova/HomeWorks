package part5.unit2;

public class CoffeeWithMilk implements IDrinkWithMilk {
    /**
     * @return Стоимость кофе с молоком
     */
    @Override
    public int calculateCostDrink() {
        return 10+5;
    }
}
