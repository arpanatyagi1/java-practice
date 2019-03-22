package com.niit.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static com.niit.mockito.Demo.*;

import org.junit.Test;

public class MockitoHelloWorld {

	@Test
	public void demoGreets()
	{
		Demo d=mock(Demo.class);
		when(d.greet()).thenReturn(Hello_world);
		System.out.println("Demo greets:"+d.greet());
		assertEquals(d.greet(),Hello_world);
	}

}
