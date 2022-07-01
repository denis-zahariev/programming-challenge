package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballAnalysisTest {

    @Test
    void testFootballAnalysis(){
        FootballAnalysis footballAnalysis=new FootballAnalysis();
        footballAnalysis.analyze();
        assertEquals("Aston_Villa",footballAnalysis.getResult());
    }
}