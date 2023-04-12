package exercises.technology.tests;

import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LaptopTest {

    Laptop myLaptop;

    @Before
    public void beforeTests() {
        myLaptop = new Laptop(3000, 5000, "2021", true);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, this.myLaptop.getScreenWidth());
        assertEquals(5000, this.myLaptop.getScreenHeight());
        assertEquals("2021", this.myLaptop.getManufactureYear());
        assertEquals(true, this.myLaptop.getIsIntelliJOpen());
    }

    @Test
    public void openIntelliJSetsIsIntelliJOpenToTrue() {
       this.myLaptop.setsIsIntelliJOpen(false);
       assertEquals(false, this.myLaptop.getIsIntelliJOpen());
        this.myLaptop.openIntelliJ();
        assertEquals(true, this.myLaptop.getIsIntelliJOpen());
    }

}
