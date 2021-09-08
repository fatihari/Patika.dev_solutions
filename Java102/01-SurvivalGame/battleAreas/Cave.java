package battleAreas;
/**
 *  @author Fatih ARI - 08.09.2021
 */

import main.Player;
import main.Zombie;

public class Cave extends Battleground{

    public Cave(Player player) {
        super(player, 1, "Cave  ", new Zombie(), "Food", "\tBattle", 3);
    }
}
