package com.unittesting.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach\n");
    }

    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class\n");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }

    @Test
    // @DisplayName("Equals And Not Equals")
    void testEqualsAndNotEquals() {
        System.out.println("Running test: testEqualsAndNotEquals");
        // No need to create object ... handled by @BeforeEach
        assertEquals(6, demoUtils.add(2, 4), "2+4 must be equal 6");
        assertNotEquals(7, demoUtils.add(1, 9), "1+9 must be not equal 7");
    }

    @Test
    @DisplayName("Null And Not Null")
    void testNullAndNotNull() {
        System.out.println("Running test: testNullAndNotNull");
        // No need to create object ... handled by @BeforeEach
        assertNull(demoUtils.checkNull(null), "Object should be null");
        assertNotNull(demoUtils.checkNull("junit"), "Object should not be null");
    }
}
