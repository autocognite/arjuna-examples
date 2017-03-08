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
package com.autocognite.ex.ddt07.dataref;

import com.autocognite.arjuna.annotations.*;
import com.autocognite.arjuna.interfaces.ReadOnlyDataRecord;
import com.autocognite.arjuna.interfaces.TestVariables;

import static com.autocognite.arjuna.assertions.Assertions.*;

@FileDataReference(path = "dataref.xls", name="test")
@TestClass
public class MethodLevelDataReferenceExample{

	@FileDataReference(path = "dataref.xls", name="somename")
	public void testEx(TestVariables testMethodVars) throws Exception{	
		ReadOnlyDataRecord dataRec = null;
		// My
		dataRec = testMethodVars.dataRef("test").getRecord("Bronze");
		assertEquals(dataRec.value("user").asString(), "B1");
		
		// Class
		dataRec = testMethodVars.dataRef("somename").getRecord("Bronze");
		assertEquals(dataRec.value("user").asString(), "B1");
		
		// Central
		dataRec = testMethodVars.dataRef("dataref").getRecord("Bronze");
		assertEquals(dataRec.value("user").asString(), "B1");
	}
}
