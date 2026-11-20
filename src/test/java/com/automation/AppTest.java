package com.automation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddition() {
        int a = 10;
        int b = 20;

        int result = a + b;

        assertEquals(30, result);
    }

    @Test
    void testSubtraction() {
        int a = 20;
        int b = 10;

        int result = a - b;

        assertEquals(10, result);
    }
}