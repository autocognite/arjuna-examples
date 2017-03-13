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
package com.autocognite.ex.ddt02.dataarray;

import com.autocognite.arjuna.annotations.*;
import com.autocognite.arjuna.interfaces.DataRecord;
import com.autocognite.arjuna.interfaces.TestVariables;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
public class DataDrivenTestWithDataArray{
	
	// What we have done so far is good for one record.
	// What happens when we need more?
	// You can use the DataArray annotation.
	// The test method would run as many times as the number of records provided.
	// Formats work as expected.
	@DriveWithDataArray(
			{
				@Data({"1","2","1::2"}), 
				@Data({"4","5","4::6"}),
				@Data({"4","6","4::6"}),
				@Data({"10","11","10::11"}),
				@Data({"10","12","10::12"})
			}
	)
	@TestMethod(testThreads=3)
	public void test(TestVariables testVars) throws Exception{
		DataRecord record = testVars.dataRecord();
		String actual = String.format("%s::%s", record.valueAt(0).asString(), record.valueAt(1).asString());
		assertEquals(actual, record.valueAt(2).asString());
	}	
	
	@DriveWithDataArray(
	headers = {"left", "right", "expected"},
	records = {
			@Data({"1","2","1::2"}), 
			@Data({"4","5","4::6"})
			}
	)
	public void testWithHeaders(TestVariables testVars) throws Exception{
		DataRecord record = testVars.dataRecord();
		String actual = String.format("%s::%s", record.value("left").asString(), record.value("right").asString());
		assertEquals(actual, record.value("EXPECTED").asString());
	}
	
}

