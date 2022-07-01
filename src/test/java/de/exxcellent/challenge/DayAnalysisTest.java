package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayAnalysisTest {

    @Test
    void testDayAnalysis() {
        DayAnalysis dayAnalysis = new DayAnalysis("src/main/resources/de/exxcellent/challenge/weather.csv");
        dayAnalysis.analyze("MxT", "MnT", new DifferenceMinimum());
        assertEquals("14", dayAnalysis.getResult());
    }

}
