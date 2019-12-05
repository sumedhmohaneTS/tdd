package co.interleap.courses.tdd;

import java.util.ArrayList;
import java.util.List;

public class VowelCounter {

  private static final List<Character> vowels = new ArrayList<Character>();

  static {
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
  }

  public Integer getCount(String input) {
    int count = 0;
    for (int i = 0; i < input.length(); i++) {
      if (vowels.indexOf(input.charAt(i)) > -1)
        count++;
    }
    return count;
  }
}
