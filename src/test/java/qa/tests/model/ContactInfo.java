package qa.tests.model;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

import static qa.tests.utils.PropertyUtils.PROPERTIES;

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
				.firstName(PROPERTIES.getString("contactInfo.firstName"))
				.lastName(PROPERTIES.getString("contactInfo.lastName"))
				.birthday(PROPERTIES.getString("contactInfo.birthday"))
				.address(PROPERTIES.getString("contactInfo.address"))
				.build();
	}
}
