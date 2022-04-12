package thegame.gameElements;

public class Griffin extends Unit {
    static int price = 15;
    static int damageMin = 5;
    static int damageMax = 10;
    static int health = 30;
    static int speed = 7;
    static int initiative = 15;
    static String letter = "G";
    static String name = "Griff";

    public Griffin() {
        super(price, damageMin, damageMax, health, speed, initiative, letter, name);
    }
}