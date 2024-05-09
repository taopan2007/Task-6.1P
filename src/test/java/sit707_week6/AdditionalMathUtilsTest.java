package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class AdditionalMathUtilsTest {
    
	@Test
    public void testStudentIdentity() {
        String studentId = "221508095";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Tao Pan";
        Assert.assertNotNull("Student name is null", studentName);
    }
    @Test
    public void testSumOfEvenNumbersWithPositiveLimit() {
        Assert.assertEquals(30, AdditionalMathUtils.sumOfEvenNumbers(10)); // 2+4+6+8+10 = 30
    }

    @Test
    public void testSumOfEvenNumbersWithZero() {
        Assert.assertEquals(0, AdditionalMathUtils.sumOfEvenNumbers(0)); // Only zero
    }

    @Test
    public void testSumOfEvenNumbersWithNegativeLimit() {
        Assert.assertEquals(0, AdditionalMathUtils.sumOfEvenNumbers(-1)); // No loop iteration
    }

    @Test
    public void testFindFirstDivisibleByThreeAndFiveWithPositiveLimit() {
        Assert.assertEquals(15, AdditionalMathUtils.findFirstDivisibleByThreeAndFive(15)); // First is 15
    }

    @Test
    public void testFindFirstDivisibleByThreeAndFiveWithHigherLimit() {
        Assert.assertEquals(15, AdditionalMathUtils.findFirstDivisibleByThreeAndFive(20)); // Still 15
    }

    @Test
    public void testFindFirstDivisibleByThreeAndFiveWithNoValidNumber() {
        Assert.assertEquals(-1, AdditionalMathUtils.findFirstDivisibleByThreeAndFive(10)); // No number found
    }

    @Test
    public void testFindFirstDivisibleByThreeAndFiveWithZero() {
        Assert.assertEquals(-1, AdditionalMathUtils.findFirstDivisibleByThreeAndFive(0)); // No loop iteration
    }

    @Test
    public void testFindFirstDivisibleByThreeAndFiveWithNegativeLimit() {
        Assert.assertEquals(-1, AdditionalMathUtils.findFirstDivisibleByThreeAndFive(-10)); // No loop iteration
    }
    
    
}
