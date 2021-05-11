package com.jkx.Junit5ParameterizedTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest 
{
	private static App test1= new App();

	@ParameterizedTest
	@CsvFileSource(resources = "/Mydata.csv", numLinesToSkip = 1)
	void test(int X,int A,int B,int C,int expected) {
		assertEquals(expected, test1.foo(X,A,B,C));
	}
}
