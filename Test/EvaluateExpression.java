import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Usage: Java EvaluateExpression \"expression\"");
            System.exit(1);
        }
        try {
            System.out.println(evaluateExpression(args[0]));
        } catch(Exception e) {
            System.out.println("Wrong expression: " + args[0]);
        }
    }

    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        System.out.println("Before InsertBlanks: " + expression);
        expression = insertBlanks(expression);
        System.out.println("After InsertBlanks: " + expression);

        String[] tokons = expression.split(" ");
        for(String token : tokons) {
            if(token.length() == 0)
                continue;
            else if(token.charAt(0) == '+' || token.charAt(0) == '-') {
                while(!operatorStack.isEmpty() &&
                    (operatorStack.peek() == '+' ||
                     operatorStack.peek() == '-' ||
                     operatorStack.peek() == '*' ||
                     operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }
            else if(token.charAt(0) == '*' || token.charAt(0) == '/') {
                while(!operatorStack.isEmpty() &&
                    (operatorStack.peek() == '*' ||
                     operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }
            else if(token.trim().charAt(0) == '(') {
                operatorStack.push('(');
            }
            else if(token.trim().charAt(0) == ')') {
                while(operatorStack.peek() != '(') {
                    processAnOperator(operandStack, operatorStack);
                }
                operatorStack.pop();
            }
            else {
                operandStack.push(new Integer(token));
            }
        }

        while(!operatorStack.isEmpty()) {
            processAnOperator(operandStack, operatorStack);
        }

        return operandStack.pop();
    }

    public static void processAnOperator(
        Stack<Integer> operandStack, Stack<Character> operatorStack) {
        char op = operatorStack.pop();
        int op1 = operandStack.pop();
        int op2 = operandStack.pop();
        if(op == '+')
            operandStack.push(op2 + op1);
        else if(op == '-')
            operandStack.push(op2 - op1);
        else if(op == '*')
            operandStack.push(op2 * op1);
        else if(op == '/')
            operandStack.push(op2 / op1);
    }

    public static String insertBlanks(String expression) {
        String result = "";

        for(int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '(' || expression.charAt(i) == ')' ||
                expression.charAt(i) == '+' || expression.charAt(i) == '-' ||
                expression.charAt(i) == '/' || expression.charAt(i) == '*')
                result += " " + expression.charAt(i) + " ";
            else
                result += expression.charAt(i);
        }

        return result;
    }
}
