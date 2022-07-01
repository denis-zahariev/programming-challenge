package de.exxcellent.challenge;


/**
 * A class responsible for initiating the day analysis.
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
     * @param column1            name of the first column
     * @param column2            name of the second column
     * @param numericalOperation the mathematical operation used in the analysis
     */
    public void analyze(String column1, String column2, NumericalOperation numericalOperation) {
        CSVFileReader csvFileReader = new CSVFileReader(this.tablePath);
        this.result = csvFileReader.readAndAnalyze(column1, column2, numericalOperation);
    }

    public String getResult() {
        return this.result;
    }

}
