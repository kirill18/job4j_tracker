package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.print("Активно: " + active + " ");
        System.out.print("Статус: " + status + " ");
        System.out.print("Опсиание: " + message + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        Error fatal = new Error(true, 1, "Fatal error");
        Error notFatal = new Error();
        fatal.printInfo();
        notFatal.printInfo();

    }
}
