package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;
import com.autocognite.unitee.enums.DependencyTarget;

@TestClass
@Dependency(target = DependencyTarget.TEST_CLASSES, testClasses={FailureClass.class})
public class ChainDep1 {
	
	public void test1Pass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
}
