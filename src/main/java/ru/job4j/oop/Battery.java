package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        int temp = another.load;
        another.load += this.load;
        if (another.load == 100) {
            this.load = 0;
        } else {
            this.load -= temp;

        }
    }
}
