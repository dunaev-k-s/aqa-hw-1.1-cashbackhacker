package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnZero() {
        assertEquals(service.remain(1000),0);

    }

    @Test
    public void shouldReturnMax() {
        assertEquals(service.remain(1),999);

    }

    @Test
    public void shouldReturnThousand() {
        assertEquals(service.remain(0),1000);

    }

    @Test
    public void shouldReturnMin() {
        assertEquals(service.remain(1),999);

    }


}