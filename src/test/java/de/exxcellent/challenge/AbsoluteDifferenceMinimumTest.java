package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteDifferenceMinimumTest {

    private AbsoluteDifferenceMinimum absoluteDifferenceMinimum;

    @BeforeEach
    void setUp() {
        absoluteDifferenceMinimum = new AbsoluteDifferenceMinimum();

    }

    @Test
    void testUpdateAndResult() {
        absoluteDifferenceMinimum.update("testIdentifier", -100, 100);
        assertEquals("testIdentifier", absoluteDifferenceMinimum.getResult());

        absoluteDifferenceMinimum.update("testIdentifierTwo", 100, -50);
        assertEquals("testIdentifierTwo", absoluteDifferenceMinimum.getResult());

        absoluteDifferenceMinimum.update("testIdentifierThree", -20, 20);
        assertEquals("testIdentifierThree", absoluteDifferenceMinimum.getResult());

        absoluteDifferenceMinimum.update("testIdentifierFour", -20, -10);
        assertEquals("testIdentifierFour", absoluteDifferenceMinimum.getResult());

        absoluteDifferenceMinimum.update("testIdentifierFive", -1, 1);
        assertEquals("testIdentifierFive", absoluteDifferenceMinimum.getResult());


    }
}