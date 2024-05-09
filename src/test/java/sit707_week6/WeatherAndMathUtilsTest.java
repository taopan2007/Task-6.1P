package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
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
    public void testFalseNumberIsEven() {
        Assert.assertFalse("Number 3 is even, should be false", WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testCancelWeatherHighWind() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }

    @Test
    public void testCancelWeatherBothHigh() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46, 5));
    }

    @Test
    public void testWeatherAdviceCancelHighRain() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.1));
    }

    @Test
    public void testWeatherAdviceWarnHighWindOnly() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 3.0));
    }

    
    @Test
    public void testWeatherAdviceWarnHighRainOnly() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(44.0, 4.1));
    }

    
    @Test
    public void testWeatherAdviceAllClear() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(44.0, 3.9));
    }



    @Test
    public void testIsEvenTrue() {
        Assert.assertTrue("Number 2 is even, should be true", WeatherAndMathUtils.isEven(2));
    }
    
    @Test
    public void testIsEvenFalse() {
        Assert.assertFalse("Number 3 is not even, should be false", WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testIsPrimeTrue() {
        Assert.assertTrue("Number 5 should be prime", WeatherAndMathUtils.isPrime(5));
    }

    @Test
    public void testIsPrimeFalse() {
        Assert.assertFalse("Number 4 should not be prime", WeatherAndMathUtils.isPrime(4));
    }
    @Test
    public void testIsPrimeEdgeCase() {
        Assert.assertFalse("Number 1 is conventionally not prime, should return false", WeatherAndMathUtils.isPrime(1));
    }



    
    
}
