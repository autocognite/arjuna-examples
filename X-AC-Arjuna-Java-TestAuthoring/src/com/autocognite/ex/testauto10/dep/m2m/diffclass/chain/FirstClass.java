package com.autocognite.ex.testauto10.dep.m2m.diffclass.chain;

import org.apache.log4j.Logger;

import com.autocognite.batteries.config.RunConfig;
import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
public class FirstClass {
	private static Logger logger = RunConfig.getCentralLogger();
	
	@Dependency(testMethods = {"test1C2DepOnThird1_ShouldPass"}, containerClass=SecondClass.class)
	public void test1DepOnSec1_ShouldPass() throws Exception{
		Assertions.assertEquals(1,1);
	}

	@Dependency(testMethods = {"test2C2DepOnThird2_ShouldExclude"}, containerClass=SecondClass.class)
	public void test2DepOnSec2_ShouldExclude() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Dependency(testMethods = {"test3C2DepOnThird3_ShouldExclude"}, containerClass=SecondClass.class)
	public void test3DepOnSec3_ShouldExclude() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Dependency(testMethods = {"test4C2DepOnThird4_ShouldPass"}, containerClass=SecondClass.class)
	public void test4DepOnSec4_ShouldPass() throws Exception{
		Assertions.assertEquals(1,1);
	}
}
