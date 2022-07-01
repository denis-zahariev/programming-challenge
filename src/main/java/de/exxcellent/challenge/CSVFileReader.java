package de.exxcellent.challenge;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * A class responsible for reading a CSV file.
 */
public class CSVFileReader {

    private String pathToFile;

    public CSVFileReader(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    /**
     * Reads the values in the two columns of the CSV file and applies the difference minimum function to these.
     *
     * @param columnOneName     name of the first column
     * @param columnTwoName     name of the second column
     * @param differenceMinimum an instance of the difference minimum function
     * @return the difference minimum after the table is analyzed
     */
    public String readAndAnalyze(String columnOneName, String columnTwoName, DifferenceMinimum differenceMinimum) {
        try (CSVReader reader = new CSVReader(new FileReader(this.pathToFile))) {

            //finds the positions of the columns
            String[] headerLine = reader.readNext();
            int columnOneIndex = Arrays.asList(headerLine).indexOf(columnOneName);
            int columnTwoIndex = Arrays.asList(headerLine).indexOf(columnTwoName);

            String[] tableLine;
            while ((tableLine = reader.readNext()) != null) {
                differenceMinimum.update(tableLine[0], Integer.parseInt(tableLine[columnOneIndex]), Integer.parseInt(tableLine[columnTwoIndex]));
            }

            return differenceMinimum.getResult();

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
