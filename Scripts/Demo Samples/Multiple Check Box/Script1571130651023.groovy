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

WebUI.click(findTestObject('Demo Samples/Multiple Check Box/Page_GSM Portal/button_Log in'))

WebUI.setText(findTestObject('Demo Samples/Multiple Check Box/Page_GSM Login/input_Email Address_email'), 'sankaran@totient.co.in')

WebUI.setEncryptedText(findTestObject('Demo Samples/Multiple Check Box/Page_GSM Login/input_Password_password'), '4bOuNFpH31s4Qkh1shYRow==')

WebUI.click(findTestObject('Demo Samples/Multiple Check Box/Page_GSM Login/button_Log In'))

WebUI.click(findTestObject('Demo Samples/Multiple Check Box/Page_Dashboard/div_Content'))

WebUI.click(findTestObject('Demo Samples/Multiple Check Box/Page_Templates/a_Offers'))

WebUI.check(findTestObject('Demo Samples/Multiple Check Box/Page_Offers/label'))

WebUI.scrollToElement(findTestObject('Demo Samples/Multiple Check Box/Page_Offers/label_a1'), 0)

WebUI.check(findTestObject('Demo Samples/Multiple Check Box/Page_Offers/label_a1'))

