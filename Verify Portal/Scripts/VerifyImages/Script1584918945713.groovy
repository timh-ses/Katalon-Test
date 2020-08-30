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

WebUI.sendKeys(findTestObject('Object Repository/Page_Secure Exchange Solutions Messaging/input_Password_Password'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Page_Admin - - Secure Exchange Solutions- Direct Mail/i_Close_fas fa-lock fa-2x'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Admin - - Secure Exchange Solutions- Direct Mail/i_Manage_fa fa-book fa-2x'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Admin - - Secure Exchange Solutions- Direct Mail/i_Manage_fas fa-user-circle fa-2x'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Admin - - Secure Exchange Solutions- Direct Mail/i_Start_fas fa-building fa-2x'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Admin - - Secure Exchange Solutions- D_b9be61/span_SesTest'))

WebUI.click(findTestObject('Page_Admin - - Secure Exchange Solutions- D_b9be61/a_Sign Out'))

WebUI.closeBrowser()

