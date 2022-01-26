package part2.unit1;

public class Main {

    public static void main(String[] args) {
        Human emptyHuman = new Human();
        Human human = new Human("Oleg", "Olegov", "Olegovich", 15);
        System.out.println("emptyHuman: " + emptyHuman.toString());
        System.out.println("human: " + human.toString());
    }
}
