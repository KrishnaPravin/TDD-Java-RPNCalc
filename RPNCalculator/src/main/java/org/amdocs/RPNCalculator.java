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
    for (String token : tokens) {
      if (token.equals("+")) {
        secondNumber = stack.pop();
        firstNumber = stack.pop();
        result = firstNumber + secondNumber;
        stack.push(result);
      } else if (token.equals("-")) {
        secondNumber = stack.pop();
        firstNumber = stack.pop();
        result = firstNumber - secondNumber;
        stack.push(result);
      } else if (token.equals("*")) {
        secondNumber = stack.pop();
        firstNumber = stack.pop();
        result = firstNumber * secondNumber;
        stack.push(result);
      } else if (token.equals("/")) {
        secondNumber = stack.pop();
        firstNumber = stack.pop();
        result = firstNumber / secondNumber;
        stack.push(result);
      } else {
        stack.push(Integer.parseInt(token));
      }
    }
    return stack.pop();
  }
}
