package ru.netology.service;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain(int expected) {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int exspected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWitCashback(int expected) {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int exspected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainCashbackMin(int expected) {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int exspected = 1000;

        assertEquals(actual, expected);
    }
}