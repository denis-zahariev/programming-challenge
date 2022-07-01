package de.exxcellent.challenge;

/**
 * A class used to hold the current difference minimum between the values in two columns.
 *
 */
public class DifferenceMinimum {

    private String identifier;
    private int currentMin;

    /**
     * Instantiates the object with default values.
     */
    public DifferenceMinimum() {
        this.identifier = null;
        this.currentMin = Integer.MAX_VALUE;
    }

    /**
     * If the method encounters a smaller difference, it updates the current minimum and the identifier.
     *
     * @param identifier     identifier of the table row, e.g. day or football team
     * @param columnOneValue value in the first column
     * @param columnTwoValue value in the second column
     */
    public void update(String identifier, int columnOneValue, int columnTwoValue) {
        if (columnOneValue - columnTwoValue < currentMin) {
            this.currentMin = columnOneValue - columnTwoValue;
            this.identifier = identifier;
        }
    }

    public String getResult() {
        return this.identifier;
    }

}
