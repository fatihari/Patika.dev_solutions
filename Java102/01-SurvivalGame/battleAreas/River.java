package battleAreas;
/**
 *  @author Fatih ARI - 08.09.2021
 */
import main.Bear;
import main.Player;

public class River extends Battleground{

    public River(Player player) {
        super(player, 3, "River", new Bear(), "Water", "\tBattle", 2);
    }
}