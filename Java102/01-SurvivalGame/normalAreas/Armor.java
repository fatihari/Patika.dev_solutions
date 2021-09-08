package normalAreas;
/**
 *  @author Fatih ARI - 08.09.2021
 */
public class Armor {
    
    private int id;
    private String type;
    private int block;
    private int coin;


    public Armor(int id, String type, int block, int coin) {
        this.id = id;
        this.type = type;
        this.block = block;
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

    public int getBlock() {
        return this.block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getCoin() {
        return this.coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }


}
