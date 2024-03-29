package de.exxcellent.challenge;

import de.exxcellent.challenge.analysis.TableAnalysis;
import de.exxcellent.challenge.value_search.AbsoluteDifferenceMinimum;
import de.exxcellent.challenge.value_search.DifferenceMinimum;
import de.exxcellent.challenge.readers.CSVFileReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableAnalysisTest {

    @Test
    void testDayAnalysis() {
        TableAnalysis dayAnalysis = new TableAnalysis(new CSVFileReader("src/main/resources/de/exxcellent/challenge/weather.csv"));
        dayAnalysis.analyze("MxT", "MnT", new DifferenceMinimum());
        assertEquals("14", dayAnalysis.getResult());
    }

    @Test
    void testFootballAnalysis() {
        TableAnalysis footballAnalysis = new TableAnalysis(new CSVFileReader("src/main/resources/de/exxcellent/challenge/football.csv"));
        footballAnalysis.analyze("Goals", "Goals Allowed", new AbsoluteDifferenceMinimum());
        assertEquals("Aston_Villa", footballAnalysis.getResult());
    }
}
