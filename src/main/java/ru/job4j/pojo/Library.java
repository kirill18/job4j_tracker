package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book bookOne = new Book("The road", 333);
        Book bookTwo = new Book("The witcher", 444);
        Book bookThree = new Book("Dead souls", 555);
        Book bookFour = new Book("Clean code", 123);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (Book book:books) {
            System.out.println("Название - " + book.getName() + "\tКоличество листов - " + book.getCount());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book:books) {
            System.out.println("После замены индексов " + "Название - " + book.getName() + "\tКоличество листов - " + book.getCount());
        }
        for (Book book:books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println("Только с именем \"Clean code\" " + "Название - " + book.getName() + "\tКоличество листов - " + book.getCount());
                break;
            }
        }
    }
}
