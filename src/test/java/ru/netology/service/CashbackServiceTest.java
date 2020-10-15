package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackServiceTest {
    CashbackService CashbackService = new CashbackService();

    @Test
    public void shouldTestRemainIfAmount0() {
        assertEquals(1000, CashbackService.remain(0));
    }
    @Test
    public void shouldTestRemainIfAmount400() {
        assertEquals(600, CashbackService.remain(400));
    }
    @Test
    public void shouldTestRemainIfAmount1000() {
        assertNotEquals(0, CashbackService.remain(1000));
    }
} 