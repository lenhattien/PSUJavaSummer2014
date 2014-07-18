package edu.pdx.cs410J.whitlock;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.exit;

/**                                                                                 
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class KataRomanNumerals  {
  public static String romanNumeralFor(int number) {
    StringBuilder sb = new StringBuilder();

    romanNumeralFor(number, sb);

    return sb.toString();
  }

  private static Map<Integer, String> numeralsForGreaterThan = new LinkedHashMap<>();

  static {
    numeralsForGreaterThan.put(1000, "M");
    numeralsForGreaterThan.put(900, "CM");
    numeralsForGreaterThan.put(500, "D");
    numeralsForGreaterThan.put(400, "CD");
    numeralsForGreaterThan.put(100, "C");
    numeralsForGreaterThan.put(90, "XC");
    numeralsForGreaterThan.put(50, "L");
    numeralsForGreaterThan.put(40, "XL");
    numeralsForGreaterThan.put(10, "X");
    numeralsForGreaterThan.put(9, "IX");
    numeralsForGreaterThan.put(5, "V");
    numeralsForGreaterThan.put(4, "IV");
    numeralsForGreaterThan.put(1, "I");
  }

  private static void romanNumeralFor(int number, StringBuilder sb) {

    for (int max : numeralsForGreaterThan.keySet()) {
      if (number >= max) {
        sb.append(numeralsForGreaterThan.get(max));
        romanNumeralFor(number - max, sb);
        break;
      }
    }

  }

  /*
  public String numToRoman(int number){
    // special char for 1000 in Roman
    String result = "";
    while(number>=40){
      if(number-50 >= 0) {
        result = "L" + result;
        number -= 50;
      } else {
        result = result + "L";
        number = -1*(number - 50);
      }
    }
    while(number > 10) {

        result = "X" + result;
        number -= 10;
        //if(number >= 40 && number <= 89) {
        //    result = "L" + result;
        //}
    }
    result += convertDigit(number);
    System.out.println(result);
    return result;
  }



  private String convertDigit(int number) {
    switch (number) {
      case 1:
        return "I";
      case 2:
        return "II";
      case 3:
        return "III";
      case 4:
        return "IV";
      case 5:
        return "V";
      case 6:
        return "VI";
      case 7:
        return "VII";
      case 8:
        return "VIII";
      case 9:
        return "IX";
      case 10:
        return "X";
      default:
        return "";
    }
  }
  */
}