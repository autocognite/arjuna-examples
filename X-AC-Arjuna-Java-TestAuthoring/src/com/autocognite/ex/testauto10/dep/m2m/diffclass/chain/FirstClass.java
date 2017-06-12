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
package com.autocognite.ex.testauto10.dep.m2m.diffclass.chain;

import static unitee.assertions.Assertions.*;

import unitee.annotations.*;

@TestClass
public class FirstClass {

	@MethodDependency(testMethods = { "test1C2DepOnThird1_ShouldPass" }, containerClass = SecondClass.class)
	public void test1DepOnSec1_ShouldPass() throws Exception {
		assertEquals("Sample Purpose", 1, 1);
	}

	@MethodDependency(testMethods = { "test2C2DepOnThird2_ShouldExclude" }, containerClass = SecondClass.class)
	public void test2DepOnSec2_ShouldExclude() throws Exception {
		assertEquals("Sample Purpose", 1, 1);
	}

	@MethodDependency(testMethods = { "test3C2DepOnThird3_ShouldExclude" }, containerClass = SecondClass.class)
	public void test3DepOnSec3_ShouldExclude() throws Exception {
		assertEquals("Sample Purpose", 1, 1);
	}

	@MethodDependency(testMethods = { "test4C2DepOnThird4_ShouldPass" }, containerClass = SecondClass.class)
	public void test4DepOnSec4_ShouldPass() throws Exception {
		assertEquals("Sample Purpose", 1, 1);
	}
}
