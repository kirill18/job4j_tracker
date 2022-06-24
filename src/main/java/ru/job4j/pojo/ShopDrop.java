package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length - 1; i++) {
            if (i == index) {
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
            }
            if (i == products.length - 2) {
                products[i + 1] = null;
            }
        }
        return products;
    }
}