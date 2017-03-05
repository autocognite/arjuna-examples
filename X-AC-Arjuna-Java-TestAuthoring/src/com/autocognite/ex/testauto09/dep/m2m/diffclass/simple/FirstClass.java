package com.autocognite.ex.testauto09.dep.m2m.diffclass.simple;

import org.apache.log4j.Logger;

import com.autocognite.batteries.config.RunConfig;
import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
public class FirstClass {
	private static Logger logger = RunConfig.getCentralLogger();
	
	@Dependency(testMethods = {"testC2Pass"}, containerClass=SecondClass.class)
	public void test1() throws Exception{
		Assertions.assertEquals(1,1);
	}

	@Dependency(testMethods = {"testC2Fail"}, containerClass=SecondClass.class)
	public void test2() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Dependency(testMethods = {"testC2Error"}, containerClass=SecondClass.class)
	public void test3() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Dependency(testMethods = {"testC2Skipped"}, containerClass=SecondClass.class)
	public void test4() throws Exception{
		Assertions.assertEquals(1,1);
	}
}
