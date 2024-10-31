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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/recruitment/candidates/input_Username_username'), 'Admin')

WebUI.setText(findTestObject('Object Repository/recruitment/candidates/input_Password_password'), 'admin123')

WebUI.click(findTestObject('Object Repository/recruitment/candidates/button_Login'))

WebUI.click(findTestObject('Object Repository/recruitment/candidates/a_Recruitment'))

WebUI.click(findTestObject('Object Repository/recruitment/candidates/button_Add'))

WebUI.setText(findTestObject('Object Repository/recruitment/candidates/input_Full Name_firstName'), 'rey')

WebUI.setText(findTestObject('Object Repository/recruitment/candidates/input_Full Name_middleName'), 'ar')

WebUI.setText(findTestObject('Object Repository/recruitment/candidates/input_Full Name_lastName'), 'dian')

WebUI.click(findTestObject('Object Repository/recruitment/candidates/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('recruitment/candidates/span_Junior Account Assistant'))

WebUI.setText(findTestObject('Object Repository/recruitment/candidates/input_Email_oxd-input oxd-input--focus'), 'reydiana@example.com')

WebUI.setText(findTestObject('Object Repository/recruitment/candidates/input_Contact Number_oxd-input oxd-input--active'), '123123')

//WebUI.click(findTestObject('Object Repository/recruitment/candidates/i_No file selected_oxd-icon bi-upload oxd-f_21640a'))

//WebUI.uploadFile(findTestObject('recruitment/candidates/fileInput'), 'D:\\test.pdf')

WebUI.setText(findTestObject('Object Repository/recruitment/candidates/input_Keywords_oxd-input oxd-input--focus'), 'test,qa')

WebUI.click(findTestObject('Object Repository/recruitment/candidates/i_Date of Application_oxd-icon bi-calendar _dfcec9'))

WebUI.click(findTestObject('Object Repository/recruitment/candidates/div_9'))

WebUI.setText(findTestObject('Object Repository/recruitment/candidates/textarea_Notes_oxd-textarea oxd-textarea--f_0ce0e8'), 'test')

WebUI.click(findTestObject('Object Repository/recruitment/candidates/label_Consent to keep data'))

WebUI.click(findTestObject('Object Repository/recruitment/candidates/i_Consent to keep data_oxd-icon bi-check ox_63b9ed'))

WebUI.click(findTestObject('Object Repository/recruitment/candidates/button_Save'))

WebUI.click(findTestObject('Object Repository/recruitment/candidates/p_Success'))

WebUI.closeBrowser()

