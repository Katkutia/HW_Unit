package ru.netology.service;

public class CashbackHacServiceTest {


    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHacService service = new CashbackHacService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    private void assertEquals(int actual, int expected) {

    }

    @org.testng.annotations.Test
    public void testRemainWitCashback() {
        CashbackHacService service = new CashbackHacService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainCashbackMin() {
        CashbackHacService service = new CashbackHacService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}