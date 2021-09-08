package normalAreas;
/**
 *  @author Fatih ARI - 08.09.2021
 */
public class Weapon {
    private int id;
    private String type;
    private int damage;
    private int coin;


    public Weapon(int id, String type, int damage, int coin) {
        this.id = id;
        this.type = type;
        this.damage = damage;
        this.coin = coin;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCoin() {
        return this.coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
    
}
