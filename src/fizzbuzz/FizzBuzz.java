package fizzbuzz;

import org.apache.log4j.Logger;

public class FizzBuzz {

	static Logger logger = Logger.getLogger(FizzBuzz.class);

	public String calculate(int i) {
		logger.debug("Liczba: " + i);
		logger.info("Info: " + i);
		logger.error("Error: " + i);
		logger.warn("Warning: " + i);
		logger.fatal("Fatal: " + i);
		if (isFizz(i) && isBuzz(i)) {
			return "FizzBuzz";
		}
		if (isFizz(i)) {
			return "Fizz";
		}
		if (isBuzz(i)) {
			return "Buzz";
		}

		return String.valueOf(i);
	}

	private boolean isModulo(int dividend, int divisor) {
		return dividend % divisor == 0;
	}

	private boolean isFizz(int i) {
		return isModulo(i, 3) || checkContents(i, "3");
	}

	private boolean isBuzz(int i) {
		return isModulo(i, 5) || checkContents(i, "5");
	}

	public static boolean checkContents(int i, String number) {
		String s = Integer.toString(i);
		if (s.contains(number)) {
			return true;
		}
		return false;
	}

}