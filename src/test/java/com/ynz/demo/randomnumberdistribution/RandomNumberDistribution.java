package com.ynz.demo.randomnumberdistribution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Given 100 persons, each having 100 dkk IF in one round, each person randomly select only one
 * person to give out 1 DKK. THEN iterating this process for many loops.
 *
 * <p>We want to conclude does the money will evenly go to each person? or say, are really person
 * equally lucky naturally?
 */
public class RandomNumberDistribution {
  static Random r = new Random();
  static Person[] persons = new Person[100];

  public static void main(String[] args) {
    // 100 persons, each having 100DKK
    IntStream.range(0, 100).forEach(i -> persons[i] = new Person(i, 100));

    for (int i = 0; i < 10000; i++) {

      // each person randomly select one person to give one DKK
      for (var person : persons) {
        // randomly select one person.
        var index = r.nextInt(0, 100);

        // person give 1DKK, lucky man get 1DKK.
        person.giveOneDKK();
        persons[index].addOneDKK();
      }
    }

    Arrays.sort(persons, Comparator.comparing(Person::getMountOfMoney).reversed());
    printAllPerson();
  }

  private static void printAllPerson() {
    System.out.println(Arrays.asList(persons));
  }
}
