package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackServiceTest {
    CashbackService CashbackService = new CashbackService();

    @Test
    public void shouldTestRemainIfAmount0() {
        assertEquals(CashbackService.remain(0), 1000);
    }
    
    @Test
    public void shouldTestRemainIfAmount400() {
        assertEquals(CashbackService.remain(400), 600);
    }
    
    @Test
    public void shouldTestRemainIfAmount1000() {
        assertNotEquals(CashbackService.remain(1000), 0);
    }
}