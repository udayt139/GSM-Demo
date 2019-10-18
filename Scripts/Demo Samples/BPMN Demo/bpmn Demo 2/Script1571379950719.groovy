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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.bpmn.io/new')

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'))

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 50)

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-intermediate-event-none'))

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-gateway-none'))

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-end-event-none'))

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 50)

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-screw-wrench'))

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/1/Page_bpmn modeler  demobpmnio/div_Conditional Start Event'))

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 50)

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-data-object'))

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, -50)

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-connection-multi highlighted-entry'))

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 50)

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, -50)

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-data-store'))

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 150)

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-connection-multi highlighted-entry'))

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 50)

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 150)

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-participant'))

WebUI.clickOffset(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-participant'), 
    300, 50)

WebUI.click(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/span_Import Error Details_icon-download'))

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(findTestObject('Demo Samples/BPMN Demo/bpmn Demo 2/Page_bpmn modeler  demobpmnio/span_Import Error Details_icon-open'), 
    'C:\\Users\\Dell\\Downloads\\diagram.bpmn')

WebUI.closeBrowser()

