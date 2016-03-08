package javatest.utils.regex;

import java.util.regex.Pattern;

public class RegexTest {
	static public void main() {
		matchesTest();
	}

	static private void matchesTest() {
		Pattern NUMERIC = Pattern.compile("[-]?[0-9]+");
		System.out.println(NUMERIC.matcher("1").matches());
		System.out.println(NUMERIC.matcher("1.0").matches());
		System.out.println(NUMERIC.matcher("1.1").matches());
		System.out.println(NUMERIC.matcher("-1.1").matches());
		System.out.println(NUMERIC.matcher("1.1").find());
		//System.out.println(NUMERIC.matcher("1.1").group());
	}
}
