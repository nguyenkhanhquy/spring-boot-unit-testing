package com.unittesting.junitdemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    @Test
    @DisplayName("Add two numbers")
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be equal 6");
        assertNotEquals(7, demoUtils.add(1, 9), "1+9 must be not equal 7");
    }

    @Test
    @DisplayName("Check null")
    void testNullAndNotNull() {

        DemoUtils demoUtils = new DemoUtils();
        assertNull(demoUtils.checkNull(null), "Object should be null");
        assertNotNull(demoUtils.checkNull("junit"), "Object should not be null");
    }
}
