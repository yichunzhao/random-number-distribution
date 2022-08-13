package com.ynz.demo.randomnumberdistribution;

public class Person {
  private int index;
  private int mountOfMoney;

  public Person(int index, int mountOfMoney) {
    this.index = index;
    this.mountOfMoney = mountOfMoney;
  }

  public int addOneDKK() {
    return mountOfMoney += 1;
  }

  public int getMountOfMoney() {
    return mountOfMoney;
  }

  public void giveOneDKK() {
    if (this.mountOfMoney > 0) {
      this.mountOfMoney -= 1;
    }
  }

  @Override
  public String toString() {
    return "Person{" + "index=" + index + ", mountOfMoney=" + mountOfMoney + '}';
  }
}
