package co.interleap.courses.tdd;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VowelCounterTest {

  @Test
  public void testEmptyString() {
    assertEquals(Integer.valueOf(0), new VowelCounter().getCount(""));
  }

  @Test
  public void testSingleVowel() {
    assertEquals(Integer.valueOf(1), new VowelCounter().getCount("a"));
  }

  @Test
  public void testMultipleVowel() {
    assertEquals(Integer.valueOf(5), new VowelCounter().getCount("aeiou"));
  }


}
