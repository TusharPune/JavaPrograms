package Java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotations {
	@Test
	public void main() {
		System.out.println("Test 1");
	}

	@Test
	public void main2() {
		System.out.println("Test 2");
	}

	@BeforeTest
	public void main3() {
		System.out.println("@BeforeTest");
	}

	@BeforeMethod
	public void main4() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void main5() {
		System.out.println("@AfterMethod");
	}

	@AfterTest
	public void main6() {
		System.out.println("@AfterTest");
	}

}
