package de.exxcellent.challenge;

import de.exxcellent.challenge.numerical_operations.DifferenceMinimum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceMinimumTest {


    private DifferenceMinimum differenceMinimum;

    @BeforeEach
    void setUp() {
        differenceMinimum = new DifferenceMinimum();

    }

    @Test
    void testUpdateAndResult() {
        differenceMinimum.update("testIdentifier", 15, 5);
        assertEquals("testIdentifier", differenceMinimum.getResult());

        differenceMinimum.update("testIdentifierTwo", 20, 15);
        assertEquals("testIdentifierTwo", differenceMinimum.getResult());

        differenceMinimum.update("testIdentifierThree", 20, 25);
        assertEquals("testIdentifierThree", differenceMinimum.getResult());

    }


}