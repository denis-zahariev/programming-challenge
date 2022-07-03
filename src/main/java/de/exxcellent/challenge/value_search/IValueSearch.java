package de.exxcellent.challenge.value_search;

/**
 * An interface for the numerical operations that are performed on the CSV data.
 *
 * @author Denis Zahariev <denis.zahariev95@gmail.com>
 */
public interface IValueSearch {

    /**
     * Used to perform an operation on two values of a table row.
     *
     * @param identifier    identifier of the row, e.g. day or football team
     * @param fieldOneValue value in the first column/field
     * @param fieldTwoValue value in the second column/field
     */
    void update(String identifier, int fieldOneValue, int fieldTwoValue);

    String getResult();

}
