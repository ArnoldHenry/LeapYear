import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {
 @Test
    public void isLeapYear_numberDivisibleByFour_true(){
     LeapYear leapYear = new LeapYear();
     assertTrue(leapYear.isLeapYear(2000));

 }
}
