package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsCopy = new Item[items.length];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                itemsCopy[index] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(itemsCopy, count);
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] itemsCopy = new Item[items.length];
        for (int index = 0; index < size; index++) {
            String name = items[index].getName();
            if (key.equals(name)) {
                itemsCopy[index] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(itemsCopy, count);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}