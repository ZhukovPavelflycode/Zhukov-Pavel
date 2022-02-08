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

WebUI.setViewPortSize(425, 1000, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://staticsite.symptomd.com/')

'Открыть список городов\r\n'
WebUI.click(findTestObject('Symptom/Location 1,2 test'))

'Выбрать город "Самара"'
WebUI.click(findTestObject('Symptom/Samara'))

'Выбрать пол Ж'
WebUI.click(findTestObject('Symptom/Gender Zh'))

'Выбрать возраст "40"'
WebUI.setText(findTestObject('Symptom/Age 40'), '40')

'Перейти на страницу "Болезни"'
WebUI.click(findTestObject('Symptom/Disease'))

'Проверка возраста на странице "Болезни"'
WebUI.verifyElementText(findTestObject('Symptom/Examination 40'), '40')

'Ввести в поиске "Мигрень"'
WebUI.setText(findTestObject('Symptom/Imput disease'), 'Мигрень')

'Войти в карточку "Мигрень"'
WebUI.click(findTestObject('Symptom/Card disease'))

'Нажать кнопку "Записаться"'
WebUI.click(findTestObject('Symptom/Button enroll first'))

'Ввести имя'
WebUI.setText(findTestObject('Symptom/Input name'), 'Игорь')

'Ввести телефон'
WebUI.setText(findTestObject('Symptom/Input phone'), '8-905-837-56-44')

'Подтвердить введеные данные'
WebUI.click(findTestObject('Symptom/Button enroll second'))

'Нажать "Ок" в форме записи'
WebUI.click(findTestObject('Symptom/button Ok'))

