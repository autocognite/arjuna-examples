package com.autocognite.ex.testauto10.dep.m2m.diffclass.chain;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class SecondClass {
	
	@MethodDependency(testMethods = {"test1C3Pass"}, containerClass=ThirdClass.class)
	public void test1C2DepOnThird1_ShouldPass() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}

	@MethodDependency(testMethods = {"test2C3Fail"}, containerClass=ThirdClass.class)
	public void test2C2DepOnThird2_ShouldExclude() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
	@MethodDependency(testMethods = {"test3C3Error"}, containerClass=ThirdClass.class)
	public void test3C2DepOnThird3_ShouldExclude() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
	@MethodDependency(testMethods = {"test4C3Skipped"}, containerClass=ThirdClass.class)
	public void test4C2DepOnThird4_ShouldPass() throws Exception{
		assertEquals("Sample Purpose", 1,1);
	}
	
}
