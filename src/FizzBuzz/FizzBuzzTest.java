package FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Niklas on 2017-02-20.
 */
public class FizzBuzzTest {

    @Test
    public void ShouldReturnFizz() {
        Assert.assertEquals(Main.CalculateFizzbuzz(3),"Fizz");
    }

}