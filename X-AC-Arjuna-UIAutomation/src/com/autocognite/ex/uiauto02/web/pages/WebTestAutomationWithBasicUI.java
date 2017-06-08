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
package com.autocognite.ex.uiauto02.web.pages;

import static unitee.assertions.Assertions.assertTrue;

import arjunasdk.uiauto.factories.PageFactory;
import arjunasdk.uiauto.factories.UiDriverFactory;
import arjunasdk.uiauto.interfaces.Page;
import arjunasdk.uiauto.interfaces.UiDriver;
import arjunasdk.uiauto.interfaces.UiElement;
import unitee.annotations.TestClass;

@TestClass
public class WebTestAutomationWithBasicUI {
	static String appUrl = "http://10.10.1.32";
	static String adminUrl = appUrl + "/wp-admin/";
	static String logoutUrl = appUrl + "/wp-login.php?action=logout";
	
	public void test() throws Exception{
		UiDriver uiDriver = UiDriverFactory.getSelenium();
		uiDriver.goTo(adminUrl);
		
		Page home = PageFactory.getPage(uiDriver, "/wordpress/HomePage.ini");		

		UiElement userTextBox = home.element("LOGIN");
		userTextBox.waitForPresence();
		userTextBox.enterText("user");
		home.element("PASSWORD").enterText("bitnami");
		home.element("SUBMIT").click();		
		
		Page leftNav = PageFactory.getPage(uiDriver, "/wordpress/LeftNavigation.ini");	
		leftNav.element("POSTS").hoverAndClickElement(leftNav.element("CATEGORIES"));	
		
		Page categories = PageFactory.getPage(uiDriver, "/wordpress/Categories.ini");

		UiElement tags = categories.element("CAT_CHECKBOXES");
		tags.getInstanceAtOrdinal(2).check();
		tags.getInstanceAtIndex(1).uncheck();
			
		for (UiElement element: tags.getAllInstances()){
			element.check();
			element.uncheck();
		}

		leftNav.element("SETTINGS").click();

		Page settings = PageFactory.getPage(uiDriver, "/wordpress/Settings.ini");
			
		UiElement blogNameTextBox = settings.element("BLOG_NAME");
		blogNameTextBox.enterText("Hello");
		blogNameTextBox.enterText("Hello");
		blogNameTextBox.setText("Hello");
		
		settings.element("MEMBERSHIP").check();

		// Experiments with Select control - Selection using different attributes
		UiElement roleDropDown = settings.element("ROLE");
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
