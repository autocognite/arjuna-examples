/*******************************************************************************
 * Copyright 2015-17 AutoCognite Testing Research Pvt Ltd
 * 
 * Website: www.AutoCognite.com
 * Email: support [at] autocognite.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.autocognite.ex.ddt06.fixtures;

import static unitee.assertions.Assertions.*;

import org.apache.log4j.Logger;

import arjunasdk.config.RunConfig;
import arjunasdk.ddauto.interfaces.*;
import unitee.annotations.*;
import unitee.interfaces.*;

@TestClass
public class FixturesWithDDT{
	private Logger logger = RunConfig.logger();
	
	public void setUpClass(){
		logger.info("Called setUpClass");
	}
	
	public void setUpMethod(){
		logger.info("Called setUp");
	}
	
	public void setUpTest(){
		logger.info("Called setUpTest");
	}
	
	public void tearDownTest(){
		logger.info("Called tearDownTest");
	}
	
	public void tearDownMethod(){
		logger.info("Called tearDown");
	}
	
	public void tearDownClass(){
		logger.info("Called tearDownClass");
	}

	@DataMethod
	public static Object[][] getData(){
		Object[][] records = {
				{1,2,"1::2"},
				{1,2,"1::5"},
		};
		return records;
	}
	
	@DataMethod
	public static Object[][] getData2(){
		Object[][] records = {
				{1,2,"1::2"},
				{1,2,"1::5"},
		};
		return records;
	}

	@DriveWithDataMethod("getData")
	public void test1(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}	
	
	@DriveWithDataMethod("getData")
	public void test2(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}
	
	@DriveWithDataMethod("getData2")
	public void test3(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}
	
	@DriveWithDataMethod("getData2")
	public void test4(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}	
}

