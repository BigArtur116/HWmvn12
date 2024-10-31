package ru.netology.javaqa95.HWmvn12.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    Poster item1 = new Poster(22, "Runner", "actions", "url22", 2001);
    Poster item2 = new Poster(568, "In end out", "comedy", "url568", 2012);
    Poster item3 = new Poster(3678, "Saved", "melodram", "url3678", 2024);
    Poster item4 = new Poster(527, "Поезд не туда", "actions", "url527", 2011);
    Poster item5 = new Poster(786, "ИО", "comedy", "url786", 2022);
    Poster item6 = new Poster(2788, "Совесть", "melodram", "url2788", 2010);
    Poster item7 = new Poster(72, "Беги пока можешь", "actions", "url72", 2007);
    Poster item8 = new Poster(287, "Если хочешь", "comedy", "url287", 2015);
    Poster item9 = new Poster(728, "Без тебя", "melodram", "url728", 2021);
    Poster item10 = new Poster(782, "Псих", "actions", "url782", 2005);

    ProductManager repo = new ProductManager();

    @Test
    void saveTest() {
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        Poster[] expect = {item1, item2, item3};
        Poster[] actual = repo.getItems();

        Assertions.assertArrayEquals(expect, actual);

    }

    @Test
    void findAllTest() {
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);

        Poster[] expect = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10};
        Poster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expect, actual);
    }
    @Test
    void listLimitTest() {


        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);

        Poster[] expect = {item10, item9, item8, item7, item6};
        Poster[] actual = repo.limit();

        Assertions.assertArrayEquals(expect, actual);

    }

    @Test
    void listLimitTest8() {

        repo = new  ProductManager(8);

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.save(item9);
        repo.save(item10);

        Poster[] expect = {item10, item9, item8, item7, item6, item5, item4, item3};
        Poster[] actual = repo.limit();

        Assertions.assertArrayEquals(expect, actual);

    }

    @Test
    void listLimitTest3() {

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        Poster[] expect = {item3, item2, item1};
        Poster[] actual = repo.limit();

        Assertions.assertArrayEquals(expect, actual);

    }
}