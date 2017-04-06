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
package com.autocognite.ex.testauto04.testprops;

import static com.arjunapro.testauto.assertions.Assertions.assertContains;
import static com.arjunapro.testauto.assertions.Assertions.assertEquals;
import static com.arjunapro.testauto.assertions.Assertions.assertNull;
import static com.arjunapro.testauto.assertions.Assertions.error;

import com.arjunapro.testauto.annotations.TestClass;
import com.arjunapro.testauto.annotations.TestMethod;

@TestClass(
		id = "Custom id class level",
		name="Custom name", 
		utp={"my1=3"},
		priority=2
)
public class TestPropertiesDemo{

	@TestMethod()
	public void testPropInheritance() throws Exception{	
		assertEquals("Sample Purpose", 3,3);
	}

	@TestMethod(id="Custom id-1", name="a", priority=3)
	public void test1MethodPass() throws Exception{	
		assertEquals("Sample Purpose", 3,3);
	}
	
	@TestMethod(id="Custom id-2", name="b")
	public void test2MethodFail() throws Exception{
		assertEquals("Sample Purpose", 1,2);
	}
	
	@TestMethod(id="Custom id-3", utp={"my1=5","POLICY Name = Hoho", "qh_prop=c", "tags=abc", "s=2"})
	public void test3MethodFail() throws Exception{
		assertNull("Dummy purpose","abc");
	}
	
	@TestMethod(id="Custom id-4", utp={"POLICY Name = Hoho1", "qh_prop=d", "tags=def"})
	public void test4MethodFail() throws Exception{
		assertContains("Some purpose", "parent", "rent1");
	}

	@TestMethod(id="Custom id-5", utp={"POLICY Name = Hoho2", "name=f", "tags=xyz"})
	public void test5methodError2() throws Exception{
		error("Dummy Error");
	}
}
