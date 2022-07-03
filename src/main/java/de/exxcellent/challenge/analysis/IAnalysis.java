package de.exxcellent.challenge.analysis;

import de.exxcellent.challenge.value_search.IValueSearch;

public interface IAnalysis {

    void analyze(String fieldOneName, String fieldTwoName, IValueSearch iValueSearch);

    String getResult();

}
