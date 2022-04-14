package thegame.gameElements.magic;

import thegame.errors.ExceptionUnsupported;
import thegame.gameElements.Player;
import thegame.gameElements.Position;
import thegame.gameElements.unit.UnitCell;

public class LightningBolt extends Magic{
    public static String name = "Villámcsapás";
    public static Integer price = 60;
    public static Integer mana = 5;

    public LightningBolt() {
        super(name, price, mana);
    }

    @Override
    public void execute(Player player, Position pos) throws ExceptionUnsupported {

    }

    @Override
    public void execute(Player player, UnitCell uc_which, Position toWhere) {

    }
}
