package edu.zxie0018;

import static org.junit.Assert.assertTrue;

import edu.zxie0018.MathClass.Rational;
import edu.zxie0018.Matrix.GenericMatrix;
import edu.zxie0018.Matrix.IntegerMatrix;
import edu.zxie0018.Matrix.RationalMatrix;
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
    public void testIntegerMatrix() {
        Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
        Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};

        IntegerMatrix integerMatrix = new IntegerMatrix();

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');

        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
    }

    @Test
    public void testRationalMatrix() {
        Rational[][] m1 = new Rational[3][3];
        Rational[][] m2 = new Rational[3][3];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = new Rational(i + 1, j + 5);
                m2[i][j] = new Rational(i + 1, j + 6);
            }
        }

        RationalMatrix rationalMatrix = new RationalMatrix();

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, rationalMatrix.addMatrix(m1, m2), '+');

        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1, m2, rationalMatrix.multiplyMatrix(m1, m2), '*');
    }
}
