package part5.unit2;

public class CoffeeWithMilkCinnamon implements IDrinkWithMilkCinnamon{
    /**
     * @return Стоимость кофе с молоком и корицей
     */
    @Override
    public int calculateCostDrink() {
        return 10+5+2;
    }
}
