package sit707_week6;

public class AdditionalMathUtils {

    /**
     * Computes the sum of even numbers up to a given limit.
     * 
     * @param limit the upper limit.
     * @return the sum of even numbers.
     * 
     * 
     */

    public static int sumOfEvenNumbers(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Finds the first number divisible by both 3 and 5 within a given range.
     * 
     * @param limit the upper limit.
     * @return the first number divisible by both 3 and 5, or -1 if none found.
     */
    public static int findFirstDivisibleByThreeAndFive(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                return i;
            }
        }
        return -1;
    }
}
