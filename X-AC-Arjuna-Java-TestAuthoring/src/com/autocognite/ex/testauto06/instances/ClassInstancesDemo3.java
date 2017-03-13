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
package com.autocognite.ex.testauto06.instances;

import com.autocognite.arjuna.annotations.*;
import com.autocognite.arjuna.interfaces.TestVariables;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass
@Instances(count = 5, udv={"var1=a","var2=a,b","var3=a,b,c","var4=a,b,c,d","var5=a,b,c,d,e", "var6=a,b,c,d,e,f"})
public class ClassInstancesDemo3{
	
	public ClassInstancesDemo3(TestVariables testClassVars) throws Exception{
		// Unitee assigns the comma separated values uniquely to test class instances, if they are defined
		// Else, the last value provided for a variable is repeated for the rest of the instances.
		switch (testClassVars.objectProps().classInstanceNumber()){
		case 1:
			assertEquals(testClassVars.udv().string("Var1"), "a");
			assertEquals(testClassVars.udv().string("Var2"), "a");
			assertEquals(testClassVars.udv().string("Var3"), "a");
			assertEquals(testClassVars.udv().string("Var4"), "a");
			assertEquals(testClassVars.udv().string("Var5"), "a");
			assertEquals(testClassVars.udv().string("Var6"), "a");
			break;
		case 2:
			assertEquals(testClassVars.udv().string("Var1"), "a");
			assertEquals(testClassVars.udv().string("Var2"), "b");
			assertEquals(testClassVars.udv().string("Var3"), "b");
			assertEquals(testClassVars.udv().string("Var4"), "b");
			assertEquals(testClassVars.udv().string("Var5"), "b");
			assertEquals(testClassVars.udv().string("Var6"), "b");
			break;
		case 3:
			assertEquals(testClassVars.udv().string("Var1"), "a");
			assertEquals(testClassVars.udv().string("Var2"), "b");
			assertEquals(testClassVars.udv().string("Var3"), "c");
			assertEquals(testClassVars.udv().string("Var4"), "c");
			assertEquals(testClassVars.udv().string("Var5"), "c");
			assertEquals(testClassVars.udv().string("Var6"), "c");
			break;
		case 4:
			assertEquals(testClassVars.udv().string("Var1"), "a");
			assertEquals(testClassVars.udv().string("Var2"), "b");
			assertEquals(testClassVars.udv().string("Var3"), "c");
			assertEquals(testClassVars.udv().string("Var4"), "d");
			assertEquals(testClassVars.udv().string("Var5"), "d");
			assertEquals(testClassVars.udv().string("Var6"), "d");
			break;
		case 5:
			assertEquals(testClassVars.udv().string("Var1"), "a");
			assertEquals(testClassVars.udv().string("Var2"), "b");
			assertEquals(testClassVars.udv().string("Var3"), "c");
			assertEquals(testClassVars.udv().string("Var4"), "d");
			assertEquals(testClassVars.udv().string("Var5"), "e");
			assertEquals(testClassVars.udv().string("Var6"), "e");
			break;
		}
	}

	public void test1(TestVariables testMethodVars) throws Exception{	
		// You have access to class level uds at method level as well
		assertEquals(testMethodVars.udv().string("Var1"), "a");
		assertEquals(3,3);
	}
	
	public void test2(TestVariables testMethodVars) throws Exception{
		// You have access to class level uds at method level as well
		assertEquals(testMethodVars.udv().string("Var1"), "a");
		assertEquals(1,2);
	}
	
}
