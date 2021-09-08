package battleAreas;

/**
 *  @author Fatih ARI - 08.09.2021
 */

import java.util.Random;
import main.Monster;
import main.Place;
import main.Player;
import main.Stat;

public abstract class Battleground extends Place {

    private int maxMonster;
    private Stat playerStat;
    private Stat monsterStat;
    private Monster monster;
    private int monsterNumber;

    public Battleground(Player player, int id, String type, Stat stat, String item, String feature, int maxMonster) {
        super(player, id, type, stat.getType(), item, feature);
        this.maxMonster = maxMonster;
        this.monsterStat = stat;
        this.playerStat = super.getPlayer().getStat();
    }

    @Override
    public boolean inThisPlace() 
    {
        this.setMonsterNumber(this.generateRndMonster());
        System.out.println("============DANGEROUS PLACE!===========\nBe careful! There are "+ this.getMonsterNumber() + " " + super.getMonsterType() + " in this "+ super.getType());
        System.out.print("<F>ight or <R>un away: ");
        String inputString = input.nextLine();
        inputString = inputString.toUpperCase();
        if (inputString.equals("F"))
        {
            System.out.println("The fight has began.");
            combat();
        }
        if(playerStat.getHealth() <= 0)
        {
            System.out.println("You are dead!\n-----------------------------\n----------GAME OVER----------\n-----------------------------");
            return false;
        }

        return true;
    }

    private void combat() 
    {
        for (int i = 0; i < this.getMonsterNumber(); i++) 
        {
            this.monsterStat.setHealth(monsterStat.getDefaultMonsterHealth());
            int count = 1;
            while (playerStat.getHealth() > 0 && monsterStat.getHealth() > 0) 
            {
                System.out.println("\n======== MONSTER-" + (i+1) + " / ROUND-" + count + "===========");

                this.playerStat.printPlayer();
                this.monsterStat.printMonster();

                if (count == 1) // If Round 1,
                    firstHit();

                if (count > 1) {
                    monsterStat.setHealth(playerStat.hit(monsterStat));
                    if (isWin()) {
                        break;
                    }
                    playerStat.setHealth(monsterStat.hit(playerStat));
                    if (isWin()) {
                        break;
                    }
                }
                count++;
            }
            if(playerStat.getHealth()>0)
            {
                playerStat.setCoin(playerStat.getCoin() + monsterStat.getCoin());
                System.out.println("You have won " + monsterStat.getCoin() + " coin.");
            } 
        }
        badgeControl();
    }

    private void badgeControl() 
    {
        if(playerStat.getHealth() > 0)
        {
            System.out.println("You beat all the " + monsterStat.getType() + "s in the " + super.getType());
            if(playerStat.getItemBox().getBadge().getFood() == false && super.getItem().equals("Food"))
            {
                System.out.println("Bravo!! Congratulations! You've earned a \"Food\" badge! ");
                playerStat.getItemBox().getBadge().setFood(true);
            }
            else if(playerStat.getItemBox().getBadge().getFirewood() == false && super.getItem().equals("Firewood"))
            {
                System.out.println("Bravo!! Congratulations! You've earned a \"Firewood\" badge! ");
                playerStat.getItemBox().getBadge().setFirewood(true);
            }
            else if(playerStat.getItemBox().getBadge().getWater() == false && super.getItem().equals("Water"))
            {
                System.out.println("Bravo!! Congratulations! You've earned a \"Water\" badge! ");
                playerStat.getItemBox().getBadge().setWater(true);
            }
        }
    }

    private void firstHit() {
        if (firstHitChange()) // Firstly, monster hit.
        {
            System.out.println("\n" + this.monsterStat.getType() + " performs the first hit in the match! \n");
            this.playerStat.setHealth(this.monsterStat.hit(this.playerStat));
            this.monsterStat.setHealth(this.playerStat.hit(this.monsterStat));
        } else // Firstly, player hit.
        {
            System.out.println("\n" + this.playerStat.getType() + " performs the first hit in the match! \n");
            this.monsterStat.setHealth(this.playerStat.hit(this.monsterStat));
            this.playerStat.setHealth(this.monsterStat.hit(this.playerStat));
        }
    }

    private boolean firstHitChange() {
        Random rnd = new Random();
        int number = rnd.nextInt(2);
        if (number == 0) // If number is 0 or false, firstly, player hit.
            return false;
        else // If number is 1 or false, firstly, monster hit.
            return true;
    }

    public boolean isWin() {
        if (this.playerStat.getHealth() == 0) {
            System.out.println("\nThe winner is : " + this.monsterStat.getType());
            return true;
        } else if (this.monsterStat.getHealth() == 0) {
            System.out.println("\nThe winner is : " + this.playerStat.getType());
            return true;
        }
        return false;
    }

    public int generateRndMonster()
    {
        return ((int)(Math.random() * maxMonster)+1);
    }

    public int getMaxMonster() {
        return this.maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }


    public Stat getPlayerStat() {
        return this.playerStat;
    }

    public void setPlayerStat(Stat playerStat) {
        this.playerStat = playerStat;
    }

    public Stat getMonsterStat() {
        return this.monsterStat;
    }

    public void setMonsterStat(Stat monsterStat) {
        this.monsterStat = monsterStat;
    }

    public int getMonsterNumber() {
        return this.monsterNumber;
    }

    public void setMonsterNumber(int monsterNumber) {
        this.monsterNumber = monsterNumber;
    }
   
    public Monster getMonster() {
        return this.monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

}
