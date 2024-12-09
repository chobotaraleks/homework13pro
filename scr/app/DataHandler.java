package app;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataHandler {

  private final Lock lock = new ReentrantLock();

  public int modify(int num) {
    lock.lock(); // Захоплення блокування
    try {
      num = num * 3; // Модифікація числа
      return num;
    } finally {
      lock.unlock(); // Звільнення блокування (завжди, запам'ятати!)
    }
  }
}
