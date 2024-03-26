package ru.netology.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CashbackHackServiceTest {


    @org.testng.annotations.Test
    public void testRemain(int expected) {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int exspected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainWitCashback(int expected) {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int exspected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainCashbackMin(int expected) {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int exspected = 1000;

        assertEquals(actual, expected);
    }
}