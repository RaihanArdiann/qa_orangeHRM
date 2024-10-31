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

WebUI.click(findTestObject('Object Repository/myInfo/dependent/a_My Info'))

WebUI.click(findTestObject('Object Repository/myInfo/dependent/a_Dependents'))

WebUI.click(findTestObject('Object Repository/myInfo/dependent/button_Add'))

WebUI.setText(findTestObject('Object Repository/myInfo/dependent/input_Name_oxd-input oxd-input--focus'), 'Ardi')

WebUI.click(findTestObject('myInfo/dependent/i_-- Select --_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('myInfo/dependent/div_Child'))

WebUI.click(findTestObject('Object Repository/myInfo/dependent/i_Date of Birth_oxd-icon bi-calendar oxd-da_a2e97b'))

WebUI.click(findTestObject('Object Repository/myInfo/dependent/div_25'))

WebUI.click(findTestObject('Object Repository/myInfo/dependent/button_Save'))

WebUI.click(findTestObject('Object Repository/myInfo/dependent/p_Success'))

