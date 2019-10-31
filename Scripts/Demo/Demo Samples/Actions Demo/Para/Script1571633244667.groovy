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

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_GSM Portal/button_Log in'))

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_GSM Login/input_Email Address_email'), un)

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_GSM Login/input_Password_password'), pw)

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_GSM Login/button_Log In'))

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Dashboard/div_Content'))

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Templates/a_Offers'))

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/a_New Offer'))

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/input_Offer Name_name'), OfferName)

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/input_Marketing Category_marketingCategory'))

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/textarea_Offer Description_description'), OfferDescription)

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/input_Objects set to expire will be automatically archived_expiration'), 
    '10/25/2019')

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/button_Select'))

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/a_English (US)'))

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/button_Next'))

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/textarea_Title_title'), Title)

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/textarea_Subtitle_subtitle'), Subtitle)

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/textarea_Body_body'), Body)

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/input_Offer_offer'), OfferValue)

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/button_Select_1'))

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/a_No Expiration Date'))

WebUI.setText(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/textarea_Terms  Conditions_termsAndConditions'), TermsAndConditions)

WebUI.click(findTestObject('Demo/Demo Samples/Actions Demo/Para/Page_Offers/button_Create'))

WebUI.closeBrowser()

