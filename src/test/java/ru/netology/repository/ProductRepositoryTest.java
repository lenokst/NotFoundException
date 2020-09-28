package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.NotFoundException;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();

    private  Product first = new Book(1, "Просто Маса", 1, "Борис Акунин");
    private Product second = new Book(2, "Думай медленно… Решай быстро", 2, "Даниэль Канеман");

    @BeforeEach
    void setUp() {
        repository.save(first);
        repository.save(second);
    }

    @Test
    void removeById() {
        repository.removeById(2);
        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{first};
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldRemoveByIdNotExist(){
        assertThrows(NotFoundException. class, () -> repository.removeById(3));
    }
}