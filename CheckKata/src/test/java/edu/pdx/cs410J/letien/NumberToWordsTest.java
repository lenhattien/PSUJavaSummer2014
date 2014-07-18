package edu.pdx.cs410J.letien;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by letien on 7/17/14.
 */
public class NumberToWordsTest {

  @Test
  public void number1IsOne() {
    assertThat(NumberToWords.numberToWords(1.00), equalTo("one dollar"));
  }

  @Test
  public void number2IsTwo() {
    assertThat(NumberToWords.numberToWords(2.00), equalTo("two dollars"));
  }


}
