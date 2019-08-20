
/**
 * Write a description of class Tile here.
 *
 * @author Zhenkun Xie
 * @version 1.1.1
 */
public class Tile
{
    private int score;
    private int value;
    
    public Tile(int value, int score){
        this.score = score;
        this.value = value;
    }
    
    
    public int getValue(){
        return value;
    }
    
    public int getScore(){
        return score;
    }
    
    public void showTile(){
        System.out.println("This tile value is " + value + ", and score is " + score);
    }
    
}
