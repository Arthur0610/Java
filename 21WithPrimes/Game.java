import java.util.Scanner;


/**
 * @author ZxIE0018
 * @version 1.1.1
 */
public class Game
{
    public static void main(String[] args){

        
        menu();
        
    }
    
    public static void menu(){
        int round = 1;
        int humanScore = 0;
        int botScore = 0;
        int totalValue = 0;
        

        Player Human = new Player();
        Player Bot = new Player();
        Bot.setName("Bot");
        // System.out.println("Please select from the following options");
        // System.out.println("Press 1 to register a player");
        // System.out.println("Press 2 to start a game");
        // System.out.println("Press 3 to view a help menu");
        // System.out.println("Press 4 to exit");
        
        
        String mainMenu = ("Please select from the following options\n"
                    + "Press 1to register a player\n"
                    + "Press 2 to start a game\n"
                    + "Press 3 to view a help menu\n"
                    + "Press 4 to exit\n");
        System.out.println(mainMenu);
        
        String helpPage = ("Help page");
        
        
        Scanner scan = new Scanner(System.in);
        int i = 0;
        i = scan.nextInt();
        
        while(i < 1 || i > 4) {
            cls();
            System.out.println("Please enter corrent number!! (1 ~ 4)");
            System.out.println("\n");
            System.out.println(mainMenu);
            i = scan.nextInt();
        }
        
        switch(i) {
             case 1: {
                 cls();
                 System.out.println("Pressing 1");
                 System.out.println("Please give a name for your player");
                 Scanner playerNameScan = new Scanner(System.in);
                 String playerName = playerNameScan.next();
                 if(playerName.length() > 2 || playerName.length() < 11){
                 register(Human, playerName);
                        
                 Human.show();
                 
                        
                 System.out.println("set player name =" + playerName);
                 } else {
                 System.out.println("Error: input name size should be 3 ~ 10 char");
                 }
                
                
                 break;
            }
             case 2: {
                 System.out.println("Pressing 2");
                 
                 startGame(Human, Bot, round, 0, 0, 0);
                    
                 break;
            }
             case 3: {
                 System.out.println("Pressing 3");
                 System.out.println(helpPage);
                 
                 break;
            }
             case 4: {
                 System.out.println("Pressing 4");
                 System.out.println("21 with Primes is closing now!");
                 System.exit(0);
                
                 break;
            }
             default: {
                 System.out.println("Please enter corrent number!!(1 ~ 4)");
            }           
        }
    }
    
    public static void register(Player player, String name){
        player.setName(name);
    }
    
    public static void startGame(Player Human, Player Bot,int round, int humanScore, int botScore, int totalValue){
        int roundRolled;
        roundRolled = roundRoll();
        
        System.out.println("Start Rolling!! RULE: Bot is 0, Human is 1");
        System.out.println("Rolling number is " + roundRolled);
        if(roundRolled == 1){
            System.out.println("Human first!");
            roundHumanFirst(Human, Bot, round, humanScore, botScore, totalValue);
        } else {
            System.out.println("Human first!");  //test-notfinishbotfirst
            roundHumanFirst(Human, Bot, round, humanScore, botScore, totalValue);  //test-notfinishbotfirst
            //System.out.println("Bot first!");
            //roundBotFirst(Human, Bot, round, humanScore, botScore, totalValue);
        }
    
    }
    
    public static int roundRoll(){
        int roundRolled;
        roundRolled = ((int)(10 * Math.random())) % 2;
        return roundRolled; 
    }
    
    public static void roundHumanFirst(Player Human, Player Bot, int round, int humanScore, int botScore, int totalValue){
        int tileNum;
        int tileHumanPlayed, tileBotPlayed;
        Tile[] humanTiles = Human.getTiles();
        Tile[] botTiles = Bot.getTiles();        
        
        //Human activity
        System.out.println("Now " + Human.getName() + " own " + humanTiles.length + " Tiles.");
        Human.show();
        System.out.println("Please choose one tile to play");
        
        Scanner tilePlayCan = new Scanner(System.in);
        tileHumanPlayed = tilePlayCan.nextInt();
        
        if(isInTilesList(tileHumanPlayed)){
            System.out.println("Right Play!!! " + tileHumanPlayed + " tile is playing!!");
            for(int i = 0; i < (6 - round); i++) {
                if(tileHumanPlayed == humanTiles[i].getValue()){
                    Human.play(i);

                }
            }
            
        
            humanScore += Human.getLastTilePlayed().getScore();
            totalValue += Human.getLastTilePlayed().getValue();
        
            humanReport(Human, humanScore, totalValue);
            
        } else {
            System.out.println("Wrong Play!!! No " + tileHumanPlayed + " tile in hand!!");
            tileHumanPlayed = tilePlayCan.nextInt();
        }
        

        
        //Bot activity
        System.out.println("Now " + Bot.getName() + " own " + botTiles.length + " Tiles.");
        System.out.println("BOT will automatically play one tile");
        
        Bot.play(1);
        botScore += Bot.getLastTilePlayed().getScore();
        totalValue += Bot.getLastTilePlayed().getValue();
        botReport(Bot, botScore, totalValue);
        
        // round++
        round++;
    }
    
    public static void roundBotFirst(Player Human, Player Bot, int round, int humanScore, int botScore, int totalValue){
        int tileHumanPlayed, tileBotPlayed;
        Tile[] humanTiles = Human.getTiles();
        Tile[] botTiles = Bot.getTiles();
        
        System.out.println("Now " + Bot.getName() + " own " + botTiles.length + " Tiles.");
        System.out.println("BOT will automatically play one tile");
        
        Bot.play(1);
        botScore += Bot.getLastTilePlayed().getScore();
        totalValue += Bot.getLastTilePlayed().getValue();
        botReport(Bot, botScore, totalValue);
        
        
        System.out.println("Now, it is " + Human.getName() + "'s turn: please choose one tile to play");
        
        Scanner tilePlayCan = new Scanner(System.in);
        tileHumanPlayed = tilePlayCan.nextInt();
        

        // round ++
        round++;
    }
    
    public static void humanReport(Player Human, int humanScore, int totalValue){
        System.out.println(Human.getName() + " player plays tile " + Human.getLastTilePlayed().getValue()
                + ". Game Total is " + totalValue + " now." + Human.getName() + "player score is "
                + humanScore);
    }
    
    public static void botReport(Player Bot, int botScore, int totalValue){
        System.out.println(Bot.getName() + " player plays tile " + Bot.getLastTilePlayed().getValue()
                + ". Game Total is " + totalValue + " now." + Bot.getName() + "player score is "
                + botScore);
    }
    
    //check the tileValue is in the tiles list in hand    
    public static boolean isInTilesList(int tileValue){
        int[] tilesList = new int[] {1, 2, 3, 5, 7};
        
        for(int i = 0; i < tilesList.length; i++){
            if(tilesList[i] == tileValue){
                return true;
            }
        }
        return false;
    }
    
    //Clear screen at method call
    //Printing a formfeed character (unicode 000C) clears the BlueJ terminal
    //for example: System.out.print('\u000C');
    public static void cls(){
        System.out.print('\u000C');
    }
}
