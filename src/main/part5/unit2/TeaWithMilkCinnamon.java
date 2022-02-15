package part5.unit2;

public class TeaWithMilkCinnamon implements IDrinkWithMilkCinnamon{
    /**
     * @return Стоимость чая с молоком и корицей
     */
    @Override
    public int calculateCostDrink() {
        return 8+5+2;
    }
}
