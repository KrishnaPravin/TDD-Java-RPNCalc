package org.amdocs;

public class MathFactory {

  public static IMathOperation getObject(String token) {
    IMathOperation mathOperation = new NullMathOperation();

    if (token.equals("+")) mathOperation = new Addition();
    if (token.equals("-")) mathOperation = new Subtraction();
    if (token.equals("*")) mathOperation = new Multiplication();
    if (token.equals("/")) mathOperation = new Division();

    return mathOperation;
  }
}
