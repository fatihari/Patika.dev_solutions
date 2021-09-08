package main;
/**
 *  @author Fatih ARI - 08.09.2021
 */
public class Player 
{
    private String name;
    private Stat stat;

    public Player(String name)
    {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stat getStat() {
        return this.stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }
}
