package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone fourth = new Smartphone(4, "Galaxy S20 Ultra", 4, "Samsung");

    @Test
    void shouldMatchesByNameTrue() {
        assertTrue(fourth.matches("Galaxy S20 Ultra"));
    }

    @Test
    void shouldMatchByManufacturerTrue() {
        assertTrue(fourth.matches("Samsung"));
    }

    @Test
    void shouldMatchesByInvalidNameFalse() {
        assertFalse(fourth.matches("P40 Pro"));
    }

    @Test
    void shouldMatchByInvalidManufacturerFalse() {
        assertFalse(fourth.matches("Huawei"));
    }
}