package normalAreas;
/**
 *  @author Fatih ARI - 08.09.2021
 */

import main.Player;
import normalAreas.armors.Heavy;
import normalAreas.armors.Light;
import normalAreas.armors.Medium;
import normalAreas.weapons.Gun;
import normalAreas.weapons.Rifle;
import normalAreas.weapons.Sword;

public class Blacksmith extends main.Place {

    private Weapon weapon;

    public Blacksmith(Player player) {
        super(player, 4, "Blacksmith", "-", "-", "\tBuy");
    }

    @Override
    public boolean inThisPlace() {
        System.out.print(
                "--------Welcome to Blacksmith!--------\nWhat do you want to buy?\n1-Weapon\n2-Armor\n3-Exit\nYour choice: ");
        int key;
        do {
            key = input.nextInt();
            if (key < 4 && key > 0)
                continue;

            System.out.print("You made the wrong choice. Please Choose again: ");
        } while (key > 3 || key < 1);

        switch (key) {
            case 1:
                printWeapon();
                break;
            case 2:
                printArmors();
                
                break;
            case 3:
                System.out.println("See you again! :)");
                return true;
            default:
                break;
        }
        return true;
    }

    private void printWeapon() 
    {
        System.out.println("\nThis is weapon menu");
        Weapon[] weaponList = { new Gun(), new Sword(), new Rifle() };
        System.out.println("============================");
        System.out.println("|#-Weapon    Damage    Coin|");
        System.out.println("|#-------    ------    ----|");
        for (Weapon weapon : weaponList) {
            System.out.println("|" + weapon.getId() + "-" + weapon.getType() + "       " + weapon.getDamage() + "\t"
                    + weapon.getCoin() + " |");
        }
        System.out.println("============================");
        buyWeapon(weaponList);
    }
    private void buyWeapon(Weapon [] weaponList)
    {
        int key;
        do {
            key = input.nextInt();
            if (key < 5 && key > 0)
                continue;
            System.out.print("You made the wrong choice. Please Choose again: ");
        } while (key > 4 || key < 1);

        if (weaponList[key - 1].getCoin() <= super.getPlayer().getStat().getCoin()) 
        {
            super.getPlayer().getStat().setCoin(super.getPlayer().getStat().getCoin() - weaponList[key - 1].getCoin());
            super.getPlayer().getStat().getItemBox().setWeapon(weaponList[key-1]);
            switch (key) {
                case 1:
                    System.out.println("You bought a gun");
                    break;
                case 2:
                    System.out.println("You bought a sword");
                    break;
                case 3:
                    System.out.println("You bought a rifle");
                    break;
                case 4:
                    System.out.println("See you again! :)");
                    break;
                default:
                    break;
            }
        } else
            System.out.println("You do not have enough coin.");
        System.out.println("Your coin: " + super.getPlayer().getStat().getCoin());
    }

    private void printArmors() {
        System.out.println("\nThis is armor menu");
        Armor[] armorList = { new Light(), new Medium(), new Heavy() };
        System.out.println("============================");
        System.out.println("|#-Weapon     Block    Coin|");
        System.out.println("|#-------     -----    ----|");
        for (Armor armor : armorList) {
            System.out.println("|" + armor.getId() + "-" + armor.getType() + "       " + armor.getBlock() + "\t"
                    + armor.getCoin() + " |");
        }
        System.out.println("============================");
        buyArmor(armorList);
    }
    private void buyArmor(Armor [] armorList)
    {
        int key;
        do {
            key = input.nextInt();
            if (key < 5 && key > 0)
                continue;
            System.out.print("You made the wrong choice. Please Choose again: ");
        } while (key > 4 || key < 1);

        if (armorList[key - 1].getCoin() <= super.getPlayer().getStat().getCoin()) 
        {
            super.getPlayer().getStat().setCoin(super.getPlayer().getStat().getCoin() - armorList[key - 1].getCoin());
            super.getPlayer().getStat().getItemBox().setArmor(armorList[key - 1]);

            switch (key) {
                case 1:
                    System.out.println("You bought the light armor");
                    break;
                case 2:
                    System.out.println("You bought the medium armor");
                    break;
                case 3:
                    System.out.println("You bought the heavy armor");
                    break;
                case 4:
                    System.out.println("See you again! :)");
                    break;
                default:
                    break;
            }
        } else
            System.out.println("You do not have enough coin.");
        System.out.println("Your coin: " + super.getPlayer().getStat().getCoin());
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
