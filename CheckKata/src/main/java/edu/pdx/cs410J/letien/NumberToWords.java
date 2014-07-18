package edu.pdx.cs410J.letien;

/**
 * Created by letien on 7/17/14.
 */
public class NumberToWords {
  public static String numberToWords(double number) {
    return convertNumberToWords(number) + " " + getDollarWord(number);
  }

  private static String getDollarWord(double number) {
    if (number == 1.00) {
      return "dollar";
    }else {
      return "dollars";
    }

  }

  private static String convertNumberToWords(double number) {
    if (number == 1.00) {
      return "one";
    }else if (number == 2.00) {
      return "two";
    }else {
      return "empty";
    }
  }
}
