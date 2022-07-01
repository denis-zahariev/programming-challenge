package de.exxcellent.challenge;

import de.exxcellent.challenge.numerical_operations.INumericalOperation;
import de.exxcellent.challenge.readers.CSVFileReader;
import de.exxcellent.challenge.readers.IReader;

/**
 * A class responsible for initiating the day analysis.
 *
 * @author Denis Zahariev <denis.zahariev95@gmail.com>
 */
public class TableAnalysis {

    private String tablePath;
    private String result;


    public TableAnalysis(String path) {
        this.tablePath = path;
    }

    /**
     * Instantiates a CSVFileReader, reads the CSV, and calculates the result.
     *
     * @param column1             name of the first column
     * @param column2             name of the second column
     * @param INumericalOperation the mathematical operation used in the analysis
     */
    public void analyze(String column1, String column2, INumericalOperation INumericalOperation) {
        IReader csvFileReader = new CSVFileReader(this.tablePath);
        this.result = csvFileReader.readAndAnalyze(column1, column2, INumericalOperation);
    }

    public String getResult() {
        return this.result;
    }

}
