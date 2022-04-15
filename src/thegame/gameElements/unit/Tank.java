package thegame.gameElements.unit;

public class Tank extends Unit {
    public static int price = 10;
    public static int damageMin = 0;
    public static int damageMax = 1;
    public static int health = 42;
    public static int speed = 3;
    public static int initiative = 8;
    public static String letter = "D";
    public static String name = "Dagadék";

    public Tank() {
        super(price, damageMin, damageMax, health, speed, initiative, letter, name);
    }

    @Override
    public void afterHit(UnitCell damagerUc) {

    }
}