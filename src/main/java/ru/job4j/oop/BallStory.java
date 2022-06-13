package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Fox fox = new Fox();
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        fox.tryEat(ball);
        wolf.tryEat(ball);
        hare.tryEat(ball);
    }
}
