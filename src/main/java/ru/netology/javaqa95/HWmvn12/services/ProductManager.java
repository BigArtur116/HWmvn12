package ru.netology.javaqa95.HWmvn12.services;

import java.util.Arrays;

public class ProductManager {
    private Poster[] items = new Poster[0];

    private int listLimit = 5;

    public ProductManager(int listLimit) {
        this.listLimit = listLimit;
    }

    public ProductManager() {
    }

    public void save(Poster item) {
        Poster[] tmp = new Poster[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Poster[] getItems() {
        return items;
    }

    public Poster[] findAll() {
        return items;

    }

    public Poster[] limit() {
        int resultLength;
        if (listLimit < items.length) {
            resultLength = listLimit;
        } else {
            resultLength = items.length;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }

}
