package com.niit.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static com.niit.mockito.Demo.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class MockitoHelloWorld1 {
	private Demo d;

	@Before
	public void setupMock()
	{
		d=mock(Demo.class);
		when(d.greet()).thenReturn(Hello_world);
		
	}
    
	@Test
	public void fooGreets()
	{
		System.out.println("Demo greets:"+d.greet());
		assertEquals("Hello world",d.greet());
	}
	
	public void bargreets()
	{
		Bar bar=new Bar();
		assertEquals("Hello world",bar.greet(d));
	}

}
