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

WebUI.click(findTestObject('Website/punya wiska/Homepage/btn_NavEvents'))

WebUI.click(findTestObject('Website/punya wiska/eventPage/item_Day3'))

WebUI.click(findTestObject('Website/punya wiska/day3EventPage/a_Beli Tiket'))

WebUI.delay(2)

WebUI.click(findTestObject('Website/punya wiska/day3EventPage/lnk_eventLebih'))

WebUI.click(findTestObject('Website/punya wiska/eventPage/item_Day4'))

WebUI.click(findTestObject('Website/punya wiska/day4EventPage/a_Beli Tiket'))

WebUI.verifyElementPresent(findTestObject('Website/punya wiska/day3EventPage/lnk_eventLebih'), 0)

WebUI.closeBrowser()

