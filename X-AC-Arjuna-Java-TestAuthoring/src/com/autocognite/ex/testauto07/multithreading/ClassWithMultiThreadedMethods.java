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
package com.autocognite.ex.testauto07.multithreading;

import com.autocognite.arjuna.annotations.*;

import static com.autocognite.arjuna.assertions.Assertions.*;

@TestClass(methodThreads=3)
public class ClassWithMultiThreadedMethods{

	public void test1() throws Exception{	
		assertEquals("Sample Purpose", 3,3);
	}
	
	public void test2() throws Exception{
		assertEquals("Sample Purpose", 1,2);
	}
	
	public void test3() throws Exception{
		assertEquals("Sample Purpose", 1,2);
	}
	
	public void test4() throws Exception{
		assertEquals("Sample Purpose", 1,2);
	}
	
	public void test5() throws Exception{
		assertEquals("Sample Purpose", 1,2);
	}
	
	public void test6() throws Exception{
		assertEquals("Sample Purpose", 1,2);
	}
}

//dummy
