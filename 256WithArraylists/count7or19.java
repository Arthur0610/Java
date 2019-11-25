
/**
 * Write a description of class count7or19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class count7or19
{

    public static void count7or19()
    {
        long startTime1=System.currentTimeMillis();   //获取开始时间  
        forloop();  //测试的代码段  
        long endTime1=System.currentTimeMillis(); //获取结束时间  
        System.out.println("程序运行时间1： "+(endTime1-startTime1)+"ms");
        
        long startTime2=System.currentTimeMillis();   //获取开始时间  
        whileloop();  //测试的代码段  
        long endTime2=System.currentTimeMillis(); //获取结束时间  
        System.out.println("程序运行时间2： "+(endTime2-startTime2)+"ms");
        
        System.out.println(forloop());
        System.out.println(whileloop());
    }
    
    public static int forloop() {
        int countfor = 0;
        long range = 1000000000;
        for(long i = 7; i < range; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                countfor++;
            }
        }
        return countfor;
    }
    
    public static int whileloop() {
        int countwhile = 0;
        long i = 7;
        while(i < 1000000000) {
            if (i % 7 == 0 && i % 19 == 0) {
                countwhile++;
            }
            i++;
        }
        
        
        return countwhile;
    }
}
