package main;
/**
 *  @author Fatih ARI - 08.09.2021
 */
public class Badge 
{
    private boolean food;
    private boolean firewood;
    private boolean water;

    public Badge()
    {
        this.food = false;
        this.firewood = false;
        this.water = false;
    }

    public boolean isFood() {
        return this.food;
    }

    public boolean getFood() {
        return this.food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return this.firewood;
    }

    public boolean getFirewood() {
        return this.firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public boolean isWater() {
        return this.water;
    }

    public boolean getWater() {
        return this.water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }


}
