package fizzbuzz;

import org.testng.Assert;
import org.testng.annotations.*;

public class FizzBuzzTestNG {

	FizzBuzz fizzBuzz = new FizzBuzz();

	@DataProvider
	public Object[][] ValidDataProvider() {
		return new Object[][] { { "1", 1 }, { "2", 2 }, { "Fizz", 3 },
				{ "Buzz", 5 }, { "Fizz", 6 }, { "Buzz", 10 },
				{ "FizzBuzz", 15 }, { "Fizz", 13 }, { "Fizz", 31 },
				{ "Buzz", 52 }, { "FizzBuzz", 53 }, { "FizzBuzz", 54 }

		};
	}

	@Test(dataProvider = "ValidDataProvider")
	public void returnsNumberOrFizzOrBuzzOrFizzBuzz(String element, int number) {
		Assert.assertEquals(fizzBuzz.calculate(number), element);
	}
}
