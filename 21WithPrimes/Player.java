import java.util.Arrays;

/**
 * @author ZxIE0018  
 * @version 1.1.1
 */
public class Player
{
    private String name;
    private int score;
    private Tile[] tiles;
    private Tile lastTilePlayed;
    private int roundsWon;
    
    //
    Tile TileA = new Tile(1,5);
    Tile TileB = new Tile(2,4);
    Tile TileC = new Tile(3,3);
    Tile TileD = new Tile(5,2);
    Tile TileE = new Tile(7,1);
    
    public Player(){
        name = "XXXXXX";
        score = 0;
        tiles = new Tile[]{TileA, TileB, TileC, TileD, TileE};
        lastTilePlayed = null;
        roundsWon = 1;
    }
    
    public Player(String name){
        this.name = name;
        score = 0;
        tiles = new Tile[]{TileA, TileB, TileC, TileD, TileE};
        lastTilePlayed = null;
        roundsWon = 1;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Tile[] getTiles(){
        return tiles;
    }
    
    public Tile getLastTilePlayed(){
        return lastTilePlayed;
    }
    
    // show the each tile in hand righ now
    public void show(){
        System.out.println("Name: " + name + ", score = " + score);
        System.out.print("Player own " + tiles.length + " Tile(s) include: {");
        for(int i = 0; i < tiles.length - 1; i++) {
            System.out.print(tiles[i].getValue() + ", ");
        }
        System.out.print(tiles[tiles.length - 1].getValue());
        System.out.println("}.");
    }
    
    public void play(int tileNum){
        // record the tileNum tile to lastTilePlayed
        lastTilePlayed = tiles[tileNum];
        System.out.println("Playing number " + lastTilePlayed.getValue() + " Tile!");
        
        // exchange the tileNum element to the end element of the list
        tiles[tileNum] = tiles[tiles.length - 1];
        
        // delete the last end element 
        // and make new one Tile[] list with out last one(length = older - 1)
        Tile[] tempTiles = Arrays.copyOf(tiles, tiles.length - 1);
        tiles = tempTiles;
    }
    
    
    public void sort(int starKey){
        Tile temp = tiles[starKey];
        for(int i = starKey; i < tiles.length -1; i++) {
            tiles[i] = tiles[i + 1];
        }
        tiles[tiles.length - 1] = temp; 
    }
}
