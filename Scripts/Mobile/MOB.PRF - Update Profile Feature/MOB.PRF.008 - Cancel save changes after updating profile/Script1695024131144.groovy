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

WebUI.callTestCase(findTestCase('Mobile/Reuse Test Case/User Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/profilePage/btn_SettingProfile'), 0)

Mobile.tap(findTestObject('Mobile/profilePage/btn_EditProfile'), 0)

Mobile.setText(findTestObject('Mobile/profilePage/updateProfilePage/form_EditName'), 'Simanta Fulan', 0)

Mobile.setText(findTestObject('Mobile/profilePage/updateProfilePage/form_EditWA'), '12365678192', 0)

Mobile.tap(findTestObject('Mobile/profilePage/updateProfilePage/btn_SaveChanges'), 0)

Mobile.verifyElementText(findTestObject('Mobile/profilePage/updateProfilePage/txt_SuccessUpdate'), 'Success')

Mobile.tap(findTestObject('Mobile/profilePage/updateProfilePage/btn_CancelUpdate'), 0)

Mobile.closeApplication()

