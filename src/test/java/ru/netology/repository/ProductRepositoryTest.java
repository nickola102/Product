package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.product.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    Product first = new Product(1354, "1984", 300);
    Product second = new Product(2687, "Hard Rock Cafe", 800);
    Product third = new Product(3235, "6S Plus", 25000);
    Product forth = new Product(435, "Harry Potter", 600);
    Product fifth = new Product(568, "Blade", 15000);

    @Test
    void shouldFindAll() {
        ProductRepository repository = new ProductRepository();
        repository.save(first);
        repository.save(second);
        repository.save(third);

        Product[] expected = {first, second, third};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldRemoveById() {
        ProductRepository repository = new ProductRepository();
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(forth);
        repository.save(fifth);

        repository.removeById(3235);

        Product[] expected = {first, second, forth, fifth};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);

    }
}