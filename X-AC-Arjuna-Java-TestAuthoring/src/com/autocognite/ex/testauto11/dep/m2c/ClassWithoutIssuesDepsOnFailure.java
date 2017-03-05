package com.autocognite.ex.testauto11.dep.m2c;

import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;
import com.autocognite.unitee.enums.DependencyTarget;

@TestClass
public class ClassWithoutIssuesDepsOnFailure {
	
	@Dependency(target = DependencyTarget.TEST_CLASSES, testClasses={FailureClass.class})
	public void test1Pass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
}
