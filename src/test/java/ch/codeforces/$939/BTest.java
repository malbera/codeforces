package ch.codeforces.$939;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BTest {

    @Test
    public void findGoodBox() {
        assertEquals("2 4", B.findProperBox(new int []{5, 4, 10}, 19));
    }

    @Test
    public void findGoodBox_2() {
        assertEquals("3 3", B.findProperBox(new int []{109, 92, 38, 38, 49, 38, 92}, 120));
    }
}