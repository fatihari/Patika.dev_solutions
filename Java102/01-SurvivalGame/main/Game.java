package main;
/**
 *  @author Fatih ARI - 08.09.2021
 */

import java.util.Scanner;
import battleAreas.Cave;
import battleAreas.Forest;
import battleAreas.River;
import normalAreas.Blacksmith;
import normalAreas.SafeHouse;

public class Game 
{
    private Player player; //1=Samurai, 2=Archer, 3=Knight
    private Place place; //0=SafeHouse, 1=Cave, 2=Forest, 3=River, 4=Blacksmith
    private Scanner input;
    private int key;
    public void start()
    {
        this.input = new Scanner(System.in);
        System.out.print("Welcome to Survival Game!\nEnter a name for your hero: ");
        System.out.println("");
        player = new Player(input.nextLine().toUpperCase());
        selectHero();
        do {
            this.player.getStat().printPlayer();
            selectPlace();
        } while (this.getPlace().inThisPlace());
        
    }
    private void selectHero()
    {
        System.out.println("=========================================================");
        Stat[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("|#-Hero\t\tDamage\t\tHealth\t\tMoney\t|");
        System.out.println("|#--------\t------\t\t------\t\t-----\t|");
        for (Stat stat : charList) 
        {
            System.out.println("|"+stat.getId()+"-"+ stat.getType() + "\t  " + stat.getDamage() + "\t\t  " + stat.getHealth() + "\t\t  " + stat.getCoin()+ "\t|");
        }
        System.out.println("=========================================================");
        System.out.print("\nDone. Sir "+ player.getName() + ", please select your hero: ");
        this.key = input.nextInt();
        switch (this.key) {
            case 1:
                player.setStat(new Samurai());
                break;
            case 2:
                player.setStat(new Archer());
                break;
            case 3:
                player.setStat(new Knight());
                break;
        
            default:
                System.out.println("You made the wrong choice.");
                break;
        }
    }

    private void selectPlace()
    {
        System.out.println("=========================================================");
        Place[] placeList = {new SafeHouse(player), new Cave(player), new Forest(player), new River(player), new Blacksmith(player)};
        System.out.println("|#-Place\tMonster\t\tBadge\t\tFeature\t|");
        System.out.println("|#--------\t-------\t\t--------\t-----\t|");
        for (Place place : placeList) 
        {
            System.out.println("|"+place.getId()+"-"+ place.getType() + "\t" + place.getMonsterType() + "\t\t" + place.getItem() + "\t" + place.getFeature()+ "\t|");
        }
        System.out.println("=========================================================");
        System.out.print("\nSir "+ player.getStat().getType() + " " + player.getName() + ", Please choose the place you want to go : ");
        this.key = input.nextInt();
        switch (this.key) {
            case 0:
                this.setPlace(new SafeHouse(player));
                break;
            case 1:
                this.setPlace(new Cave(player));
                break;
            case 2:
                this.setPlace(new Forest(player));
                break;
            case 3:
                this.setPlace(new River(player));
                break;
            case 4:
                this.setPlace(new Blacksmith(player));
                break;
        
            default:
                System.out.println("You made the wrong choice.");
                break;
        }
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Place getPlace() {
        return this.place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Scanner getInput() {
        return this.input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

}