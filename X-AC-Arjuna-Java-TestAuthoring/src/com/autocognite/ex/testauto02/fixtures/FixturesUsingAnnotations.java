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
package com.autocognite.ex.testauto02.fixtures;

import static com.autocognite.unitee.assertions.Assertions.error;
import static com.autocognite.unitee.assertions.Assertions.fail;

import com.autocognite.unitee.annotations.AfterClassInstance;
import com.autocognite.unitee.annotations.AfterMethodInstance;
import com.autocognite.unitee.annotations.AfterTest;
import com.autocognite.unitee.annotations.BeforeClassInstance;
import com.autocognite.unitee.annotations.BeforeMethodInstance;
import com.autocognite.unitee.annotations.BeforeTest;
import com.autocognite.unitee.annotations.TestClass;
import com.autocognite.unitee.annotations.TestMethod;

@TestClass
public class FixturesUsingAnnotations{
	
	@BeforeClassInstance
	public void createTestFiles(){
		System.out.println("Custom Set Up class executed");
	}
	
	@AfterClassInstance
	public void deleteTestFiles(){
		System.out.println("Custom Tear Down Class executed");
	}
	
	@BeforeMethodInstance
	public void addEnvVarForTool(){
		System.out.println("Custom Set Up Method executed");
	}
	
	@AfterMethodInstance
	public void clearEnvVarForTool(){
		System.out.println("Custom Tear Down Method executed");
	}
	
	@BeforeTest
	public void launchTool(){
		System.out.println("Custom Set Up Test executed");
	}
	
	@AfterTest
	public void stopTool(){
		System.out.println("Custom Tear Down Test executed");
	}
	
	@TestMethod
	public void deleteFile() throws Exception{	
		System.out.println("Custom Test Method delete File executed.");
	}
	
	@TestMethod
	public void createFile() throws Exception{	
		System.out.println("Custom Test Method create File executed.");
		// Simulate failure
		fail("Simulated Failure");
	}
	
	@TestMethod
	public void updateFile() throws Exception{	
		System.out.println("Custom Test Method create File executed.");
		// Simulate failure
		error("Simulated Error");
	}

}
