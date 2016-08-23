package com.testproject;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.URL;


public class SampleSauceTest {

	public static final String USERNAME = "zaheers";
	public static final String ACCESS_KEY = "9f4ad284-7db6-4797-a86d-fa8803f81162";
	//public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@localhost:4445/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows XP");
		caps.setCapability("version", "43.0");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		/**

		 * Goes to Sauce Lab's guinea-pig page and prints title

		 */

		driver.get("https://saucelabs.com/test/guinea-pig");
		//driver.get("http://www.google.com");

		System.out.println("title of page is: " + driver.getTitle());

		driver.quit();

	}

}


