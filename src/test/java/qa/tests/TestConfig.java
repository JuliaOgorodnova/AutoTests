package qa.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.codeborne.selenide.Selenide.open;

@FieldDefaults(makeFinal = true, level = AccessLevel.PROTECTED)
public class TestConfig {

	@BeforeAll
	public static void setUp() {
		Configuration.browser = "chrome";
		Configuration.baseUrl = "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellList";
		Configuration.browserSize = "1920x1080";
		open("");
	}

	@AfterAll
	public static void tearDown() {
		WebDriverRunner.clearBrowserCache();
		WebDriverRunner.getWebDriver().manage().deleteAllCookies();
		WebDriverRunner.getWebDriver().close();
	}
}
