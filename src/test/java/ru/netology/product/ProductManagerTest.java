package ru.netology.product;

import org.junit.jupiter.api.Test;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {


    Product first = new Product(1354, "1984", 300);
    Product second = new Product(2687, "Hard Rock Cafe", 800);
    Product third = new Product(3235, "6S Plus", 25000);
    Product forth = new Product(435, "Harry Potter", 600);
    Product fifth = new Product(568, "Blade", 15000);
    Product sixth = new Product(6254, "A19", 18000);
    Book seventh = new Book("George Orwell");
    Smartphone eighth = new Smartphone("ZTE");
    private ProductRepository repository;


    @Test
    public void shouldSearchBy() {

        ProductManager manager = new ProductManager(repository);
        String text = "19";

        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(forth);
        repository.save(fifth);
        repository.save(sixth);

        manager.searchBy(text);

        Product[] expected = {first, sixth};
        Product[] actual = repository.findAll();


        assertArrayEquals(expected, actual);
    }

    @Test
    void matches() {
    }
}