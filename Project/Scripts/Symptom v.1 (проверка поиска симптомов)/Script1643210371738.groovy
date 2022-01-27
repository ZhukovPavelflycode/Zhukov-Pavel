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

WebUI.navigateToUrl('https://symptomd.ru/')

'Открыть список городов\r\n'
WebUI.click(findTestObject('Object Repository/Symptom/Symptom/Location'))

'Выбрать Москва'
WebUI.click(findTestObject('Object Repository/Symptom/Symptom/Moscow'))

'Сменить пол на "М"'
WebUI.click(findTestObject('Object Repository/Symptom/Symptom/Gender_M'))

'Сменить возраст на "20"'
WebUI.setText(findTestObject('Object Repository/Symptom/Symptom/Age 20'), '20')

'Перейти на вкладку "Симптомы"'
WebUI.click(findTestObject('Object Repository/Symptom/Symptom/Symptom tab'))

WebUI.verifyElementText(findTestObject('Object Repository/Symptom/Page_/Examination 33'), '33')

'Ввести в поиске "Кашель"'
WebUI.setText(findTestObject('Object Repository/Symptom/Symptom/Input cough'), 'Кашель')

'Зайти в карточку "Кашель"'
WebUI.click(findTestObject('Object Repository/Symptom/Symptom/Card enty'))

