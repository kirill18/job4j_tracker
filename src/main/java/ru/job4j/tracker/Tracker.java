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
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] itemsCopy = new Item[size];
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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item replaceItem) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            replaceItem.setId(id);
            items[index] = replaceItem;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        items[index] = null;
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        items[size - 1] = null;
        size--;
        return  findById(id) == null;
    }
}