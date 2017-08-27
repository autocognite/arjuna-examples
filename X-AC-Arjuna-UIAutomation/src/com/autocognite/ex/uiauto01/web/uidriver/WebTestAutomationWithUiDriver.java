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
package com.autocognite.ex.uiauto01.web.uidriver;

import static unitee.assertions.Assertions.assertTrue;

import arjunasdk.uiauto.factories.UiDriverFactory;
import arjunasdk.uiauto.interfaces.UiDriver;
import arjunasdk.uiauto.interfaces.UiElement;
import unitee.annotations.TestClass;

@TestClass
public class WebTestAutomationWithUiDriver {
	//change ip as per your install
	static String appUrl = "http://192.168.56.104";
	static String adminUrl = appUrl + "/wp-admin/";
	static String logoutUrl = appUrl + "/wp-login.php?action=logout";
	
	public void test() throws Exception{
		UiDriver uiDriver = UiDriverFactory.getSelenium();
		uiDriver.goTo(adminUrl);		

		UiElement userTextBox = uiDriver.elementWithId("user_login");
		userTextBox.waitForPresence();
		userTextBox.enterText("user");
		uiDriver.elementWithId("user_pass").enterText("bitnami");
		uiDriver.elementWithId("wp-submit").click();
		
		uiDriver.elementWithCss(".dashicons-admin-post").hoverAndClickElement(uiDriver.elementWithLinkText("Categories"));
		
		UiElement tags = uiDriver.elementWithName("delete_tags[]");
		tags.getInstanceAtOrdinal(2).check();
		tags.getInstanceAtIndex(1).uncheck();
		
		for (UiElement element: tags.getAllInstances()){
			element.check();
			element.uncheck();
		}
		
		// Tests for alternate instance methods
		tags.getFirstInstance().check();
		tags.getFirstInstance().uncheck();
		
		tags.identifyAll().getLastInstance().check();
		tags.identifyAll().getLastInstance().uncheck();
		
		
		tags.identifyAll().getRandomInstance().check();
		tags.identifyAll().getRandomInstance().uncheck();
	
		uiDriver.elementWithCss(".dashicons-admin-settings").hoverAndClickElement(uiDriver.elementWithLinkText("General"));
		
		UiElement blogNameTextBox = uiDriver.elementWithId("blogname");
		blogNameTextBox.enterText("Hello");
		blogNameTextBox.enterText("Hello");
		blogNameTextBox.setText("Hello");
		
		uiDriver.elementWithId("users_can_register").check();

		// Experiments with Select control - Selection using different attributes
		UiElement roleDropDown = uiDriver.elementWithId("default_role");
		roleDropDown.selectLabel("Author");
		assertTrue("Check Author Role Selected", roleDropDown.hasSelectedLabel("Author"));
		roleDropDown.selectIndex(0);
		assertTrue("Check Author Role Selected", roleDropDown.hasSelectedIndex(0));
		roleDropDown.selectValue("author");
		assertTrue("Check Author Role Selected", roleDropDown.hasSelectedValue("author"));
		
		uiDriver.goTo(logoutUrl);
		uiDriver.close();
	}
}
