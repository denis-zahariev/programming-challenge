package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayAnalysisTest {

    @Test
    void testDayAnalysis() {
        DayAnalaysis dayAnalaysis = new DayAnalaysis();
        dayAnalaysis.analyze();
        assertEquals("14",dayAnalaysis.getResult());
    }

}
