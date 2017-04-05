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

import static com.arjunapro.testauto.assertions.Assertions.*;

import com.arjunapro.ddt.annotations.DataMethod;
import com.arjunapro.ddt.annotations.DriveWithDataMethod;
import com.arjunapro.ddt.datarecord.DefaultDataRecordContainer;
import com.arjunapro.ddt.interfaces.DataRecord;
import com.arjunapro.ddt.interfaces.DataRecordContainer;
import com.arjunapro.testauto.annotations.*;
import com.arjunapro.testauto.interfaces.TestVariables;

@TestClass
public class DataMethodsRecordMapUsage{	
	
	@DataMethod("DG2")
	public DataRecordContainer getMapData(){
		DataRecordContainer container = new DefaultDataRecordContainer();
		// Create headers and assign to container
		String[] names = {"left", "right", "expected"};
		container.setHeaders(names);
		//Rest is same
		Object[][] records = {
				{1,2,"1::2"},
				{4,5,"4::6"},
		};
		container.addAll(records);
		return container;
	}

	@DriveWithDataMethod(name="DG2") 
	public void testWithLocalNamedGeneratorMethodMapFormat(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.value("left").asString(), record.value("right").asString());
		assertEquals("Sample Purpose", actual, record.value("EXPECTED"));
	}	
	
}

