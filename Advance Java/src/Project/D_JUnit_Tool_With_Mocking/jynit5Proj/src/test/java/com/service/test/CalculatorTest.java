

package com.service.test;

import com.service.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    CalculatorTest() {
    }

    @Test
    void testAdd() {
        Calculator cal = new Calculator();
        int actualResult = cal.add(10, 5);
        int expectedResult = 15;
        Assert.assertEquals((long)expectedResult, (long)actualResult);
    }

    @Test
    void testMultiply() {
        Calculator cal = new Calculator();
        int actualResult = cal.multiply(10, 5);
        int expectedResult = 50;
        Assert.assertEquals((long)expectedResult, (long)actualResult);
    }
}
