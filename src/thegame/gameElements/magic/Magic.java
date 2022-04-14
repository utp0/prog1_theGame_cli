package thegame.gameElements.magic;

import thegame.errors.ExceptionUnsupported;
import thegame.gameElements.Player;
import thegame.gameElements.Position;
import thegame.gameElements.unit.UnitCell;

public abstract class Magic {
    public String name = null;
    public Integer price = null;
    public Integer mana = null;

    public Magic(String name, Integer price, Integer mana) {
        this.name = name;
        this.price = price;
        this.mana = mana;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMana() {
        return this.mana;
    }

    public abstract void execute(Player player, Position pos) throws ExceptionUnsupported;
    public abstract void execute(Player player, UnitCell uc, Position pos) throws ExceptionUnsupported;
}
