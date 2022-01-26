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

WebUI.navigateToUrl('https://staticsite.symptomd.com/')

'Открыть список городов\r\n'
WebUI.click(findTestObject('Object Repository/Symptom/Location'))

'Выбрать город "Самара"'
WebUI.click(findTestObject('Object Repository/Symptom/Samara'))

'Выбрать пол Ж'
WebUI.click(findTestObject('Object Repository/Symptom/Gender Zh'))

'Выбрать возраст "40"'
WebUI.setText(findTestObject('Object Repository/Symptom/Age 40'), '40')

'Перейти на страницу "Болезни"'
WebUI.click(findTestObject('Object Repository/Symptom/Disease'))

'Ввести в поиске "Мигрень"'
WebUI.setText(findTestObject('Object Repository/Symptom/Imput disease'), 'Мигрень')

'Войти в карточку "Мигрень"'
WebUI.click(findTestObject('Object Repository/Symptom/Card disease'))

'Нажать кнопку "Записаться"'
WebUI.click(findTestObject('Object Repository/Symptom/Button enroll first'))

'Ввести имя'
WebUI.setText(findTestObject('Object Repository/Symptom/Input name'), 'Игорь')

'Ввести телефон'
WebUI.setText(findTestObject('Object Repository/Symptom/Input phone'), '8-905-837-56-44')

'Подтвердить введеные данные'
WebUI.click(findTestObject('Object Repository/Symptom/Button enroll second'))

'Нажать "Ок" в форме записи'
WebUI.click(findTestObject('Object Repository/Symptom/button Ok'))

