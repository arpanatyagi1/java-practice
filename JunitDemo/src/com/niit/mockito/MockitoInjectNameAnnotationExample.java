package com.niit.mockito;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoInjectNameAnnotationExample {

	@Mock
	List<String> mockList;
	
	@InjectMocks
	Fruits mockFruits;
	
	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void test()
	{
		when(mockList.get(0)).thenReturn("Apple");//stubing means using the predefined class 
		when(mockList.size()).thenReturn(1);
		assertEquals("Apple",mockList.get(0));
		assertEquals(1,mockList.size());
		assertEquals("Apple",mockFruits.getNames().get(0));
		assertEquals(1,mockFruits.getNames().size());
		
		mockList.add(1,"Mango");//mocklist is a dummy object
		System.out.println(mockList.get(0));
		
	}
	

}
