package de.exxcellent.challenge;


/**
 * A class responsible for initiating the day analysis.
 */
public class DayAnalysis {

    private String tablePath;
    private String result;


    public DayAnalysis(String path) {
        this.tablePath = path;
    }

    /**
     * Instantiates a CSVFileReader, reads the CSV, and calculates the result.
     *
     * @param column1           name of the first column
     * @param column2           name of the second column
     * @param differenceMinimum the mathematical operation used in the analysis
     */
    public void analyze(String column1, String column2, DifferenceMinimum differenceMinimum) {

        CSVFileReader csvFileReader = new CSVFileReader(this.tablePath);
        this.result = csvFileReader.readAndAnalyze(column1, column2, differenceMinimum);
    }

    public String getResult() {
        return this.result;
    }

}
