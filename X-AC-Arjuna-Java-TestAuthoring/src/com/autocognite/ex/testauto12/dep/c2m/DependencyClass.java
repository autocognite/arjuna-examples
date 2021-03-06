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
package com.autocognite.ex.testauto12.dep.c2m;

import static unitee.assertions.Assertions.*;

import unitee.annotations.*;

@TestClass
public class DependencyClass {

	public void testC2Pass() throws Exception {
		assertEquals("Sample Purpose", 1, 1);
	}

	public void testC2Fail() throws Exception {
		fail("Dummy Failure");
	}

	public void testC2Error() throws Exception {
		error("Dummy Error");
	}

	@Skip
	public void testC2Skipped() throws Exception {
		error("Dummy Error");
	}

	public void nonTestMethod() throws Exception {
		error("Dummy Error");
	}
}
