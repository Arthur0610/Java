import java.util.ArrayList; //import the ArrayList class

/**
 * Write a description of class Multiple here.
 *
 * @author ZxIE0018
 * @version 1.0.1
 */
public class Buffer
{
    // instance variables - replace the example below with your own
    private ArrayList<Multiple> buffer;
    private int maxElements;

    /**
     * Constructor for objects of class Buffer
     */
    public Buffer()
    {
        buffer = new ArrayList<Multiple>();
        maxElements = 0;
    }

    public void split(int Value) {
        if(maxElements < 6) {
            Multiple multiple = new Multiple(Value);
            buffer.add(multiple);
            maxElements++;
        } else {
            System.out.println("buffer is full now!");
        }
    }
    
    public void merge(int matchValue) {
        
    }
    
    public void show() {
        if(buffer.size() == 0) {
            System.out.println("Now the buffer is free");
        } else {
            System.out.println("the size of buffer: " + buffer.size());
            System.out.print("Buffer owns: ");
            for(int i = 0; i < buffer.size(); i++) {
                System.out.print(buffer.get(i).getValue() + " ");
            }
        }
    }
    
    public boolean isFull() {
        boolean flag = false;
        
        if(maxElements == 5) {
            flag = true;
        }
        
        return flag;
    }
    
    public boolean isEqual(int Value) {
        boolean flag = false;
        
        for(int i = 0; i < buffer.size(); i++) {
            if(buffer.get(i).getValue() == Value) {
                flag = true;
            }
        }
        
        return flag;    
    }
   
    public int getElement() {
        return maxElements;
    }
}
