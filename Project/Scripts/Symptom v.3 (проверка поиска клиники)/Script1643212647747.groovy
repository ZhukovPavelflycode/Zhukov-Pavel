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

WebUI.setViewPortSize(425, 1000, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://staticsite.symptomd.com/', FailureHandling.STOP_ON_FAILURE)

'Открыть список городов\r\n'
WebUI.click(findTestObject('Symptom/Location 3 test'), FailureHandling.STOP_ON_FAILURE)

'Выбрать город Самара\r\n'
WebUI.click(findTestObject('Object Repository/Symptom/Krasnodar'), FailureHandling.STOP_ON_FAILURE)

'Выбрать пол М'
WebUI.click(findTestObject('Object Repository/Symptom/Gender-M'), FailureHandling.STOP_ON_FAILURE)

'Выбрать возраст 65'
WebUI.setText(findTestObject('Object Repository/Symptom/Age 65'), '65', FailureHandling.STOP_ON_FAILURE)

'Перейти на страницу "Клиники"'
WebUI.click(findTestObject('Object Repository/Symptom/Button clinic'), FailureHandling.STOP_ON_FAILURE)

'Сверить возраст 65'
WebUI.verifyElementText(findTestObject('Symptom/Examination 65'), '65')

'Нажать на фильтр "Города"\r\n'
WebUI.click(findTestObject('Object Repository/Symptom/Button city'), FailureHandling.STOP_ON_FAILURE)

'Выбрать город Санкт-Петербург'
WebUI.click(findTestObject('Symptom/Press Seint-Petersburg'), FailureHandling.STOP_ON_FAILURE)

'Ввести город Воронеж в поиск'
WebUI.setText(findTestObject('Object Repository/Symptom/Imput Voronezh'), 'Воронеж', FailureHandling.STOP_ON_FAILURE)

'Выбрать Воронеж'
WebUI.click(findTestObject('Symptom/Press Voronezh'), FailureHandling.STOP_ON_FAILURE)

'Закрыть форму выбора городов'
WebUI.click(findTestObject('Object Repository/Symptom/Exite-form'), FailureHandling.STOP_ON_FAILURE)

'Перейти в клинику "Медика"\r\n'
WebUI.click(findTestObject('Symptom/Head Medica'))

'Перейти на сайт в карточка "Медика"'
WebUI.click(findTestObject('Symptom/Press site'))

