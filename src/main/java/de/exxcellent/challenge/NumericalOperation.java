package de.exxcellent.challenge;

/**
 * An interface for the numerical operations that are performed on the CSV data.
 */
public interface NumericalOperation {

    /**
     * Used to perform an operation on two values of a table row.
     *
     * @param identifier     identifier of the table row, e.g. day or football team
     * @param columnOneValue value in the first column
     * @param columnTwoValue value in the second column
     */
    void update(String identifier, int columnOneValue, int columnTwoValue);

    String getResult();

}
