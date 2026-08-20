package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashBackHackerServiceTest {

    @Test
    public void shouldRemain100() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemainWhenAmountIs1000() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
}