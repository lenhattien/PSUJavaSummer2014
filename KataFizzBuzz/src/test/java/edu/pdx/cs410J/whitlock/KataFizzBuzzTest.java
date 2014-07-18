package edu.pdx.cs410J.whitlock;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by letien on 7/9/14.
 */
public class KataFizzBuzzTest {

  @Test
  public void printNumbersOneToOneHundredLengthIsCorrect(){

   assertEquals(100, KataFizzBuzz.printNumbers(100).length);
  }

  /*
  @Test
  public void printNumbersOneToOneHundredContainsOneToOneHundred(){

    String[] numberArray = new String[100];
    for (int i = 0; i < 100; i++){
      numberArray[i] = ((Integer)(i+1)).toString();
    }

    assertEquals(numberArray , KataFizzBuzz.printNumbers(100));
    //assertTrue(numberArray.equals(KataFizzBuzz.printNumbers(100)));

  }


  @Ignore
  @Test
  public void printFizzAtMultipleOfThreeInRangeOneToOneHundred(){

    String[] numberArray = new String[100];
    for (int i = 0; i < 100; i++){
      if((i + 1) % 3 == 0) {
        numberArray[i] = "Fizz";
      }else {
        numberArray[i] = ((Integer) (i + 1)).toString();
      }
    }
    String[] testNumbers = KataFizzBuzz.printNumbers(100);
    for (int i = 0; i < 100; i++){
        assertEquals(numberArray[i], testNumbers[i]);
    }

  }

  @Test
  public void printAlsoBuzzAtMultipleOfFiveInRangeOneToOneHundred(){

    String[] numberArray = new String[100];
    for (int i = 0; i < 100; i++){
      if((i + 1) % 3 == 0) {
        numberArray[i] = "Fizz";
      }else if((i + 1) % 5 == 0) {
        numberArray[i] = "Buzz";
      }
      else {
        numberArray[i] = ((Integer) (i + 1)).toString();
      }
    }
    String[] testNumbers = KataFizzBuzz.printNumbers(100);
    for (int i = 0; i < 100; i++){
      assertEquals(numberArray[i], testNumbers[i]);
    }

  }
  */

  @Test
  public void numberThreeReturnFizz(){
    String result = KataFizzBuzz.convertToFizzBuzz(3);
    assertEquals(result, "Fizz");
  }

  @Test
  public void numberFourReturn4(){
    String result = KataFizzBuzz.convertToFizzBuzz(4);
    assertEquals(result, "4");
  }

  @Test
  public void numberFiveReturnBuzz(){
    String result = KataFizzBuzz.convertToFizzBuzz(5);
    assertEquals(result, "Buzz");
  }

  @Test
  public void numberFifteenReturnFizzBuzz(){
    String result = KataFizzBuzz.convertToFizzBuzz(15);
    assertEquals(result, "FizzBuzz");
  }

  @Test
  public void printAlsoFizzBuzzAtMultipleOfThreeAndFiveInRangeOneToOneHundred(){

    String[] numberArray = new String[100];
    for (int i = 0; i < 100; i++){
      if (((i + 1) % 3 == 0) && ((i + 1) % 5 == 0)) {
        numberArray[i] = "FizzBuzz";
      } else if((i + 1) % 3 == 0) {
        numberArray[i] = "Fizz";
      }else if((i + 1) % 5 == 0) {
        numberArray[i] = "Buzz";
      }
      else {
        numberArray[i] = ((Integer) (i + 1)).toString();
      }
    }
    String[] testNumbers = KataFizzBuzz.printNumbers(100);
    for (int i = 0; i < 100; i++){
      assertEquals(numberArray[i], testNumbers[i]);
    }

  }
}
// 37 51