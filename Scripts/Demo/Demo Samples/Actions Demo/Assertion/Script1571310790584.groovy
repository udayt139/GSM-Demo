import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.gsm.auto/logout')

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_GSM Portal/button_Log in'))

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_GSM Login/input_Email Address_email'), 'sankaran@totient.co.in')

WebUI.setEncryptedText(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_GSM Login/input_Password_password'), '4bOuNFpH31s4Qkh1shYRow==')

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_GSM Login/button_Log In'))

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Dashboard/div_Content'))

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Templates/a_Offers'))

WebUI.verifyElementPresent(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Offers/a_alex 10-16'), 1)

WebUI.verifyElementPresent(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Offers/a_alex 10-16-1'), 1)

WebUI.verifyElementPresent(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Offers/button_Tags'), 0)

WebUI.verifyElementPresent(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Offers/span_Filter'), 0)

WebUI.verifyElementPresent(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Offers/button_All Offers'), 0)

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Offers/a_New Offer'))

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Offers/textarea_Offer Description_description'), 'abc')

not_run: WebUI.verifyElementPresent(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Offers/div_3  250 characters'), 2)

WebUI.verifyElementText(findTestObject('Demo/Demo Samples/Actions Demo/Assertion/Page_Offers/div_3  250 characters'), '3 / 250 characters')

