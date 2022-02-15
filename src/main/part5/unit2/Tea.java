package part5.unit2;
/**
 * Виды чая
 */
public class Tea implements ICoffeeMachine {
    /**
     * @return Обычный чай
     */
    @Override
    public IDrink createDrink() {
        return new TeaOrdinary();
    }
    /**
     * @return Чай с молоком
     */
    @Override
    public IDrinkWithMilk createDrinkWithMilk() {
        return new TeaWithMilk();
    }
    /**
     * @return Чай с молоком и корицей
     */
    @Override
    public IDrinkWithMilkCinnamon createDrinkWithMilkCinnamon() {
        return new TeaWithMilkCinnamon();
    }
}
