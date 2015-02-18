/**
 * Test FizzBuzz results.
 *
 * @author Mark Nelson
 * @see http://en.wikipedia.org/wiki/Fizz_buzz
 * @since 5.0
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Implement FizzBuzz test cases.
 */
public class FizzBuzzTest {

  /**
   * Execute four FizzBuzz test cases for each category of input.
   *
   * @throws Exception On error.
   */
  @Test
  public void testComputeValue() throws Exception {

    assertEquals("Test multiple of 3", "Fizz", FizzBuzz.computeValue(3));
    assertEquals("Test multiple of 5", "Buzz", FizzBuzz.computeValue(5));
    assertEquals("Test multiple of 3 and 5", "FizzBuzz", FizzBuzz.computeValue(15));
    assertEquals("Test non-multiples of neither 3 nor 5", "2", FizzBuzz.computeValue(2));
  }
}