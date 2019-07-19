package qa.tests.model;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

import static qa.tests.utils.PropertyUtils.CONTACT_INFO;

@Value
@Builder
@Accessors(fluent = true)
public class ContactInfo {
	String firstName;
	String lastName;
	String birthday;
	String address;

	public static ContactInfo buildDefaultContactInfo() {
		return ContactInfo.builder()
				.firstName(CONTACT_INFO.getString("contactInfo.firstName"))
				.lastName(CONTACT_INFO.getString("contactInfo.lastName"))
				.birthday(CONTACT_INFO.getString("contactInfo.birthday"))
				.address(CONTACT_INFO.getString("contactInfo.address"))
				.build();
	}
}
