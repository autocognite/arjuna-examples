package com.autocognite.ex.testauto10.dep.m2m.diffclass.chain;

import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
public class SecondClass {
	
	@Dependency(testMethods = {"test1C3Pass"}, containerClass=ThirdClass.class)
	public void test1C2DepOnThird1_ShouldPass() throws Exception{
		Assertions.assertEquals(1,1);
	}

	@Dependency(testMethods = {"test2C3Fail"}, containerClass=ThirdClass.class)
	public void test2C2DepOnThird2_ShouldExclude() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Dependency(testMethods = {"test3C3Error"}, containerClass=ThirdClass.class)
	public void test3C2DepOnThird3_ShouldExclude() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Dependency(testMethods = {"test4C3Skipped"}, containerClass=ThirdClass.class)
	public void test4C2DepOnThird4_ShouldPass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
}
