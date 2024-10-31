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

WebUI.click(findTestObject('myInfo/qualification/a_My Info'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/a_Qualifications'))

WebUI.click(findTestObject('myInfo/qualification/button_AddEducation'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('myInfo/qualification/div_Bachelors Degree'))

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/input_Institute_oxd-input oxd-input--focus'), 'telyu')

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/input_MajorSpecialization_oxd-input oxd-inp_ddce29'), 
    'multimedia')

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/input_Year_oxd-input oxd-input--active'), '2024')

WebUI.setText(findTestObject('Object Repository/myInfo/qualification/input_GPAScore_oxd-input oxd-input--active'), '4.0')

WebUI.click(findTestObject('Object Repository/myInfo/qualification/i_Start Date_oxd-icon bi-calendar oxd-date-_cc09b3'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/i_Start Date_oxd-icon bi-caret-down-fill ox_e416b5'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/li_2020'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/div_6'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/i_End Date_oxd-icon bi-calendar oxd-date-in_ea95f4'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/li_2024'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/li_2024_1'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/div_15'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/button_Save'))

WebUI.click(findTestObject('Object Repository/myInfo/qualification/p_Success'))

