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
        String expression = "(1 + 3 * 3 - 2) * (12 / 6 * 5)";
        try {
            System.out.println(EvaluateExpression.evaluateExpression(expression));
        } catch (Exception ex) {
            System.out.println("Wrong expression: " + expression);
        }
    }

    @Test
    public void test2() {
        String expression = "(1 + 3 * 3 - 2) * (12 / 6 * 5) +";
        try {
            System.out.println(EvaluateExpression.evaluateExpression(expression));
        } catch (Exception ex) {
            System.out.println("Wrong expression: " + expression);
        }
    }

    @Test
    public void test3() {
        String expression = "(1 + 2) * 4 - 3";
        try {
            System.out.println(EvaluateExpression.evaluateExpression(expression));
        } catch (Exception ex) {
            System.out.println("Wrong expression: " + expression);
        }
    }
}
