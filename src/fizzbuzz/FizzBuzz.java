package fizzbuzz;

import org.apache.log4j.Logger;

public class FizzBuzz {

	static Logger logger = Logger.getLogger(FizzBuzz.class);

	public String calculate(int i) {
		logger.debug("Liczba: " + i);
		logger.info("Jestę info" + i);
		logger.error("Jestę errorę" + i);
		logger.warn("Jestę warningię" + i);
		logger.fatal("Jestę fatalem" + i);
		if (isFizz(i) && isBuzz(i))
			return "FizzBuzz";
		if (isFizz(i))
			return "Fizz";
		if (isBuzz(i))
			return "Buzz";

		return String.valueOf(i);
	}

	private boolean isModulo(int dividend, int divisor) {
		return dividend % divisor == 0;
	}

	private boolean isFizz(int i) {
		return isModulo(i, 3) || checkThree(i);
	}

	private boolean isBuzz(int i) {
		return isModulo(i, 5) || checkFive(i);
	}

	public static boolean checkThree(int i) {
		String s = Integer.toString(i);
		if (s.contains("3"))
			return true;
		return false;
	}

	public static boolean checkFive(int i) {
		String s = Integer.toString(i);
		if (s.contains("5"))
			return true;
		return false;
	}

}
