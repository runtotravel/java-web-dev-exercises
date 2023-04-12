package exercises.technology.tests;

import exercises.technology.main.Computer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    @Test
    public void constructorSetsValuesTest() {
        Computer myComputer = new Computer(3000, 5000, "2021");
        //test three properties to make sure they were set properly
        assertEquals(3000, myComputer.getScreenWidth());
        assertEquals(5000, myComputer.getScreenHeight());
        assertEquals("2021", myComputer.getManufactureYear());
    }

    @Test
    public void twoPlusTwoReturnsFour() {
        Computer myComputer = new Computer(3000, 5000, "2021");
        int results = myComputer.processTwoPlusTwo();
        assertEquals(4, results);

    }
    }

