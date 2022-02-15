package part5.unit2;
/**
 * Считает стоимость напитка
 */
public class CreatingDrink {

    private UserValue user = new UserValue();

    public int start() {
        String userValue = user.getUserValue();
        return calculateCostDesiredDrink(createCoffeeOrTea(userValue),userValue);
    }
    /**
     * Определяет кофе или чай
     *
     * @param userValue значение пользователя
     * @return чай или кофе
     */
    public ICoffeeMachine createCoffeeOrTea(String userValue) {
        if (userValue.equals(user.tea) || userValue.equals(user.teaMilk)
                || userValue.equals(user.teaMilkCinnamon)) {
            return new Tea();
        } else {
            return new Coffee();
        }
    }
    /**
     * Определяет какие ингредиенты в кофе или чае
     *
     * @param userValue значение пользователя
     * @param machine кофе или чай
     * @return стоимость напитка
     */
    public int calculateCostDesiredDrink(ICoffeeMachine machine, String userValue) {
        if (userValue.equals(user.tea) || userValue.equals(user.coffee)) {
            return machine.createDrink().calculateCostDrink();

        } else if (userValue.equals(user.teaMilk) || userValue.equals(user.coffeeMilk)) {
            return machine.createDrinkWithMilk().calculateCostDrink();

        } else if (userValue.equals(user.teaMilkCinnamon) || userValue.equals(user.coffeeMilkCinnamon)) {
            return machine.createDrinkWithMilkCinnamon().calculateCostDrink();
        }
        return 0;
    }
}