package model;

public class NegatiuException extends RuntimeException {
  public NegatiuException() {
    super("El maxim de productes al carro son 100.");
  }
}
