package com.telsoft.outsourcing.sample.samplejar;

import static org.junit.Assert.*;

import org.junit.Test;

import com.telsoft.outsourcing.sample.samplejar.HelloWorld;
import com.telsoft.outsourcing.sample.samplejar.HelloWorldImpl;

public class HelloWorldTest {

	@Test
	public void test() {
		
		HelloWorld helloWorld = new HelloWorldImpl();
		
		assertEquals("Hello Huyen", helloWorld.getHelloGreeting("Huyen"));
	}

}
