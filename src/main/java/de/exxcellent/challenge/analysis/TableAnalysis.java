package de.exxcellent.challenge.analysis;

import de.exxcellent.challenge.value_search.IValueSearch;
import de.exxcellent.challenge.readers.IReader;

/**
 * A class responsible for initiating the table analysis.
 *
 * @author Denis Zahariev <denis.zahariev95@gmail.com>
 */
public class TableAnalysis implements IAnalysis {

    private String result;
    private IReader reader;

    public TableAnalysis(IReader reader) {
        this.reader = reader;
    }

    /**
     * Initiates the analysis using the reader, the column info and the search definition.
     *
     * @param column1      name of the first column
     * @param column2      name of the second column
     * @param iValueSearch the search operation used in the analysis
     */
    @Override
    public void analyze(String column1, String column2, IValueSearch iValueSearch) {
        this.result = reader.readAndAnalyze(column1, column2, iValueSearch);
    }

    @Override
    public String getResult() {
        return this.result;
    }

}
