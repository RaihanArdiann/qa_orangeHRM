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

WebUI.click(findTestObject('Object Repository/myInfo/qualification/button_Addwork'))

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/input_Company_oxd-input oxd-input--focus'), 'norun')

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/input_Job Title_oxd-input oxd-input--active'), 'qa')

WebUI.click(findTestObject('Object Repository/myInfo/qualification/i_From_oxd-icon bi-calendar oxd-date-input-icon'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/div_1'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/i_To_oxd-icon bi-calendar oxd-date-input-icon'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/div_9'))

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/textarea_Comment_oxd-textarea oxd-textarea-_74c597'), 
    'qa')

WebUI.click(findTestObject('Object Repository/myInfo/qualification/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/myInfo/qualification/p_Success'))

