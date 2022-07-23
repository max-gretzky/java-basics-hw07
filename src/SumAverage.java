/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    // TODO fill in code here using for loop and replace the return statement
    int sumOfInt = 0;
    for (int i = lowerBound; i <= upperBound; i++) {
      sumOfInt += i;
    }
    return sumOfInt;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    // TODO fill in code here using for each loop and replace the return statement
    int sumOfInt = 0;
    for (int i :
         numbers) {
      sumOfInt += i;
    }
    return sumOfInt;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    // TODO fill in code here using while loop and replace the return statement
    double sumOfInt = 0;
    int count = 0;
    while (lowerBound <= upperBound) {
      sumOfInt += lowerBound;
      count++;
      lowerBound++;
    }
    return sumOfInt / count;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
    double sumOfInt = 0;
    int i = 0;
    do {
      sumOfInt += numbers[i];
      i++;
    } while (
            (i < numbers.length)
    );
    return sumOfInt / numbers.length;
  }
}