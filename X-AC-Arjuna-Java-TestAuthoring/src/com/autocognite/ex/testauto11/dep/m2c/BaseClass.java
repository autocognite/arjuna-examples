package com.autocognite.ex.testauto11.dep.m2c;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class BaseClass {
	
	@ClassDependency(SuccessfulClass.class)
	public void test1() throws Exception{
		assertEquals(1,1);
	}
	
	@ClassDependency(FailureClass.class)
	public void test2() throws Exception{
		assertEquals(1,1);
	}
	
	@ClassDependency({SuccessfulClass.class,FailureClass.class})
	public void test3() throws Exception{
		assertEquals(1,1);
	}
	
	@ClassDependency(ClassWithoutIssuesDepsOnFailure.class)
	public void test4() throws Exception{
		assertEquals(1,1);
	}

}
