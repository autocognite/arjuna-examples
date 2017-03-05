package com.autocognite.ex.testauto13.dep.c2c;

import org.apache.log4j.Logger;

import com.autocognite.batteries.config.RunConfig;
import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;
import com.autocognite.unitee.enums.DependencyTarget;

@TestClass
@Dependency(target = DependencyTarget.TEST_CLASSES, testClasses={FailureSkippedClass.class})
public class C2CDemo4 {
	private static Logger logger = RunConfig.getCentralLogger();
	
	
	public void test1() throws Exception{
		Assertions.assertEquals(1,1);
	}

	public void test2() throws Exception{
		Assertions.assertEquals(1,1);
	}

}
