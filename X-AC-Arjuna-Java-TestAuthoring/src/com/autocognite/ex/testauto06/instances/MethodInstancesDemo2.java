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
public class MethodInstancesDemo2{

	@Instances(udv={"var1=a","var2=b,c"})
	public void test1(TestVariables testMethodVars) throws Exception{	
		assertEquals(testMethodVars.udv().string("Var1"), "a");
		assertEquals(testMethodVars.udv().string("Var2"), "b");
		assertEquals(3,3).evaluate();
	}
	
	@Instances(udv={"var1=x","var2=y,z"})
	public void test2(TestVariables testMethodVars) throws Exception{
		assertEquals(testMethodVars.udv().string("Var1"), "x");
		assertEquals(testMethodVars.udv().string("Var2"), "y");
		assertEquals(1,2);
	}
	
}
