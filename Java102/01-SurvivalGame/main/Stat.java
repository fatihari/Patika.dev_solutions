package main;
/**
 *  @author Fatih ARI - 08.09.2021
 */
public abstract class Stat 
{
    private int id;
    private String type;
    private int damage;
    private int health;
    private int coin;
    private ItemBox itemBox;
    private int defaultMonsterHealth;
    private int defaultPlayerHealth;

    public Stat(int id, String type, int damage, int health, int coin) {
        this.setId(id);
        this.setType(type);
        this.setDamage(damage);
        this.setHealth(health);
        this.defaultMonsterHealth = health;
        this.defaultPlayerHealth = health;
        this.setCoin(coin);
        this.itemBox = new ItemBox();
    }

    public void printPlayer()
    {  
        System.out.println("==============================================PLAYER STATS==============================================");
        System.out.println("|#-Hero\t\tDamage\t\tBlock\t\tHealth\t\tMoney\t\tWeapon\t\tArmor  |");
        System.out.println("|#--------\t------\t\t-----\t\t------\t\t-----\t\t------\t\t-------|");
        System.out.println("|"+this.getId()+"-"+ this.getType() + "\t  " + this.getTotalDamage() + "\t\t  " + this.itemBox.getArmor().getBlock() + "\t\t  " + this.getTotalHealth() + "\t\t  " + this.getCoin() + "\t\t" + this.getItemBox().getWeapon().getType()+ "\t\t" + this.getItemBox().getArmor().getType() + "|");
        System.out.println("========================================================================================================");
    }
    public void printMonster()
    {  
        System.out.println("==========================MONSTER STATS==========================");
        System.out.println("|#-Hero\t\tDamage\t\tHealth\t\tMoney\t\t|");
        System.out.println("|#--------\t------\t\t------\t\t-----\t\t|");
        System.out.println("|"+this.getId()+"-"+ this.getType() + "\t  " + this.getDamage() + "\t\t" + this.getHealth() + "\t\t  " + this.getCoin() + "\t\t" + "|");
        System.out.println("=================================================================");
    }

    public int hit(Stat creatureWhoTakesTheHit) {
        System.out.println("---------------------------");
        System.out.println(this.getType() + " deals " + this.getDamage() + " damage to " + " => " + creatureWhoTakesTheHit.getType());

        if (creatureWhoTakesTheHit.getHealth() - this.getDamage() < 0)
            return 0;

        return creatureWhoTakesTheHit.health - this.getDamage();
    }

    public int getTotalDamage() {
        return this.damage + this.getItemBox().getWeapon().getDamage();
    }

    public int getTotalHealth() {
        return this.health + this.getItemBox().getArmor().getBlock();
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

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return this.coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public ItemBox getItemBox() {
        return this.itemBox;
    }

    public void setItemBox(ItemBox itemBox) {
        this.itemBox = itemBox;
    }

    public int getDefaultMonsterHealth() {
        return this.defaultMonsterHealth;
    }

    public void setDefaultMonsterHealth(int defaultMonsterHealth) {
        this.defaultMonsterHealth = defaultMonsterHealth;
    }

    public int getDefaultPlayerHealth() {
        return this.defaultPlayerHealth;
    }

    public void setDefaultPlayerHealth(int defaultPlayerHealth) {
        this.defaultPlayerHealth = defaultPlayerHealth;
    }



}
