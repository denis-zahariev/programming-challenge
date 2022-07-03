package de.exxcellent.challenge.value_search;

/**
 * A class used to hold the current absolute difference minimum between the values in two columns.
 *
 * @author Denis Zahariev <denis.zahariev95@gmail.com>
 */
public class AbsoluteDifferenceMinimum implements IValueSearch {

    private String identifier;
    private int currentMin;

    /**
     * Instantiates the object with default values.
     */
    public AbsoluteDifferenceMinimum() {
        this.identifier = null;
        this.currentMin = Integer.MAX_VALUE;
    }

    /**
     * If the method encounters a smaller absolute difference, it updates the current minimum and the identifier.
     *
     * @param identifier     identifier of the table row, e.g. day or football team
     * @param columnOneValue value in the first column
     * @param columnTwoValue value in the second column
     */
    @Override
    public void update(String identifier, int columnOneValue, int columnTwoValue) {
        if (Math.abs(columnOneValue - columnTwoValue) < currentMin) {
            this.currentMin = Math.abs(columnOneValue - columnTwoValue);
            this.identifier = identifier;
        }
    }

    @Override
    public String getResult() {
        return this.identifier;
    }
}
