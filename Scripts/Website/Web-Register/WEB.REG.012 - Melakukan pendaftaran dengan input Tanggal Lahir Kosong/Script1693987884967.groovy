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

WebUI.navigateToUrl('https://demo-app.online/')

WebUI.click(findTestObject('Page_Coding.id - Halaman Utama/button_Buat                                _86b528'))

WebUI.setText(findTestObject('Page_Coding.ID - Register/input_Nama'), 'John Doe')

WebUI.setText(findTestObject('Page_Coding.ID - Register/input_E-Mail'), 'abc@gm.com')

WebUI.setText(findTestObject('Page_Coding.ID - Register/input_Whatsapp'), '088811112222')

WebUI.setEncryptedText(findTestObject('Page_Coding.ID - Register/input_Kata Sandi'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.setEncryptedText(findTestObject('Page_Coding.ID - Register/input_Konfirmasi kata sandi'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Page_Coding.ID - Register/input_Checkbox Setuju Syarat dan Ketentuan'))

WebUI.click(findTestObject('Page_Coding.ID - Register/button_Daftar'))

WebUI.verifyElementText(findTestObject('Page_Coding.ID - Register/Word_Wajib di isi'), 'Wajib di isi.')

WebUI.closeBrowser()

