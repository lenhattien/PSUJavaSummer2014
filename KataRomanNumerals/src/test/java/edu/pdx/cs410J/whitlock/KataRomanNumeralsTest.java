package edu.pdx.cs410J.whitlock;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Ignore;
import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for the Student class.  These tests extend <code>InvokeMainTestCase</code>
 * which allows them to easily invoke the <code>main</code> method of <code>Student</code>.
 * They also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>matchers
 * for more readable assertion statements.
 */
public class KataRomanNumeralsTest {
  @Test
  public void KataRomanNumeralsFrom1To10() {
    assertThat(KataRomanNumerals.romanNumeralFor(1), equalTo("I"));
    assertThat(KataRomanNumerals.romanNumeralFor(2), equalTo("II"));
    assertThat(KataRomanNumerals.romanNumeralFor(3), equalTo("III"));
    assertThat(KataRomanNumerals.romanNumeralFor(4), equalTo("IV"));
    assertThat(KataRomanNumerals.romanNumeralFor(5), equalTo("V"));
    assertThat(KataRomanNumerals.romanNumeralFor(6), equalTo("VI"));
    assertThat(KataRomanNumerals.romanNumeralFor(7), equalTo("VII"));
    assertThat(KataRomanNumerals.romanNumeralFor(8), equalTo("VIII"));
    assertThat(KataRomanNumerals.romanNumeralFor(9), equalTo("IX"));
    assertThat(KataRomanNumerals.romanNumeralFor(10), equalTo("X"));
  }

  @Test
  public void KataRomanNumeralsFrom11To20() {
    assertThat(KataRomanNumerals.romanNumeralFor(11), equalTo("XI"));
    assertThat(KataRomanNumerals.romanNumeralFor(12), equalTo("XII"));
    assertThat(KataRomanNumerals.romanNumeralFor(13), equalTo("XIII"));
    assertThat(KataRomanNumerals.romanNumeralFor(14), equalTo("XIV"));
    assertThat(KataRomanNumerals.romanNumeralFor(15), equalTo("XV"));
    assertThat(KataRomanNumerals.romanNumeralFor(16), equalTo("XVI"));
    assertThat(KataRomanNumerals.romanNumeralFor(17), equalTo("XVII"));
    assertThat(KataRomanNumerals.romanNumeralFor(18), equalTo("XVIII"));
    assertThat(KataRomanNumerals.romanNumeralFor(19), equalTo("XIX"));
    assertThat(KataRomanNumerals.romanNumeralFor(20), equalTo("XX"));
  }

  @Test
  public void KataRomanNumeralsFor30And40And50() {
    assertThat(KataRomanNumerals.romanNumeralFor(30), equalTo("XXX"));
    assertThat(KataRomanNumerals.romanNumeralFor(40), equalTo("XL"));
    assertThat(KataRomanNumerals.romanNumeralFor(47), equalTo("XLVII"));
    assertThat(KataRomanNumerals.romanNumeralFor(50), equalTo("L"));
    assertThat(KataRomanNumerals.romanNumeralFor(63), equalTo("LXIII"));
  }

  @Test
  public void KataRomanNumeralsBetween50And100() {
    assertThat(KataRomanNumerals.romanNumeralFor(88), equalTo("LXXXVIII"));
    assertThat(KataRomanNumerals.romanNumeralFor(99), equalTo("XCIX"));
    assertThat(KataRomanNumerals.romanNumeralFor(100), equalTo("C"));
    assertThat(KataRomanNumerals.romanNumeralFor(247), equalTo("CCXLVII"));
  }

  @Test
  public void KataRomanNumeralsAround500() {
    assertThat(KataRomanNumerals.romanNumeralFor(247), equalTo("CCXLVII"));
    assertThat(KataRomanNumerals.romanNumeralFor(492), equalTo("CDXCII"));
    assertThat(KataRomanNumerals.romanNumeralFor(500), equalTo("D"));
  }

  @Test
  public void KataRomanNumeralsAround1000() {
    assertThat(KataRomanNumerals.romanNumeralFor(1999), equalTo("MCMXCIX"));
  }

  @Test
  public void KataRomanNumeralsAround4000() {
    assertThat(KataRomanNumerals.romanNumeralFor(3999), equalTo("MMMCMXCIX"));
  }

  @Test
  public void KataRomanNumeralsAround10000() {
    assertThat(KataRomanNumerals.romanNumeralFor(9999), equalTo("MMMMMMMMMCMXCIX"));
  }

  /*
  @Test
  public void oneIsI() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(1);
    assertTrue(romanNumeral.equals("I"));
  }

  @Test
  public void twoIsII() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(2);
    assertTrue(romanNumeral.equals("II"));
  }

  @Test
  public void threeIsIII() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(3);
    assertTrue(romanNumeral.equals("III"));
  }

  @Test
  public void fourIsIV() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(4);
    assertTrue(romanNumeral.equals("IV"));
  }
  @Test
  public void fiveIsV() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(5);
    assertTrue(romanNumeral.equals("V"));
  }
  @Test
  public void sixIsVI() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(6);
    assertTrue(romanNumeral.equals("VI"));
  }
  @Test
  public void sevenIsVII() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(7);
    assertTrue(romanNumeral.equals("VII"));
  }
  @Test
  public void eightIsVIII() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(8);
    assertTrue(romanNumeral.equals("VIII"));
  }
  @Test
  public void nineIsIX() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(9);
    assertTrue(romanNumeral.equals("IX"));
  }
  @Test
 public void tenIsX() {
  KataKataRomanNumerals kata = new KataKataRomanNumerals();
  String romanNumeral = kata.numToRoman(10);
  assertTrue(romanNumeral.equals("X"));
}

  @Test
  public void elevenIsXI() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(11);
    assertTrue(romanNumeral.equals("XI"));
  }


  @Test
  public void nineteenIsIXX() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(19);
    assertTrue(romanNumeral.equals("XIX"));
  }
  @Test
  public void twentyIsXX() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(20);
    assertTrue(romanNumeral.equals("XX"));
  }

  @Test
  public void twentytwoIsXXII() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(22);
    assertTrue(romanNumeral.equals("XXII"));
  }
  @Test
  public void fortyIsXL() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(40);
    assertTrue(romanNumeral.equals("XL"));
  }
  @Test
  public void fortyFiveIsXLV() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(45);
    assertTrue(romanNumeral.equals("XLV"));
  }

  @Test
  public void fifthtyIsL() {
    KataKataRomanNumerals kata = new KataKataRomanNumerals();
    String romanNumeral = kata.numToRoman(50);
    assertTrue(romanNumeral.equals("L"));
  }
  */

}
