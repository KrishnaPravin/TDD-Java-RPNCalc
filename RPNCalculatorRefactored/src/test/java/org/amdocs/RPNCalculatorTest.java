package org.amdocs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RPNCalculatorTest {
  @Test
  public void testSampleAddition() {
    RPNCalculator rpnCalculator = new RPNCalculator();
    int actualResult = rpnCalculator.calculate("10 12 +");
    int expectedResult = 22;
    assertEquals(expectedResult, actualResult);

    actualResult = rpnCalculator.calculate("100 12 +");
    expectedResult = 112;
    assertEquals(expectedResult, actualResult);

    actualResult = rpnCalculator.calculate("100 12 -");
    expectedResult = 88;
    assertEquals(expectedResult, actualResult);

    actualResult = rpnCalculator.calculate("10 5 *");
    expectedResult = 50;
    assertEquals(expectedResult, actualResult);

    actualResult = rpnCalculator.calculate("10 5 /");
    expectedResult = 2;
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testComplexRPNExpression() {
    RPNCalculator rpnCalculator = new RPNCalculator();

    int actualResult = rpnCalculator.calculate("10 2 * 20 5 - +");
    int expectedResult = 35;
    assertEquals(expectedResult, actualResult);
  }
}
