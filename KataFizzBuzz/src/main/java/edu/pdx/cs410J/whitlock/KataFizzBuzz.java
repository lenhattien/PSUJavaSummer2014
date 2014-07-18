package edu.pdx.cs410J.whitlock;

/**
 * Created by letien on 7/9/14.
 */
public class KataFizzBuzz {
  public static void main(String[] args){
    int numberOfNumbers = 100;
    printNumbers(numberOfNumbers);
  }

  public static String[] printNumbers(int numberOfNumbers) {
    String[] numberArray = new String[numberOfNumbers];
    for (int i = 0; i < numberOfNumbers; i++){
        numberArray[i] = convertToFizzBuzz(i+1);
    }
    return numberArray;

  }

  public static String convertToFizzBuzz(int number) {
      if ((number % 3 == 0) && (number % 5 == 0)) {
        return "FizzBuzz";
      } else if(number % 3 == 0) {
        return "Fizz";
      }else if(number % 5 == 0) {
        return "Buzz";
      }else {
        return ((Integer) number).toString();
      }
  }
}

