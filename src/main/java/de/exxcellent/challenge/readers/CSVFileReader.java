package de.exxcellent.challenge.readers;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import de.exxcellent.challenge.value_search.IValueSearch;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * A class responsible for reading a CSV file.
 *
 * @author Denis Zahariev <denis.zahariev95@gmail.com>
 */
public class CSVFileReader implements IReader {

    private String pathToFile;

    public CSVFileReader(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    /**
     * Reads the values in the two columns of the CSV file and applies the difference minimum function to these.
     *
     * @param columnOneName name of the first column
     * @param columnTwoName name of the second column
     * @param IValueSearch  an instance of the numerical operation
     * @return the result of the numerical analysis after the table is analyzed
     */
    public String readAndAnalyze(String columnOneName, String columnTwoName, IValueSearch IValueSearch) {
        try (CSVReader reader = new CSVReader(new FileReader(this.pathToFile))) {

            //get the positions of the columns
            String[] headerLine = reader.readNext();
            int columnOneIndex = Arrays.asList(headerLine).indexOf(columnOneName);
            int columnTwoIndex = Arrays.asList(headerLine).indexOf(columnTwoName);

            String[] tableLine;
            while ((tableLine = reader.readNext()) != null) {
                IValueSearch.update(tableLine[0], Integer.parseInt(tableLine[columnOneIndex]), Integer.parseInt(tableLine[columnTwoIndex]));
            }

            return IValueSearch.getResult();

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
