package normalAreas;
/**
 *  @author Fatih ARI - 08.09.2021
 */
import main.Player;

public class SafeHouse extends main.Place 
{
    public SafeHouse(Player player) {
        super(player ,0, "Safe House", "-", "-", "\tReneval");
    }

    @Override
    public boolean inThisPlace()
    {
        System.out.println("The player's health is regenerated. \nThe player's health has been completely regenerated! ");
        this.getPlayer().getStat().setHealth(this.getPlayer().getStat().getDefaultPlayerHealth());
        if(super.getPlayer().getStat().getItemBox().getBadge().getFood() == true 
                        && super.getPlayer().getStat().getItemBox().getBadge().getFirewood() == true 
                        && super.getPlayer().getStat().getItemBox().getBadge().getWater() == true)
        {
            System.out.println("Congratulations! You have earned all badges. \nYou have successfully completed the challenging \"Survival Game!\"");
            System.out.println("---------------------------------------------------------------");
            System.out.println("------------------------------END------------------------------");
            System.out.println("---------------------------------------------------------------");
            return false;
        }
    
        return true;
    }
}
