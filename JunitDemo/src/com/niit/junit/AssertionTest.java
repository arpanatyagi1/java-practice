package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionTest {
    @Test
	public void testAssert()
	{
		String string1="Junit";
		String string2="Juni";
		String string3="test";
		String string4="test";
		String string5=null;
		int variable1=1;
		int variable2=2;
		int[] arithmeticArray1= {1,2,3};
		int[] arithmeticArray2= {1,2,3};
		
		assertEquals(string1,string2);
		assertSame(string3,string4);
		assertNotSame(string1,string3);
		assertNull(string5);
		assertTrue(variable1<variable2);
		assertArrayEquals(arithmeticArray1,arithmeticArray2);
		
	}
}
