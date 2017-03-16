/*******************************************************************************
 * Copyright 2015-16 AutoCognite Testing Research Pvt Ltd
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

import com.autocognite.arjuna.annotations.*;
import com.autocognite.arjuna.interfaces.DataRecord;
import com.autocognite.arjuna.interfaces.TestVariables;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class DataDrivenTestUsingExternalMethods{
	@DriveWithDataMethod(
			name = "User defined data method name",
			containerClass = MethodContainer.class
	)
	public void testByProvidingClass(TestVariables testVars) throws Exception{
		DataRecord record = testVars.dataRecord();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}
	
	
	@DriveWithDataMethod(
			name = "User defined data method name",
			containerClass = AnnotatedMethodContainer.class
	)
	public void testByProvidingClass2(TestVariables testVars) throws Exception{
		DataRecord record = testVars.dataRecord();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}
	
	@DriveWithDataMethod(
			name = "User defined data method name",
			container = "AnnotatedMethodContainer"
	)
	public void testByProvidingClassName1(TestVariables testVars) throws Exception{
		DataRecord record = testVars.dataRecord();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}
	
	@DriveWithDataMethod(
			name = "User defined data method name",
			container = "User defined data method container name"
	)
	public void testByProvidingClassName2(TestVariables testVars) throws Exception{
		DataRecord record = testVars.dataRecord();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}

}
