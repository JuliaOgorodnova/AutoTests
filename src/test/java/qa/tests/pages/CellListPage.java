package qa.tests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import qa.tests.model.ContactInfo;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CellListPage {

	public static final SelenideElement CELL_LIST_TITLE = $(byXpath("//div[@class='GNHGC04CHJ']"));
	public static final SelenideElement CONTACT_INFO_TABLE = $(byXpath("//div[@class='middleCenterInner']//div//table"));
	public static final SelenideElement EDITING_USER = $(byXpath("//div[@class='GNHGC04CGB']//div[1]"));
	public static final SelenideElement FIRST_NAME = $(byXpath("//tr[@class='middle']//tr[2]//td[2]//input[1]"));
	public static final SelenideElement LAST_NAME = $(byXpath("//tr[@class='middle']//tr[3]//td[2]//input[1]"));
	public static final ElementsCollection CATEGORY = $$(byXpath("//select[@class='gwt-ListBox']"));
	public static final SelenideElement BIRTHDAY = $(byXpath("//input[@class='gwt-DateBox']"));
	public static final SelenideElement ADDRESS = $(byXpath("//textarea[@class='gwt-TextArea']"));
	public static final SelenideElement UPDATE_CONTACT = $(byXpath("//button[contains(text(),'Update Contact')]"));
	public static final SelenideElement CREATE_CONTACT = $(byXpath("//button[contains(text(),'Create Contact')]"));
	public static final SelenideElement GENERATE_CONTACTS = $(byXpath("//button[contains(text(),'Generate 50 Contacts')]"));
	public static final SelenideElement NUMBER_USERS = $(byXpath("//div[contains(text(),'0 - 30 :')]"));

	public static void fillContactInfo (final ContactInfo contactInfo) {
		FIRST_NAME.setValue(contactInfo.firstName());
		LAST_NAME.setValue(contactInfo.lastName());
		BIRTHDAY.setValue(contactInfo.birthday());
		ADDRESS.setValue(contactInfo.address());
	}

}


