/**
 * Print FizzBuzz results from 1 to 100.
 *
 * @author Mark Nelson
 * @see http://en.wikipedia.org/wiki/Fizz_buzz
 * @since 5.0
 */

/**
 * Implement FizzBuzz algorithm and print results.
 */
public class FizzBuzz {

  /**
   * Compute FizzBuzz.  If the value is a multiple of 3, return Fizz.  If the value
   * is a multiple of 5, return Buzz.  If the value is both a multiple of 3 and 5
   * return FizzBuzz.  If none of the above, return the integer.
   *
   * @param i The input value from which to compute FizzBuzz.
   * @return The string result of the FizzBuzz algorithm.
   */
  public static String computeValue(Integer i) {
    String result = i.toString();

    if (i % 3 == 0) {
      result = "Fizz";
    }

    if (i % 5 == 0) {
      result = "Buzz";
    }

    if (i % 3 == 0 && i % 5 == 0) {
      result = "FizzBuzz";
    }

    return result;
  }

  /**
   * Entry point for application.
   *
   * @param args Unused
   */
  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
      System.out.printf("%s \n", computeValue(i));
    }
  }

}
