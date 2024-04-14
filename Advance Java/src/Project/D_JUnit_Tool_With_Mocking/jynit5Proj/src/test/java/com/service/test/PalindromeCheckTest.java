
package com.service.test;

import com.service.PalindromeCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckTest {
    PalindromeCheckTest() {
    }

    @ParameterizedTest
    @ValueSource(
        strings = {"madam", "liril", "radar", "racecar"}
    )
    void testIsPalindrome(String str) {
        PalindromeCheck pc = new PalindromeCheck();
        boolean actual = pc.isPalindrome(str);
        Assertions.assertTrue(actual);
    }
}
