package edu.pdx.cs410J.whitlock;

/**
 * Created by letien on 7/9/14.
 */
public class KataFizzBuzz {
  public static void main(String[] args){


  }

  public static String[] printNumbers(int numberOfNumbers) {

    String[] numberArray = new String[numberOfNumbers];
    for (int i = 0; i < numberOfNumbers; i++){
      if (((i + 1) % 3 == 0) && ((i + 1) % 5 == 0)) {
        numberArray[i] = "FizzBuzz";
      } else if((i + 1) % 3 == 0) {
        numberArray[i] = "Fizz";
      }else if((i + 1) % 5 == 0) {
        numberArray[i] = "Buzz";
      }else {
        numberArray[i] = ((Integer) (i + 1)).toString();
      }
    }
    return numberArray;
  }
}
