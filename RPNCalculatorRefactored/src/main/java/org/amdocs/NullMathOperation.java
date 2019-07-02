package org.amdocs;

public class NullMathOperation implements IMathOperation {
  public int calculate(int firstNumber, int secondNumber) throws Error {
    throw new Error("Invalid Operation");
  }
}
