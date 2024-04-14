

package com.service.test;

import com.service.StringConvert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringConvertTest {
    StringConvertTest() {
    }

    @Test
    void testConvertToInt() {
        String str = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringConvert.convertToInt(str);
        });
    }
}
