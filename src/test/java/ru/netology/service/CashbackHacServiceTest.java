package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CashbackHacServiceTest {
    CashbackHacService service = new CashbackHacService();

    @Test
    public void testRemain() {
        CashbackHacService service = new CashbackHacService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWitCashback() {
        CashbackHacService service = new CashbackHacService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainCashbackMin() {
        CashbackHacService service = new CashbackHacService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}