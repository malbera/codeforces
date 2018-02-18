package ch.codeforces.$939;

import org.junit.Test;

import static org.junit.Assert.*;

public class ATest {

    @Test
    public void triangleFound() {
        assertEquals("YES", A.findTriangle(new int []{2, 4, 5, 1, 3}));
    }

    @Test
    public void triangleNotFound() {
        assertEquals("NO", A.findTriangle(new int []{5, 5, 5, 5, 1, 0}));
    }
}