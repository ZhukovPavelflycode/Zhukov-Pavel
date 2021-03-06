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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Переход на сайт риа новости'
WebUI.navigateToUrl('https://ria.ru/', FailureHandling.STOP_ON_FAILURE)

'Получаем текст в переменную'
N = WebUI.getText(findTestObject('Object Repository/Second test (переменная)/News'), FailureHandling.STOP_ON_FAILURE)

'Переходим на новость'
WebUI.click(findTestObject('Object Repository/Second test (переменная)/News'), FailureHandling.STOP_ON_FAILURE)

'Сравнивает переменную и заголовок новости'
WebUI.verifyElementText(findTestObject('Object Repository/Second test (переменная)/Page'), N, FailureHandling.STOP_ON_FAILURE)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

