package de.exxcellent.challenge;

import de.exxcellent.challenge.numerical_operations.AbsoluteDifferenceMinimum;
import de.exxcellent.challenge.numerical_operations.DifferenceMinimum;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 * @author Denis Zahariev <denis.zahariev95@gmail.com>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     *
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …

        TableAnalysis dayAnalysis = new TableAnalysis("src/main/resources/de/exxcellent/challenge/weather.csv");
        dayAnalysis.analyze("MxT", "MnT", new DifferenceMinimum());

        String dayWithSmallestTempSpread = dayAnalysis.getResult();     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);


        TableAnalysis footballAnalysis = new TableAnalysis("src/main/resources/de/exxcellent/challenge/football.csv");
        footballAnalysis.analyze("Goals", "Goals Allowed", new AbsoluteDifferenceMinimum());

        String teamWithSmallestGoalSpread = footballAnalysis.getResult(); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
