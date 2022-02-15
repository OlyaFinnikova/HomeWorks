package part5.unit2;
/**
 * "Кофейный автомат" для видов напитка:кофе или чай
 */
public interface ICoffeeMachine {
 IDrink createDrink();
 IDrinkWithMilk createDrinkWithMilk();
 IDrinkWithMilkCinnamon createDrinkWithMilkCinnamon();

}
