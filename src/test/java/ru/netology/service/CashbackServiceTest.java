package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackServiceTest {
    CashbackService cashbackService = new CashbackService();

    @Test
    public void shouldTestRemainIfAmount0() {
        assertEquals(1000, cashbackService.remain(0));
    }

    @Test
    public void shouldTestRemainIfAmount400() {
        assertEquals(600, cashbackService.remain(400));
    }

    @Test
    public void shouldTestRemainIfAmount1000() {
        assertNotEquals(0, cashbackService.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void shouldTestRemainIfAmount0Jupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(1000, cashbackService.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void shouldTestRemainIfAmount400Jupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(600, cashbackService.remain(400));
    }

    @org.junit.jupiter.api.Test
    public void shouldTestRemainIfAmount1000Jupiter() {
        org.junit.jupiter.api.Assertions.assertNotEquals(0, cashbackService.remain(1000));
    }
}


