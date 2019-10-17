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

not_run: WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Dashboard/div_Content'))

not_run: WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Templates/a_Images'))

not_run: WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Images/a_Upload'))

not_run: WebUI.setText(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Upload Images/input_Image Name_image-group-0-name'), 
    'innova')

not_run: CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Upload Images/div_Select Files'), 
    'C:\\Users\\Dell\\Pictures\\Innova.jpg')

not_run: WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Upload Images/button_Select'))

not_run: WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Upload Images/a_Email'))

not_run: WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Upload Images/button_Select_1'))

not_run: WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Upload Images/a_English (US)'))

not_run: WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Upload Images/input_Marketing Category_image-group-0-marketingCategory'))

not_run: WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Upload Images/button_Finish Upload'))

