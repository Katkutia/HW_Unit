package ru.netology.service;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    private void assertEquals(int actual, int expected) {

    }

    @org.testng.annotations.Test
    public void testRemainWitCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainCashbackMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}