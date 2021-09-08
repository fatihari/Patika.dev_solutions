package main;
/**
 *  @author Fatih ARI - 08.09.2021
 */
import normalAreas.Armor;
import normalAreas.Weapon;

public class ItemBox {
    private Weapon weapon;
    private Armor armor;
    private Badge badge;

    public ItemBox() {
        this.weapon = new Weapon(0, "Fist", 0, 0);
        this.armor = new Armor(0, "Clothes", 0, 0);
        this.badge = new Badge();        
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return this.armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Badge getBadge() {
        return this.badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }


}
