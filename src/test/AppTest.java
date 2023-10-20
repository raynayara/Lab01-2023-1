package test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.App;
public class AppTest {
    @Test
    public void testEncontre() {
        assertEquals(1, App.encontre(new int[]{1, 2, 3, 4, 5}, 3));
        assertEquals(1, App.encontre(new int[]{1, 2, 3}, 3));
        assertEquals(0, App.encontre(new int[]{1, 2, 3}, 7));
        assertEquals(1, App.encontre(new int[]{1, 2,7, 3}, 7));
        assertEquals(0, App.encontre(new int[]{}, 7));
    }

    @Test
    public void testMaior() {
        assertEquals(5, App.maior(new int[]{1, 2, 3, 4, 5}));
        assertEquals(5, App.maior(new int[]{5, 2, 3, 4, 5}));
        assertEquals(5, App.maior(new int[]{5, 2, 3, 4, 1}));
        assertEquals(-1, App.maior(new int[]{-5, -2, -3, -4, -1}));
        assertEquals(-5, App.maior(new int[]{-5}));
    }
}
