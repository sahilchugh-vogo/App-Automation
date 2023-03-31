from appium import webdriver
from appium.options.android import UiAutomator2Options
from appium.webdriver.common.appiumby import AppiumBy
import time

options = UiAutomator2Options()
options.platformVersion = '13'
options.udid = '192.168.1.5:34941'  # Device ID
options.app = '/Users/sahilchugh/downloads/Vogo2803.apk'  # App path
# options.app_package = 'in.vogo.lite'
options.app_package = 'com.VoDrive.debug'
#options.app_activity = 'com.VoDrive.signup.SignUpActivity'
options.new_command_timeout = 600
options.no_reset = True
driver = webdriver.Remote('http://127.0.0.1:4723/wd/hub', options=options)
# driver.context = 

options.new_command_timeout = 3000

driver.find_element(AppiumBy.ID, "com.VoDrive.debug:id/main_screen_open_btn").click()

options.new_command_timeout = 8000

# for (String context : contexts) {
#     System.out.println(contexts);
#     if (!context.equals("NATIVE_APP")) {
#         driver.context((String) contexts.toArray()[1]);
#         break;
#     }
# }

# driver.switch_to('webview_com.VoDrive.debug')

time.sleep(11)

webview = driver.contexts[1]
driver.switch_to.context(webview)

# mobileElem = driver.find_elements(AppiumBy.CLASS_NAME, 'android.widget.EditText')[0]
mobileElem = driver.find_element(AppiumBy.XPATH, '//input[@id="phone-input"]')
mobileElem.send_keys('8929329120')
# buttonElem = driver.find_elements(AppiumBy.CLASS_NAME, 'android.widget.Button')[0]

buttonElem = driver.find_element(AppiumBy.XPATH, '//*[contains(text(), "Get OTP")]')
buttonElem.click()

# //input[@placeholder="Enter OTP"]


time.sleep(10)
otpElement = driver.find_element(AppiumBy.XPATH, '//input[@placeholder="Enter OTP"]')
otpElement.send_keys('791972')
time.sleep(2)

verifyElement = driver.find_element(AppiumBy.XPATH, '//*[contains(text(), "Verify OTP")]')
verifyElement.click()
# book_now_elem = driver.find_elements(AppiumBy.XPATH, "//*[text()[contains(.,'Book Now')]]")[0]