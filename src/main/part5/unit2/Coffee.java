package part5.unit2;
/**
 * Виды кофе
 */
public class Coffee implements ICoffeeMachine {
    /**
     * @return Обычный кофе
     */
    @Override
    public IDrink createDrink() {
        return new CoffeeOrdinary();
    }
    /**
     * @return Кофе с молоком
     */
    @Override
    public IDrinkWithMilk createDrinkWithMilk() {
        return new CoffeeWithMilk();
    }
    /**
     * @return Кофе с молоком и корицей
     */
    @Override
    public IDrinkWithMilkCinnamon createDrinkWithMilkCinnamon() {
        return new CoffeeWithMilkCinnamon();
    }
}
