package qa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;

import qa.tests.model.ContactInfo;

import static qa.tests.pages.CellListPage.*;

class AutoTest extends TestConfig {

	@Test
	@DisplayName("Проверка видимости элементов в таблице")
	void testVisibilityContactInfo() {
		CELL_LIST_TITLE.shouldBe(Condition.visible);
		CONTACT_INFO_TABLE.waitUntil(Condition.visible, 10000);
		FIRST_NAME.waitUntil(Condition.visible, 10000);
		LAST_NAME.waitUntil(Condition.visible, 10000);
		BIRTHDAY.waitUntil(Condition.visible, 10000);
		ADDRESS.waitUntil(Condition.visible, 10000);
		UPDATE_CONTACT.waitUntil(Condition.visible, 10000);
	}

	@Test
	@DisplayName("Создание нового пользователя")
	void testCreateNewUser() {
		CELL_LIST_TITLE.waitUntil(Condition.visible, 10000);
		CONTACT_INFO_TABLE.waitUntil(Condition.visible, 10000);
		fillContactInfo(ContactInfo.buildDefaultContactInfo());
		CATEGORY.get(0).click();
		LAST_NAME.click();
		CREATE_CONTACT.click();
	}

	@Test
	@DisplayName("Редактирование существующего пользователя")
	void testEditingUser() {
		CELL_LIST_TITLE.waitUntil(Condition.visible, 10000);
		CONTACT_INFO_TABLE.waitUntil(Condition.visible, 10000);
		EDITING_USER.click();
		fillContactInfo(ContactInfo.buildDefaultContactInfo());
		LAST_NAME.click();
		UPDATE_CONTACT.click();
	}

	@Test
	@DisplayName("Редактирование адреса у существующего пользователя")
	void testEditingAddressUser() {
		CELL_LIST_TITLE.waitUntil(Condition.visible, 10000);
		CONTACT_INFO_TABLE.waitUntil(Condition.visible, 10000);
		EDITING_USER.click();
		ADDRESS.setValue("1");
		UPDATE_CONTACT.click();
	}

}

