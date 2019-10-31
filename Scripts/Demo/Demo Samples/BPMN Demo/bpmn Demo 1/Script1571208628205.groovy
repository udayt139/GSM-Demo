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

WebUI.navigateToUrl('https://demo.bpmn.io/new')

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 50)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-intermediate-event-none'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 50)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-end-event-none'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    500, 50)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-connection-multi highlighted-entry'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 50)

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 50)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-connection-multi highlighted-entry'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 50)

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    500, 50)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-gateway-none'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 150)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-task'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 250)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-data-object'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 150)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-data-store'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, -50)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-subprocess-expanded'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    700, 150)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-participant'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 100)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-connection-multi highlighted-entry'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 50)

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, -50)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-connection-multi highlighted-entry'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 50)

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    300, 150)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-connection-multi highlighted-entry'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 50)

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 150)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-connection-multi highlighted-entry'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 150)

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 250)

WebUI.click(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-connection-multi highlighted-entry'))

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    400, 150)

WebUI.clickOffset(findTestObject('Demo/Demo Samples/BPMN Demo/bpmn Demo 1/Page_bpmn modeler  demobpmnio/div_Import Error Details_entry bpmn-icon-start-event-none'), 
    700, 150)

