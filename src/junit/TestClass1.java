package junit;

import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class TestClass1 {
	public boolean checkValidLogin() {
		return true;
	}

	@Before
	public void InitiateAllVariables() {
		System.out.println("Initiating all variables");
		Assume.assumeTrue(checkValidLogin());
	}

	@Test
	public void OrderCreationTest() {
		System.out.println("This is in Order Creation Test");
	}

	@Test
	public void OrderDeletionTest() {
		System.out.println("This is in Order Deletion Test");
	}

	@After
	public void KillAllObjects() {
		System.out.println("Killing All Objects");
	}

	/*
	 * @BeforeClass
	 * 
	 * @AfterClass
	 */
}
