package de.exxcellent.challenge;

import de.exxcellent.challenge.numerical_operations.AbsoluteDifferenceMinimum;
import de.exxcellent.challenge.numerical_operations.DifferenceMinimum;
import de.exxcellent.challenge.readers.CSVFileReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CSVFileReaderTest {

    private CSVFileReader csvFileReaderWeather;
    private CSVFileReader csvFileReaderFootball;

    @BeforeEach
    void setUp() {
        csvFileReaderWeather = new CSVFileReader("src/main/resources/de/exxcellent/challenge/weather.csv");
        csvFileReaderFootball = new CSVFileReader("src/main/resources/de/exxcellent/challenge/football.csv");

    }

    @Test
    void readAndAnalyze() {
        assertEquals("14", csvFileReaderWeather.readAndAnalyze("MxT", "MnT", new DifferenceMinimum()));
        assertEquals("Aston_Villa", csvFileReaderFootball.readAndAnalyze("Goals", "Goals Allowed", new AbsoluteDifferenceMinimum()));
    }
}