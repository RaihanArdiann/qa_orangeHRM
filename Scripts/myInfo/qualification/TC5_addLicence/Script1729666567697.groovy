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

WebUI.click(findTestObject('Object Repository/myInfo/qualification/a_My Info'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/a_Qualifications'))

WebUI.click(findTestObject('myInfo/qualification/button_AddLicense'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('myInfo/qualification/span_Certified Information Security Manager (CISM)'))

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/input_License Number_oxd-input oxd-input--focus'), 
    '123123')

WebUI.click(findTestObject('Object Repository/myInfo/qualification/i_Issued Date_oxd-icon bi-calendar oxd-date_9ff0f9'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/div_7'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/i_Expiry Date_oxd-icon bi-calendar oxd-date_e19730'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/div_16'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/button_Save'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/p_Success'))

