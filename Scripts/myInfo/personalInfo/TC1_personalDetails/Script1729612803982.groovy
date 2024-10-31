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

WebUI.click(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/a_My Info'))

WebUI.sendKeys(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/input_Employee Full Name_firstName'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/input_Employee Full Name_firstName'), 'John')

WebUI.sendKeys(findTestObject('myInfo/personalInfo/personalDetails/input_Employee Full Name_middleName'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/input_Employee Full Name_middleName'), 'michael')

WebUI.sendKeys(findTestObject('myInfo/personalInfo/personalDetails/input_Employee Full Name_lastName'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/input_Employee Full Name_lastName'), 'Doe')

WebUI.sendKeys(findTestObject('myInfo/personalInfo/personalDetails/input_Employee Id_oxd-input oxd-input--active'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/input_Employee Id_oxd-input oxd-input--active'), 
    'EP1234')

WebUI.sendKeys(findTestObject('myInfo/personalInfo/personalDetails/input_Other Id_oxd-input oxd-input--active'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/input_Other Id_oxd-input oxd-input--active'), 'DL098')

WebUI.sendKeys(findTestObject('myInfo/personalInfo/personalDetails/input_concat(Driver, , s License Number)_ox_fac1ff'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/input_concat(Driver, , s License Number)_ox_fac1ff'), 
    'POM1234')

WebUI.click(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/i_License Expiry Date_oxd-icon bi-calendar _fa83c8'))

WebUI.doubleClick(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/button_License Expiry Date_oxd-icon-button'))

WebUI.click(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/div_19'))

WebUI.click(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/i_Afghan_oxd-icon bi-caret-up-fill oxd-sele_c0b820'))

WebUI.click(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/i_Single_oxd-icon bi-caret-up-fill oxd-sele_2239c5'))

WebUI.click(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/i_Date of Birth_oxd-icon bi-calendar oxd-da_a2e97b'))

WebUI.click(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/div_6'))

WebUI.click(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/span_Male_oxd-radio-input oxd-radio-input--_b0de6e'))

WebUI.click(findTestObject('Object Repository/myInfo/personalInfo/personalDetails/button_Save'))

WebUI.verifyElementVisible(findTestObject('myInfo/personalInfo/personalDetails/p_Success'))

