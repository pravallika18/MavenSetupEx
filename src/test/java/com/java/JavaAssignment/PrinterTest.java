package com.java.JavaAssignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrinterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Printer p=new Printer();
		Integer[] i= {1,2,6,4,5};
		Integer[] actual= p.printArray(i);
		assertArrayEquals(i, actual);
		
		
	}

}
