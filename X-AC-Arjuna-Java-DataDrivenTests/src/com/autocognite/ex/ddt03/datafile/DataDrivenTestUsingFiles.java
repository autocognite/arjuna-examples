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
package com.autocognite.ex.ddt03.datafile;

import static com.arjunapro.testauto.assertions.Assertions.*;

import com.arjunapro.ddt.annotations.DriveWithDataFile;
import com.arjunapro.ddt.interfaces.DataRecord;
import com.arjunapro.testauto.annotations.*;
import com.arjunapro.testauto.interfaces.TestVariables;

@TestClass
public class DataDrivenTestUsingFiles{

	// The arguments is an absolute path or path inside/relative to default data sources (/data/sources) directory.
	// For these examples, the files are assumed to be present inside the default directory
	
	@DriveWithDataFile(path="input.xls")
	public void testWithXLS(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.value("left").asString(), record.value("right").asString());
		assertEquals("Sample Purpose", actual, record.value("EXPECTED").asString());
	}
	
	// You can use a tab delimited file in the same manner
	@DriveWithDataFile("input.txt")
	public void testWithTSVDataFile(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}
	
	@DriveWithDataFile(path="input.txt")
	public void testWithTSVDataFileMapFormat(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.value("left"), record.value("right"));
		assertEquals("Sample Purpose", actual, record.value("EXPECTED"));
	}
	
	// You can use a CSV file or any other delimited file by specifying delimiter
	@DriveWithDataFile(
			path = "input.csv",
			delimiter = ","
	)
	public void testWithCSVDataFile(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.valueAt(0), record.valueAt(1));
		assertEquals("Sample Purpose", actual, record.valueAt(2));
	}	
	
	@DriveWithDataFile(path = "input.csv", delimiter = ",")
	public void testWithCSVDataFileMapFormat(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.value("left"), record.value("right"));
		assertEquals("Sample Purpose", actual, record.value("EXPECTED"));
	}
	
	// You can also use INI file.
	// As the section data inside an INI file is unordered, don't use it for positional reading.
	// This means that the INI format should only be used for Map data format.	
	@DriveWithDataFile(path = "input.ini")
	public void testWithINIDataFileMapFormat(TestVariables testVars) throws Exception{
		DataRecord record = testVars.record();
		String actual = String.format("%s::%s", record.value("left"), record.value("right"));
		assertEquals("Sample Purpose", actual, record.value("EXPECTED"));
	}
	
}

