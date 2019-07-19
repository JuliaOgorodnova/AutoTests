package qa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Condition;

import qa.tests.model.ContactInfo;

import static qa.tests.pages.CellListPage.*;
import static qa.tests.utils.PropertyUtils.GENERATE_CONTACT;

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
		fillContactInfo(ContactInfo.buildDefaultContactInfo());
		CATEGORY.get(0).click();
		LAST_NAME.click();
		CREATE_CONTACT.click();
	}

	@Test
	@DisplayName("Редактирование существующего пользователя")
	void testEditingUser() {
		EDITING_USER.click();
		fillContactInfo(ContactInfo.buildDefaultContactInfo());
		LAST_NAME.click();
		UPDATE_CONTACT.click();
	}

	@Test
	@DisplayName("Добавление 50 пользователей и проверка что их 300")
	void testGenerateContactsUser() {
		GENERATE_CONTACTS.click();
		NUMBER_USERS.should(Condition.text(GENERATE_CONTACT.getString("generateContact.threeHundredContact")));
	}
}

