package com.niit.mockito;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Spy;
import static org.mockito.Mockito.*;


public class MockitoSpyMethodExample {
	@Spy
	List<String> spyOnList;

	@Test
	public void test()
	{
		List<String> list=new ArrayList<>();
		 spyOnList=spy(list);
		
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10,spyOnList.size());
		
		spyOnList.add("Pagal");
		spyOnList.add("arpana");
		assertEquals("Pagal",spyOnList.get(0));
		assertEquals("arpana",spyOnList.get(1));
		
		System.out.println(spyOnList.get(0));
		System.out.println(spyOnList.get(1));
		
		
		
		
	}
}
