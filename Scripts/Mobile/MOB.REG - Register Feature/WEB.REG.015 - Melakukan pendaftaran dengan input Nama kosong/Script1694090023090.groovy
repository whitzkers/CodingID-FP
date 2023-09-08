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

Mobile.startApplication('D:\\Users\\bsi80194\\Downloads\\DemoAppV2.apk', true)

Mobile.tap(findTestObject('btn_Login Here'), 0)

Mobile.tap(findTestObject('btn_Register'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Register Page/btn_Calendar'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Register Page/btn_CalendarDate'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Register Page/btn_CalendarOK'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile_Register Page/form_Email'), 'abc@gm.com', 0)

Mobile.setText(findTestObject('Object Repository/Mobile_Register Page/form_Phone'), '088811112222', 0)

Mobile.setText(findTestObject('Object Repository/Mobile_Register Page/form_Password'), 'P@ssw0rd', 0)

Mobile.setText(findTestObject('Object Repository/Mobile_Register Page/form_ConfirmPassword'), 'P@ssw0rd', 0)

Mobile.tap(findTestObject('Object Repository/Mobile_Register Page/form_CheckboxSyaratKetentuan'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Mobile_Register Page/btn_Daftar'), 'clickable', 'false', 0)

Mobile.closeApplication()

