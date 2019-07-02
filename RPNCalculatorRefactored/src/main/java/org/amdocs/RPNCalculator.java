package org.amdocs;

import java.util.Stack;

public class RPNCalculator {
  Stack<Integer> stack;
  int firstNumber, secondNumber, result;

  RPNCalculator() {
    stack = new Stack<Integer>();
    firstNumber = secondNumber = result = 0;
  }

  public int calculate(String expression) {
    String[] tokens = expression.split(" ");

    IMathOperation mathOperation = null;

    for (String token : tokens) {
      if (isMathOperator(token)) {
        secondNumber = stack.pop();
        firstNumber = stack.pop();
        mathOperation = MathFactory.getObject(token);
        result = mathOperation.calculate(firstNumber, secondNumber);
        stack.push(result);
      } else {
        stack.push(Integer.parseInt(token));
      }
    }
    return stack.pop();
  }

  private boolean isMathOperator(String token) {
    String mathOperators = "+-*/";
    return mathOperators.contains(token);
  }
}
