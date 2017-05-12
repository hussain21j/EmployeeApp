package com.springboot;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.Runner;

/**
 * Parameterized test mean, we can pass on conditions instead writing test method for each condition
 * steps involved
 * 	1. annotate your class with @Runwith(Paameterized.class)
 * 	2.write a static method which returns a collection of array if expected input 
 * 
 * @author Hussain
 *
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {
	private int numberA;
	private int numberB;
	private int sum;
	
	/*write the constructor , using this constructor the values will be injected for each test from the collection, in method marked with 
	annotation @Parameters*/
	public ParameterizedTest(int numberA, int numberB, int sum) {
		super();
		this.numberA = numberA;
		this.numberB = numberB;
		this.sum = sum;
	}
	
	/**Here we write our all the possible input and out put in two dimensional array
	 */
	@Parameters
	public static Collection<Object[]> testCondition(){
		Object object[][] = new Object[][]{
			{1,1,2},
			{2,2,4},
			{4,5,9}
		};
		return Arrays.asList(object);
	}
	
	/**
	 * This is the actual metthod to test
	 */
	@Test
	public void addTest(){
		Assert.assertEquals(sum, Math.addExact(numberA, numberB));
	}
}
