import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoyettFamilyTest {

    @Test
    public void testAges() {
        BoyettFamily testBoyettFamily = new BoyettFamily();
        assertEquals(1, testBoyettFamily.theFamily[0].getAge());
        assertEquals(5, testBoyettFamily.theFamily[1].getAge());
        assertEquals(21, testBoyettFamily.theFamily[2].getAge());
        assertEquals(25, testBoyettFamily.theFamily[3].getAge());
        assertEquals(26, testBoyettFamily.theFamily[4].getAge());
        assertEquals(28, testBoyettFamily.theFamily[5].getAge());
        assertEquals(55, testBoyettFamily.theFamily[6].getAge());
        assertEquals(62, testBoyettFamily.theFamily[7].getAge());
    }
}
