package edu.zxie0018;


public class App 
{
    public static void main( String[] args )
    {
        if(args.length != 1) {
            System.out.println("Usage: jave EvaluateExpression \"expression\"");
            System.exit(1);
        }

        try {
            System.out.println(EvaluateExpression.evaluateExpression(args[0]));
        } catch (Exception ex) {
            System.out.println("Wrong expression: " + args[0]);
        }
    }
}
