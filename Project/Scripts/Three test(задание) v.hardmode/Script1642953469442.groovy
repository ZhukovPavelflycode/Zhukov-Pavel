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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.noob-club.ru/')

'Переход на страницу 14\r\n'
WebUI.click(findTestObject('Object Repository/Three test(задание) hardmode/click page 14'))

'Получаем название заголовка в переменную'
Op = WebUI.getText(findTestObject('Object Repository/Three test(задание) hardmode/Click on header news'), FailureHandling.STOP_ON_FAILURE)

'Открываем страницу с новостью'
WebUI.click(findTestObject('Object Repository/Three test(задание) hardmode/Click on header news'))

'Получаем в переменную заголовок новости внутри страницы'
Ip = WebUI.getText(findTestObject('Object Repository/Three test(задание) hardmode/Header new on page'))

'Сравниваем результаты'
WebUI.verifyMatch(Op, Ip, true)

