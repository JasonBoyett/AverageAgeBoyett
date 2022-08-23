
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoyettFamilyTest {
    BoyettFamily testBoyettFamily = new BoyettFamily();

    @Test
    public void testAges() {

        assertEquals(1, testBoyettFamily.theFamily[0].getAge());
        assertEquals(5, testBoyettFamily.theFamily[1].getAge());
        assertEquals(21, testBoyettFamily.theFamily[2].getAge());
        assertEquals(25, testBoyettFamily.theFamily[3].getAge());
        assertEquals(26, testBoyettFamily.theFamily[4].getAge());
        assertEquals(28, testBoyettFamily.theFamily[5].getAge());
        assertEquals(55, testBoyettFamily.theFamily[6].getAge());
        assertEquals(62, testBoyettFamily.theFamily[7].getAge());
    }

    @Test
    public void testNames() {
        assertEquals("Peanut Butter Boyett", testBoyettFamily.theFamily[0].getName());
        assertEquals("Gypsy", testBoyettFamily.theFamily[1].getName());
        assertEquals("Zach", testBoyettFamily.theFamily[2].getName());
        assertEquals("Nathan", testBoyettFamily.theFamily[3].getName());
        assertEquals("Jason", testBoyettFamily.theFamily[4].getName());
        assertEquals("Alexis", testBoyettFamily.theFamily[5].getName());
        assertEquals("Steve", testBoyettFamily.theFamily[6].getName());
        assertEquals("Sharri", testBoyettFamily.theFamily[7].getName());
    }

    @Test
    public void testAveragAge() {
        assertEquals(27.875, testBoyettFamily.getAverageAge(), 0.5);
    }

    @Test
    public void testGetAllNames() {
        assertEquals("Peanut Butter BoyettGypsyZachNathanJasonAlexisSteveSharri", testBoyettFamily.getAllFamilyNames());
    }
}
