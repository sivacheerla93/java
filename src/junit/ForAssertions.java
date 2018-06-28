package junit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ForAssertions {
	@Rule
	public ErrorCollector objCollector = new ErrorCollector();

	@Test
	public void TestMyInteger() {
		int expected = 51;
		int actual = 50;

		try {
			Assert.assertEquals("Integer Mismatch", expected, actual);
		} catch (Throwable objExp) {
			objCollector.addError(objExp);
		}

		try {
			Assert.assertEquals("String Mismatch", "A", "B");
		} catch (Throwable objExp) {
			objCollector.addError(objExp);
		}
	}
}
