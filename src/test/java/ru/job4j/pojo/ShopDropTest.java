package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class ShopDropTest {
    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.delete(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.delete(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenArrayLengthIs4AndDeleteElementWithIndex1() {
        Product[] products = new Product[4];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        int index = 1;
        Product[] rsl = ShopDrop.delete(products, index);
        assertThat(rsl[index].getName(), is("Milk"));
        assertThat(rsl[2].getName(), is("Fish"));
        assertThat(rsl[products.length - 1], is(nullValue()));
    }

    @Test
    public void whenArrayLengthIs5AndDeleteElementWithIndex2() {
        Product[] products = new Product[5];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Fruit", 8);
        int index = 2;
        Product[] rsl = ShopDrop.delete(products, index);
        assertThat(rsl[1].getName(), is("Egg"));
        assertThat(rsl[index].getName(), is("Fish"));
        assertThat(rsl[3].getName(), is("Fruit"));
        assertThat(rsl[products.length - 1], is(nullValue()));
    }

    @Test
    public void whenArrayLengthIs10AndDeleteElementWithIndex0() {
        Product[] products = new Product[10];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Fruit", 8);
        products[5] = new Product("Chocolate", 4);
        products[6] = new Product("Beer", 10);
        products[7] = new Product("Vodka", 2);
        products[8] = new Product("Vine", 3);
        products[9] = new Product("Apple", 8);
        int index = 0;
        Product[] rsl = ShopDrop.delete(products, index);
        assertThat(rsl[index].getName(), is("Egg"));
        assertThat(rsl[1].getName(), is("Milk"));
        assertThat(rsl[2].getName(), is("Fish"));
        assertThat(rsl[3].getName(), is("Fruit"));
        assertThat(rsl[4].getName(), is("Chocolate"));
        assertThat(rsl[5].getName(), is("Beer"));
        assertThat(rsl[6].getName(), is("Vodka"));
        assertThat(rsl[7].getName(), is("Vine"));
        assertThat(rsl[8].getName(), is("Apple"));
        assertThat(rsl[products.length - 1], is(nullValue()));
    }
}