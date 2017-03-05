package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.Skip;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;
import com.autocognite.unitee.enums.DependencyTarget;

@TestClass
@Skip
@Dependency(testMethods={"test2Fail"}, containerClass=FailureClass.class)
public class ChainDepSkipped {
	
	public void test1Pass() throws Exception{
		Assertions.assertEquals(1,1);
	}
	
}
