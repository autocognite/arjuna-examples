package com.autocognite.ex.testauto11.dep.m2c;

import org.apache.log4j.Logger;

import com.autocognite.batteries.config.RunConfig;
import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;
import com.autocognite.unitee.enums.DependencyTarget;

@TestClass
public class BaseClass {
	private static Logger logger = RunConfig.getCentralLogger();
	
	@Dependency(target = DependencyTarget.TEST_CLASSES, testClasses={SuccessfulClass.class})
	public void test1() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Dependency(target = DependencyTarget.TEST_CLASSES, testClasses={FailureClass.class})
	public void test2() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Dependency(target = DependencyTarget.TEST_CLASSES, testClasses={SuccessfulClass.class,FailureClass.class})
	public void test3() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
	@Dependency(target = DependencyTarget.TEST_CLASSES, testClasses={ClassWithoutIssuesDepsOnFailure.class})
	public void test4() throws Exception{
		Assertions.assertEquals(1,1);
	}

}
