import java.util.Scanner;
import java.lang.Math;


public class DDegree
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DDegree
     */
    public void DDegree()
    {
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < length; i++) {
            System.out.println("");
            for(int j = 0; j < i; j++) {
                System.out.print("*");
                sum++;
            }
        }
 
        System.out.println(sum);
    }
    
    
    public boolean isLive() {
        boolean flag = false;
        if(((Math.random()*10) % 2)  != 0) {
            flag = true;
        }
        return flag;
    }
}
