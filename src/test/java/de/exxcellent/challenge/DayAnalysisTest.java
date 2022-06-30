package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayAnalysisTest {

    @Test
    void testDayAnalysis() {
        DayAnalysis dayAnalysis = new DayAnalysis();
        dayAnalysis.analyze();
        assertEquals("14", dayAnalysis.getResult());
    }

}
