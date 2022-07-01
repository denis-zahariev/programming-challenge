package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CSVFileReaderTest {

    private CSVFileReader csvFileReader;

    @BeforeEach
    void setUp() {
        csvFileReader = new CSVFileReader("src/main/resources/de/exxcellent/challenge/weather.csv");
    }

    @Test
    void readAndAnalyze() {
        assertEquals("14", csvFileReader.readAndAnalyze("MxT", "MnT", new DifferenceMinimum()));
    }
}