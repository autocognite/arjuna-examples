package com.autocognite.ex.testauto10.dep.m2m.diffclass.chain;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class FirstClass {
	
	@MethodDependency(testMethods = {"test1C2DepOnThird1_ShouldPass"}, containerClass=SecondClass.class)
	public void test1DepOnSec1_ShouldPass() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}

	@MethodDependency(testMethods = {"test2C2DepOnThird2_ShouldExclude"}, containerClass=SecondClass.class)
	public void test2DepOnSec2_ShouldExclude() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
	@MethodDependency(testMethods = {"test3C2DepOnThird3_ShouldExclude"}, containerClass=SecondClass.class)
	public void test3DepOnSec3_ShouldExclude() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
	@MethodDependency(testMethods = {"test4C2DepOnThird4_ShouldPass"}, containerClass=SecondClass.class)
	public void test4DepOnSec4_ShouldPass() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
}
