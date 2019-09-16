/*
Et meget simpelt test eksempel for at se om tests fungere eller ej
 */

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    int x = 10;
    int y = 10;
    int sum;

    public void testPlus() {
        sum = x + y;
        assertEquals(20, sum);

    }

    public void testMinus() {
        sum = x - y;
        assertEquals(0, sum);
    }

    public void testTimes() {
        sum = x * y;
        assertEquals(100, sum);
    }

    public void testDivide() {
        sum = x / y;
        assertEquals(1, sum);
    }

}