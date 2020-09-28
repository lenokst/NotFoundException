package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book first = new Book(1, "Просто Маса", 1, "Борис Акунин");

    @Test
    void shouldMatchesByNameTrue() {
        assertTrue(first.matches("Просто Маса"));
    }

    @Test
    void shouldMatchByAuthorTrue() {
        assertTrue(first.matches("Борис Акунин"));
    }

    @Test
    void shouldMatchesByInvalidNameFalse() {
        assertFalse(first.matches("Deadline. Роман об управлении проектами"));
    }

    @Test
    void shouldMatchByInvalidAuthorFalse() {
        assertFalse(first.matches("Том ДеМарко"));
    }
}