package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
@Skip
@MethodDependency(testMethods={"test2Fail"}, containerClass=FailureClass.class)
public class ChainDepSkipped {

	public void test1Pass() throws Exception{
		assertEquals(1,1);
	}

}
