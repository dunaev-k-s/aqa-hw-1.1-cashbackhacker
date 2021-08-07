package ru.netology.service;

import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnZero() {
        assertEquals(0,service.remain(1000));

    }

    @Test
    public void shouldReturnMax() {
        assertEquals(999,service.remain(1));

    }

    @Test
    public void shouldReturnThousand() {
        assertEquals(1000, service.remain(0));

    }

    @Test
    public void shouldReturnMin() {
        assertEquals(999, service.remain(1));

    }


}