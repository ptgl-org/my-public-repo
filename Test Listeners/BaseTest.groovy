import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

class BaseTest {
	boolean checkPass(TestCaseContext testCaseContext) {
		return testCaseContext.getTestCaseStatus().equalsIgnoreCase("PASSED")
	}
	
	@BeforeTestCase
	def openApplication(TestSuiteContext testSuiteContext) {
		if(!GlobalVariable.isAPIRunning & !GlobalVariable.isWebRunning) {
			def mobileAppPath = PathUtil.absoluteToRelativePath(GlobalVariable.appPath, RunConfiguration.getProjectDir())
			Mobile.startApplication(mobileAppPath, false)
		}
	}
	
	@BeforeTestCase
	def openBrowser(TestCaseContext testCaseContext) {
		if (!GlobalVariable.isAPIRunning & GlobalVariable.isWebRunning){
			WebUI.openBrowser(GlobalVariable.webUrl)
			WebUI.maximizeWindow()
		}
	}

	@AfterTestCase
	def closeApplication(TestSuiteContext testSuiteContext) {
		if(!GlobalVariable.isAPIRunning & !GlobalVariable.isWebRunning) {
			Mobile.closeApplication()
		}
	}
	
	@AfterTestCase
	def closeBrowser(TestCaseContext testCaseContext) {
		if (!GlobalVariable.isAPIRunning & GlobalVariable.isWebRunning) {
			if (!checkPass(testCaseContext)) {
				WebUI.takeScreenshot()
			}
			WebUI.closeBrowser()
		}
	}
}