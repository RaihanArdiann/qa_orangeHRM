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

WebUI.click(findTestObject('Object Repository/recruitment/vacancies/a_Recruitment'))

WebUI.click(findTestObject('Object Repository/recruitment/vacancies/a_Vacancies'))

WebUI.click(findTestObject('recruitment/vacancies/button_AddVacancies'))

WebUI.setText(findTestObject('Object Repository/recruitment/vacancies/input_Vacancy Name_oxd-input oxd-input--focus'), 'doing something')

WebUI.click(findTestObject('recruitment/vacancies/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/recruitment/vacancies/div_Account Assistant'))

WebUI.setText(findTestObject('Object Repository/recruitment/vacancies/textarea_Description_oxd-textarea oxd-texta_fed1e5'), 
    'test')

WebUI.setText(findTestObject('Object Repository/recruitment/vacancies/input'), 't')

WebUI.delay(5)

WebUI.click(findTestObject('recruitment/vacancies/div_Thomas Kutty Benny'))

WebUI.setText(findTestObject('Object Repository/recruitment/vacancies/input_Number of Positions_oxd-input oxd-inp_1ab10d'), 
    '1')

WebUI.click(findTestObject('recruitment/vacancies/button_Save'))

WebUI.verifyElementVisible(findTestObject('myInfo/personalInfo/personalDetails/p_Success'))

