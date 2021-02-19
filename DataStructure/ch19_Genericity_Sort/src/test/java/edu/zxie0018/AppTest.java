package edu.zxie0018;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void test1() {
        Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};

        GenericSort.sort(intArray);
        GenericSort.printList(intArray);
    }

    @Test
    public void test2() {
        Double[] doubleArray = {new Double(2.8), new Double(1.3), new Double(-22.1)};

        GenericSort.sort(doubleArray);
        GenericSort.printList(doubleArray);
    }

    @Test
    public void test3() {
        Character[] charArray = {new Character('a'), new Character('J'), new Character('r')};

        GenericSort.sort(charArray);
        GenericSort.printList(charArray);
    }
    @Test
    public void test4() {
        String[] strArray = {new String("Tom"), new String("Susan"), new String("Kim")};

        GenericSort.sort(strArray);
        GenericSort.printList(strArray);
    }
}
