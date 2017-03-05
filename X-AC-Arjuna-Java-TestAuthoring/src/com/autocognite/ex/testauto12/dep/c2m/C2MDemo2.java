package com.autocognite.ex.testauto12.dep.c2m;

import org.apache.log4j.Logger;

import com.autocognite.batteries.config.RunConfig;
import com.autocognite.unitee.annotations.Dependency;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.annotations.TestMethod;
import com.autocognite.unitee.annotations.ddt.Data;
import com.autocognite.unitee.annotations.ddt.DriveWithDataArray;
import com.autocognite.unitee.assertions.Assertions;
import com.autocognite.unitee.interfaces.TestVariables;

@TestClass
@Dependency(testMethods={"testC2Fail"}, containerClass=DependencyClass.class)
public class C2MDemo2 {
	private static Logger logger = RunConfig.getCentralLogger();
	
	
	public void test1() throws Exception{
		Assertions.assertEquals(1,1);
	}

	public void test2(TestVariables testVars) throws Exception{
		Assertions.assertEquals(1,1);
	}

}
