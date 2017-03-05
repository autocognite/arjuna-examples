package com.autocognite.ex.testauto09.dep.m2m.diffclass.simple;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class FirstClass {
	
	@MethodDependency(testMethods = {"testC2Pass"}, containerClass=SecondClass.class)
	public void test1() throws Exception{
		assertEquals(1,1);
	}

	@MethodDependency(testMethods = {"testC2Fail"}, containerClass=SecondClass.class)
	public void test2() throws Exception{
		assertEquals(1,1);
	}
	
	@MethodDependency(testMethods = {"testC2Error"}, containerClass=SecondClass.class)
	public void test3() throws Exception{
		assertEquals(1,1);
	}
	
	@MethodDependency(testMethods = {"testC2Skipped"}, containerClass=SecondClass.class)
	public void test4() throws Exception{
		assertEquals(1,1);
	}
}
