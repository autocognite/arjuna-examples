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
package com.autocognite.ex.testauto06.instances;

import static unitee.assertions.Assertions.*;

import unitee.annotations.*;
import unitee.interfaces.*;

@TestClass
public class MethodInstancesDemo3{

	@Instances(count = 5, execVars={"var1=a","var2=a,b","var3=a,b,c","var4=a,b,c,d","var5=a,b,c,d,e", "var6=a,b,c,d,e,f"})
	public void test1(TestVariables testMethodVars) throws Exception{	
		// Unitee assigns the comma separated values uniquely to test class instances, if they are defined
		// Else, the last value provided for a variable is repeated for the rest of the instances.
		switch (testMethodVars.object().methodInstanceNumber()){
		case 1:
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var1"), "a");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var2"), "a");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var3"), "a");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var4"), "a");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var5"), "a");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var6"), "a");
			break;
		case 2:
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var1"), "a");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var2"), "b");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var3"), "b");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var4"), "b");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var5"), "b");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var6"), "b");
			break;
		case 3:
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var1"), "a");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var2"), "b");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var3"), "c");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var4"), "c");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var5"), "c");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var6"), "c");
			break;
		case 4:
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var1"), "a");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var2"), "b");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var3"), "c");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var4"), "d");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var5"), "d");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var6"), "d");
			break;
		case 5:
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var1"), "a");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var2"), "b");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var3"), "c");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var4"), "d");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var5"), "e");
			assertEquals("Sample Purpose", testMethodVars.execVars().string("Var6"), "e");
			break;
		}
	}
	
}
