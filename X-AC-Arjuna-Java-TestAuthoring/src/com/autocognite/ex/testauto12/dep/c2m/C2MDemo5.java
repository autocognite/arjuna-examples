package com.autocognite.ex.testauto12.dep.c2m;

import org.apache.log4j.Logger;

import com.autocognite.batteries.config.RunConfig;
import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.assertions.Assertions;

@TestClass
@Dependency(testMethods={"test1"}, containerClass=ChainDep1.class)
public class C2MDemo5 {
	private static Logger logger = RunConfig.getCentralLogger();
	
	
	public void test1() throws Exception{
		Assertions.assertEquals(1,1);
	}

	public void test2() throws Exception{
		Assertions.assertEquals(1,1);
	}

}
