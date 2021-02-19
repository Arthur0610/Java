package edu.zxie0018;

import static org.junit.Assert.assertTrue;

import edu.zxie0018.Matrix.ComplexMatrix;
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
    public void testRationalMatrix() {
        Object[][] m1 = new Object[][]{{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {1.1, 1.1, 1.1}};
        Object[][] m2 = new Object[][]{{1.1, 1.1, 1.1}, {2.2, 2.2, 2.2}, {0, 0, 0}};

        ComplexMatrix complexMatrix = new ComplexMatrix();

        System.out.println("\nm1 + m2 is ");
        complexMatrix.printResult(m1, m2, complexMatrix.addMatrix(m1, m2), '+');

        System.out.println("\nm1 * m2 is ");
        complexMatrix.printResult(m1, m2, complexMatrix.multiplyMatrix(m1, m2), '*');
    }
}
