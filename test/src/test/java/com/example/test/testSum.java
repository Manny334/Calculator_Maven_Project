package com.example.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class testSum {

	@Test
	public void sumTest() {
	       System.out.println("Sum");
	       Integer x = 15;
	       Integer y = 15;
	       Integer expResult = 30;
	       Integer result = Calculator.sum(x, y);
	       assertEquals(expResult, result);
	       assertEquals(null, Calculator.sum(15, null));
	       assertEquals(null, Calculator.sum(null, 15));
	       assertEquals(null, Calculator.sum(null, null));
	   }

}
