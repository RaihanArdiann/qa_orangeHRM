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

WebUI.click(findTestObject('Object Repository/myInfo/contactDetails/a_My Info'))

WebUI.click(findTestObject('Object Repository/myInfo/contactDetails/a_Contact Details'))

WebUI.sendKeys(findTestObject('Object Repository/myInfo/contactDetails/input_Street 1_oxd-input oxd-input--focus'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_Street 1_oxd-input oxd-input--focus'), 'kliwon')

WebUI.sendKeys(findTestObject('Object Repository/myInfo/contactDetails/input_Street 2_oxd-input oxd-input--active'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_Street 2_oxd-input oxd-input--active'), 'pagongan')

WebUI.sendKeys(findTestObject('myInfo/contactDetails/input_City_oxd-input oxd-input--active'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_City_oxd-input oxd-input--active'), 'test')

WebUI.sendKeys(findTestObject('myInfo/contactDetails/input_StateProvince_oxd-input oxd-input--active'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_StateProvince_oxd-input oxd-input--active'), 
    'jaka')

WebUI.sendKeys(findTestObject('myInfo/contactDetails/input_ZipPostal Code_oxd-input oxd-input--active'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_ZipPostal Code_oxd-input oxd-input--active'), 
    '12345')

WebUI.click(findTestObject('Object Repository/myInfo/contactDetails/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.sendKeys(findTestObject('myInfo/contactDetails/input_Home_oxd-input oxd-input--focus'), Keys.chord(Keys.CONTROL, 'a', 
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_Home_oxd-input oxd-input--focus'), '123123123')

WebUI.sendKeys(findTestObject('myInfo/contactDetails/input_Mobile_oxd-input oxd-input--active'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_Mobile_oxd-input oxd-input--active'), '123123123')

WebUI.sendKeys(findTestObject('myInfo/contactDetails/input_Work_oxd-input oxd-input--active'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_Work_oxd-input oxd-input--active'), '0987654')

WebUI.sendKeys(findTestObject('myInfo/contactDetails/input_Work Email_oxd-input oxd-input--active'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_Work Email_oxd-input oxd-input--active'), 'sia@osohrm.com')

WebUI.sendKeys(findTestObject('myInfo/contactDetails/input_Other Email_oxd-input oxd-input--active'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/myInfo/contactDetails/input_Other Email_oxd-input oxd-input--active'), 'dio@osohrm.com')

WebUI.click(findTestObject('Object Repository/myInfo/contactDetails/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/myInfo/contactDetails/p_Success'))

