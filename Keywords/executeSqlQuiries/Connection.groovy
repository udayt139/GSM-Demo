//package executeSqlQuiries
//
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//
//import internal.GlobalVariable
//import groovy.sql.Sql
//import java.sql.*
//
//public class Connection {
//
//	@Keyword
//	public connections(String url, String user, String password, String driverClassName) {
//
//		def sqlConnection = Sql.newInstance(url, user, password, driverClassName)
//		sqlConnection.eachRow("SELECT * FROM assignment_status") {  row ->
//			println row[0]
//		}
//	}
//}
