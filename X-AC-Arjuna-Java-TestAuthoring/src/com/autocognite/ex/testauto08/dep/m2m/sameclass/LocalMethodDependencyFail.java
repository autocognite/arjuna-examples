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
package com.autocognite.ex.testauto08.dep.m2m.sameclass;

import static unitee.assertions.Assertions.*;

import unitee.annotations.*;

@TestClass
public class LocalMethodDependencyFail {

	@MethodDependency("test2")
	public void test1() throws Exception {
		assertEquals("Sample Purpose", 1, 1);
	}

	public void test2() throws Exception {
		fail("Fake failure");
	}
}
