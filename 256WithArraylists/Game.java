import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList; //import the ArrayList class
import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class Multiple here.
 *
 * @author ZxIE0018
 * @version 1.0.1
 */
public class Game
{
    private int GameTotal;
    private String playName;
    


    public Game()
    {
        menu();

    }

    public void menu() {
        String menu = ("Please select from the following options\n"
        + "1. Start new Game\n" + "2. High Score\n"
        + "3. Exit\n");
        
        System.out.println(menu);
        
        int i;
        Scanner sc = new Scanner(System.in);
        
        if(sc.hasNextInt()) {
            i = sc.nextInt();
            
            switch(i) {
                case 1: {
                    start();
                }
                case 2: {
                    highScore();
                }
                case 3: {
                    System.out.println("Pressing 3\nExit now");
                    System.exit(0);
                }
                default: {
                    System.out.println("Please enter correct number");
                }
            }
        }
        
    }
    
    public void start() {
        cls();
        System.out.println("Start game now!");
        Buffer buffer = new Buffer();
        System.out.println("Building buffer now");
        buffer.show();
        
        String[] arr = loadMultiple();
        System.out.println("Loading the multiple file");
        
        GameTotal = 0;
        
        do {
            System.out.println("Random now");
            GameTotal = RandomNum(arr);
            
            System.out.println(GameTotal);
            if(!buffer.isEqual(GameTotal) && buffer.getElement() == 5) {
                System.out.println("Game over");
            } else {
                System.out.println("Game continue..");
                chooseMenu();
                choose(buffer, GameTotal);
                
                buffer.show();
                
                
            }
            
            
        }while(!buffer.isFull());
        
    }
    

    public void choose(Buffer bf, int GameValue) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("slipt GameTotal to buffer");
            bf.split(GameValue);
        } else if (num == 2) {
            System.out.println("Merge GameTotal with one Multiple in buffer");
        } else {
            System.out.println("Wrong input");
        }
        
    }
    
    public void chooseMenu() {
        String menu = ("Please select from the following options\n"
        + "1. Slipt\n" + "2. Merge\n");
        
        System.out.println(menu);
    }
    
    public String[] loadMultiple() {
        String pathname = "multiples.txt";
        try{
            FileReader fr = new FileReader(pathname);
            BufferedReader br = new BufferedReader(fr);
            
            String line = "";
            while((line = br.readLine()) != null) {
                String[] arr = line.split("\\,");
                
                // for(int i = 0; i < arr.length; i++) {
                    // System.out.println(arr[i]);
                // }
                
                return arr;

            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }    
        
        return null;
    }
    
    public int RandomNum(String[] list) {
        int result;
        
        int randomIndex = (int) (Math.random() * list.length);        
        result = Integer.parseInt(list[randomIndex]);
        
        return result;
    }    
    
    
    public void highScore() {
    }
    //Clear screen at method call
    //Printing a formfeed character (unicode 000C) clears the BlueJ terminal
    //for example: System.out.print('\u000C');
    public static void cls(){
        System.out.print('\u000C');
    }

}
