package apiModules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {
    String phone;
    String emailAddress;

    public String getPhone() {
        return phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
