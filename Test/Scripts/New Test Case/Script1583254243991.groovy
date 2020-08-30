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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sestest.direct-address.com/portal')

WebUI.setText(findTestObject('Object Repository/Page_Secure Exchange Solutions Messaging/input_Username_UserName'), 'SesTest')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Secure Exchange Solutions Messaging/input_Password_Password'), 
    'au3+5pXudk0Bt5GS9RgB2Be0fPPFonkE')

WebUI.click(findTestObject('Object Repository/Page_Secure Exchange Solutions Messaging/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Admin - - Secure Exchange Solutions- D_b9be61/span_Mail'))

WebUI.click(findTestObject('Object Repository/Page_Admin - - Secure Exchange Solutions- D_b9be61/a_Webmail'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Email - - Secure Exchange Solutions- D_8db636/select_SesTestsestestdirect-addresscomYaleT_4950be'), 
    'YaleTest@sestest.direct-address.com', true)

WebUI.click(findTestObject('Object Repository/Page_Email - - Secure Exchange Solutions- D_8db636/div_TEST YALE - Emergency Department Discharge (A03)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Email - - Secure Exchange Solutions- D_8db636/li_Notificationpdf27KB'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Email - - Secure Exchange Solutions- D_8db636/li_Notificationxml17KBView'), 
    0)

WebUI.closeBrowser()

