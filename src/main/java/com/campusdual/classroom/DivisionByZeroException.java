package com.campusdual.classroom;

public class DivisionByZeroException extends Exception {
  public DivisionByZeroException() {
    super("No se puede dividir entre cero");
  }
}
