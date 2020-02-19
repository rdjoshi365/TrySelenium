package Project2.MavenTestProjectOne;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest 
{
	@BeforeTest
	void method1()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	void method2()
	{
		System.out.println("After Test");
	}
	@Test
	void method3()
	{
		System.out.println("Test");
	}
	@Test
	void method4()
	{
		System.out.println("Test");
	}
	@BeforeMethod
	void method5()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	void method6()
	{
		System.out.println("After Method");
	}
	void method7()
	{
		System.out.println("Before Suite");
	}

}
