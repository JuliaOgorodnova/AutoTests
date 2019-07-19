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
		CONTACT_INFO_TABLE.shouldBe(Condition.visible);
		FIRST_NAME.shouldBe(Condition.visible);
		LAST_NAME.shouldBe(Condition.visible);
		BIRTHDAY.shouldBe(Condition.visible);
		ADDRESS.shouldBe(Condition.visible);
		UPDATE_CONTACT.shouldBe(Condition.visible);
	}

	@Test
	@DisplayName("Создание нового пользователя")
	void testCreateNewUser() {
		CELL_LIST_TITLE.shouldBe(Condition.visible);
		CONTACT_INFO_TABLE.shouldBe(Condition.visible);
		fillContactInfo(ContactInfo.buildDefaultContactInfo());
		CATEGORY.get(0).click();
		LAST_NAME.click();
		CREATE_CONTACT.click();
	}

	@Test
	@DisplayName("Редактирование существующего пользователя")
	void testEditingUser() {
		CELL_LIST_TITLE.shouldBe(Condition.visible);
		CONTACT_INFO_TABLE.shouldBe(Condition.visible);
		EDITING_USER.click();
		fillContactInfo(ContactInfo.buildDefaultContactInfo());
		LAST_NAME.click();
		UPDATE_CONTACT.click();
	}

	@Test
	@DisplayName("Редактирование адреса у существующего пользователя")
	void testEditingAddressUser() {
		CELL_LIST_TITLE.shouldBe(Condition.visible);
		CONTACT_INFO_TABLE.shouldBe(Condition.visible);
		EDITING_USER.click();
		ADDRESS.setValue("1");
		UPDATE_CONTACT.click();
	}

}

