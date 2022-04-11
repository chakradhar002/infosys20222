package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.Message;

public class TestJunit {

	String message = "hellow world";

	Message m = new Message(message);// created the object of Message class

	@Test
	public void testPrintMessage() {

		assertEquals(message, m.printMessage());//boht

	}

}
