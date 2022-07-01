package de.exxcellent.challenge.readers;

import de.exxcellent.challenge.numerical_operations.INumericalOperation;

/**
 * An interface defining the methods of the readers.
 *
 * @author Denis Zahariev <denis.zahariev95@gmail.com>
 */
public interface IReader {

    /**
     * A signature for the method that reads and analyzes the given data source.
     * Currently considers an analysis of only 2 fields.
     *
     * @param fieldOneName        column name of the first value in case of CSV, field name of the first value in case of JSON
     * @param fieldTwoName        column name of the second value in case of CSV, field name of the second value in case of JSON
     * @param INumericalOperation the numerical operation that will be used for the analysis of the two values
     * @return
     */
    String readAndAnalyze(String fieldOneName, String fieldTwoName, INumericalOperation INumericalOperation);

}
