package com.autocognite.ex.testauto13.dep.c2c;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
@ClassDependency(ChainDep2.class)
public class C2CDemo6 {
	
	public void test1() throws Exception{
		assertEquals(1,1);
	}

	public void test2() throws Exception{
		assertEquals(1,1);
	}

}