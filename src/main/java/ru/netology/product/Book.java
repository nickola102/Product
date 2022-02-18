package ru.netology.product;

public class Book extends Product {

    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(int id, String name, int price, String name1, String author) {
        super(id, name, price);
        this.name = name1;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
