package model;

public class LimitProductesException extends Exception {
    public LimitProductesException() {
        super("El maxim de productes al carro son 100.");
    }
}

