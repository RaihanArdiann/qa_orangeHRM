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

WebUI.click(findTestObject('Object Repository/myInfo/emergencyContact/a_My Info'))

WebUI.click(findTestObject('Object Repository/myInfo/emergencyContact/a_Emergency Contacts'))

WebUI.click(findTestObject('Object Repository/myInfo/emergencyContact/i_Add_oxd-icon bi-plus oxd-button-icon'))

WebUI.setText(findTestObject('Object Repository/myInfo/emergencyContact/input_Name_oxd-input oxd-input--focus'), name)

WebUI.setText(findTestObject('Object Repository/myInfo/emergencyContact/input_Relationship_oxd-input oxd-input--active'), 
    relation)

WebUI.setText(findTestObject('Object Repository/myInfo/emergencyContact/input_Home Telephone_oxd-input oxd-input--active'), 
    home)

WebUI.setText(findTestObject('Object Repository/myInfo/emergencyContact/input_Mobile_oxd-input oxd-input--active'), mobile)

WebUI.setText(findTestObject('Object Repository/myInfo/emergencyContact/input_Work Telephone_oxd-input oxd-input--active'), 
    work)

WebUI.click(findTestObject('Object Repository/myInfo/emergencyContact/button_Save'))

WebUI.click(findTestObject('Object Repository/myInfo/emergencyContact/p_Success'))

