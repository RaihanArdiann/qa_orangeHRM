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

WebUI.waitForElementVisible(findTestObject('myInfo/qualification/div_QualificationsTab'), 5)

WebUI.click(findTestObject('myInfo/qualification/button_AddSkills'))

WebUI.click(findTestObject('myInfo/qualification/select_skill'))

WebUI.click(findTestObject('myInfo/qualification/div_Copywriting'))

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/input_Years of Experience_oxd-input oxd-inp_399b33'), 
    '3')

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/textarea_Comments_oxd-textarea oxd-textarea_6464fb'), 
    'youtuber')

WebUI.click(findTestObject('Object Repository/myInfo/qualification/button_Save'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/p_Success'))

