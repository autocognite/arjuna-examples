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
package com.autocognite.ex.testauto05.testskipping;

import com.autocognite.arjuna.annotations.*;
import static com.autocognite.arjuna.assertions.Assertions.*;
//
@TestClass
public class SkipMethodExample{

	public void testMethodPass() throws Exception{	
		assertEquals(1,1);
	}
	
	@Skip
	public void testMethodFail() throws Exception{
		assertEquals(1,2);
	}
	
	public void testMethodError() throws Exception{
		error();
	}

	public void setUpClass(){
		System.out.println("" + ": Called setUpClass");
	}
	
	public void setUpMethod(){
		System.out.println("" + ": Called setUpMethod");
	}
	
	public void setUpTest(){
		System.out.println("" + ": Called setUpTest");
	}
	
	public void tearDownTest(){
		System.out.println("" + ": Called tearDownTest");
	}
	
	public void tearDownMethod(){
		System.out.println("" + ": Called tearDownMethod");
	}
	
	public void tearDownClass(){
		System.out.println("" + ": Called tearDownClass");
	}
}
