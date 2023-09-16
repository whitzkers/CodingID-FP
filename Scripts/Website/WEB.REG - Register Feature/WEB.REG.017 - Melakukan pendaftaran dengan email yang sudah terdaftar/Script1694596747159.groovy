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

WebUI.callTestCase(findTestCase('Website/Reuse TC/Access to Register Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Website/registerPage/form_Nama'), GlobalVariable.regValidName)

WebUI.setText(findTestObject('Website/registerPage/form_Tanggal lahir'), GlobalVariable.validDate)

WebUI.setText(findTestObject('Website/registerPage/form_E-Mail'), GlobalVariable.EmailReuse)

WebUI.setText(findTestObject('Website/registerPage/form_Whatsapp'), GlobalVariable.validWhatsapp)

WebUI.setEncryptedText(findTestObject('Website/registerPage/form_Kata Sandi'), GlobalVariable.regValidPassword)

WebUI.setEncryptedText(findTestObject('Website/registerPage/form_Konfirmasi kata sandi'), GlobalVariable.regValidConfirmPassword)

WebUI.click(findTestObject('Website/registerPage/check_Checkbox Setuju Syarat dan Ketentuan'))

WebUI.click(findTestObject('Website/registerPage/btn_Daftar'))

WebUI.verifyElementText(findTestObject('Website/registerPage/txt_Email sudah terdaftar'), 'Email sudah terdaftar.')

WebUI.closeBrowser()

