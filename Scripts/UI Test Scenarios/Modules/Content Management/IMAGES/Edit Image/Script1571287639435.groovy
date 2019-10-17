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

WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Dashboard/div_Content'))

WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Templates/a_Images'))

WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Images/button_Local_dropdown-toggle btn btn-icon btn-light'))

WebUI.scrollToElement(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Images/a_Edit'), 
    0)

WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Images/a_Edit'))

WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Edit Image/label_Transaction'))

WebUI.click(findTestObject('UI Test Scenarios/Modules/Content Management/IMAGES/Edit Image/Page_Edit Image/button_Save'))

