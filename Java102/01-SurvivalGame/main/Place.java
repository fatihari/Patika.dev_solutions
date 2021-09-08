package main;
/**
 *  @author Fatih ARI - 08.09.2021
 */
import java.util.Scanner;

public abstract class Place 
{
    private Player player;
    private int id;
    private String type;
    private String monsterType;
    private String item;
    private String feature;
    protected Scanner input;

    public Place(Player player, int id, String type, String monsterType, String item, String feature) {
        this.player = player;
        this.id = id;
        this.type = type;
        this.monsterType = monsterType;
        this.item = item;
        this.feature = feature;
        this.input = new Scanner(System.in);
    }

    public abstract boolean inThisPlace();

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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


    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }


    public String getMonsterType() {
        return this.monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public Scanner getInput() {
        return this.input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

}
