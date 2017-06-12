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
package com.autocognite.ex.ddt04.datamethod;

import static unitee.assertions.Assertions.*;

import arjunasdk.ddauto.interfaces.*;
import unitee.annotations.*;
import unitee.interfaces.*;

@TestClass
public class DataDrivenTestUsingDataMethods{

	@DataMethod
	public static Object[][] getData(){
		Object[][] records = {
				{1,2,"1::2"},
				{4,5,"4::6"},
		};
		return records;
	}

	@DriveWithDataMethod("getData")
	public void testWithLocalDataMethod1(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.valueAt(0).asString(), record.valueAt(1).asString());
		assertEquals("Sample Purpose", actual, record.valueAt(2).asString());
	}	
	
	
	@DataMethod("User defined data method name")
	public static Object[][] getData2(){
		Object[][] records = {
				{1,2,"1::2"},
				{4,5,"4::6"},
		};
		return records;
	}

	@DriveWithDataMethod("User defined data method name")
	public void testWithLocalDataMethod2(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.valueAt(0).asString(), record.valueAt(1).asString());
		assertEquals("Sample Purpose", actual, record.valueAt(2).asString());
	}

}

