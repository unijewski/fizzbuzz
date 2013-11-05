package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	public void oneReturnsOne() {
		assertEquals("1", fizzBuzz.calculate(1));
	}

	@Test
	public void twoReturnsTwo() {
		assertEquals("2", fizzBuzz.calculate(2));
	}

	@Test
	public void threeReturnsFizz() {
		assertEquals("Fizz", fizzBuzz.calculate(3));
	}

	@Test
	public void fiveReturnsBuzz() {
		assertEquals("Buzz", fizzBuzz.calculate(5));
	}

	@Test
	public void sixReturnsFizz() {
		assertEquals("Fizz", fizzBuzz.calculate(6));
	}

	@Test
	public void tenReturnsBuzz() {
		assertEquals("Buzz", fizzBuzz.calculate(10));
	}

	@Test
	public void fifteenReturnsFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.calculate(15));
	}

	@Test
	public void thirteenReturnsFizz() {
		assertEquals("Fizz", fizzBuzz.calculate(13));
	}

	@Test
	public void thirtyOneReturnsFizz() {
		assertEquals("Fizz", fizzBuzz.calculate(31));
	}

	@Test
	public void fiftyTwoReturnsBuzz() {
		assertEquals("Buzz", fizzBuzz.calculate(52));
	}

	@Test
	public void fiftyThreeReturnsFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.calculate(53));
	}

	@Test
	public void fiftyFourReturnsFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.calculate(54));
	}

}
