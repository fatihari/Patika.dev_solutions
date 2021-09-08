package battleAreas;
/**
 *  @author Fatih ARI - 08.09.2021
 */
import main.Player;
import main.Vampire;

public class Forest extends Battleground{

    public Forest(Player player) {
        super(player, 2, "Forest", new Vampire(), "Firewood", "Battle", 3);
    }
}