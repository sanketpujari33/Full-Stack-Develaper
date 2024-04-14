//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.service.test;

import com.service.EvenOrOdd;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EvenOrOddTest {
    EvenOrOddTest() {
    }

    @ParameterizedTest
    @CsvSource({"10,even", "5,odd", "12,even", "15,odd"})
    void testEvenOrOddNumber(Integer input, String expected) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        String actualResult = evenOrOdd.evenOrOddNumber(input);
        Assert.assertEquals(expected, actualResult);
    }
}
