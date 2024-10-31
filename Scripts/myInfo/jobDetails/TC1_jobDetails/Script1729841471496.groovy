import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/myInfo/jobDetails/a_My Info'))

WebUI.click(findTestObject('Object Repository/myInfo/jobDetails/a_Job'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Object Repository/myInfo/jobDetails/div_HR Manager'))

WebUI.verifyElementPresent(findTestObject('Object Repository/myInfo/jobDetails/div_Not Defined'), 0)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/myInfo/jobDetails/div_Officials and Managers'), 'class', 
    'oxd-select-text oxd-select-text--active oxd-select-text--disabled', 0)

WebUI.verifyElementText(findTestObject('myInfo/jobDetails/div_Human Resources'), 'Human Resources')

WebUI.verifyElementVisibleInViewport(findTestObject('Object Repository/myInfo/jobDetails/div_Texas RD'), 0)

WebUI.verifyElementInViewport(findTestObject('Object Repository/myInfo/jobDetails/div_Full-Time Permanent'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/myInfo/jobDetails/span_Full-Time Permanent_oxd-switch-input o_582d14'))

