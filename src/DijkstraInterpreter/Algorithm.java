package DijkstraInterpreter;

import java.util.Stack;

public class Algorithm {

    private Stack<String> operationStack;
    private Stack<Double> valueStack;

    public Algorithm() {
        this.operationStack = new Stack<>();
        this.valueStack = new Stack<>();
    }

    public void interpretExpression(String expression) {
        String[] expressionArrray = expression.split(" ");
        for (String s : expressionArrray) {
            if (s.equals("(")) {
                // do nothing
            } else if (s.equals("+") || s.equals("*")) {
                operationStack.push(s);
            } else if (s.equals(")")) {
                String operations = operationStack.pop();

                if (operations.equals("+")) {
                    valueStack.push(valueStack.pop() + valueStack.pop());
                } else if (operations.equals("*")) {
                    valueStack.push(valueStack.pop() * valueStack.pop());
                }
            } else{
                valueStack.push(Double.parseDouble(s));
            }
        }
    }

    public void result() {
        System.out.println(valueStack.pop());
    }
}
